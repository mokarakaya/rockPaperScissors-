package com.game.rockpaperscissors;

import com.game.rockpaperscissors.game.player.Player;
import com.game.rockpaperscissors.game.Scoreboard;
import com.game.rockpaperscissors.judge.Referee;
import com.game.rockpaperscissors.judge.Winner;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by 212457624 on 05.09.2016.
 */
public class GameCreator {

    private final Player playerA;
    private final Player playerB;
    private final Referee referee;

    public GameCreator(Player playerA,Player playerB){
        //since players don't have states we can use same players on games.
        this.playerA=playerA;
        this.playerB=playerB;
        this.referee=new Referee();
    }
    public Scoreboard createGames(int numberOfGames) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(numberOfGames/20);
        Scoreboard board=new Scoreboard();
        for(int i=0;i<numberOfGames;i++){
            //games don't need to start sequentially.
            Runnable worker= () -> {
                Winner winner = referee.getWinner(playerA.makeMove(), playerB.makeMove());
                board.addWinner(winner);
            };
            executor.execute(worker);
        }
        executor.shutdown();
        if (!executor.awaitTermination(10L, TimeUnit.MINUTES)) {
            System.err.println("Threads didn't finish in 10 minutes!");
            executor.shutdownNow();
        }
        return board;
    }

}

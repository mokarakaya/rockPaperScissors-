package com.game.rockpaperscissors;

import com.game.rockpaperscissors.game.GameWorkerThread;
import com.game.rockpaperscissors.game.Player;
import com.game.rockpaperscissors.game.Scoreboard;
import com.game.rockpaperscissors.strategy.PaperStrategy;
import com.game.rockpaperscissors.strategy.RandomStrategy;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by 212457624 on 05.09.2016.
 */
public class GameCreator {
    public Scoreboard createGame(int numberOfGames) throws InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(numberOfGames/20);
        Scoreboard board=new Scoreboard();
        Player playerA= new Player(new PaperStrategy());
        Player playerB= new Player(new RandomStrategy());
        for(int i=0;i<numberOfGames;i++){
            Runnable worker= new GameWorkerThread(playerA,playerB,board);
            executor.execute(worker);
        }
        executor.shutdown();
        while (!executor.awaitTermination(10L, TimeUnit.MINUTES));
        return board;
    }

}

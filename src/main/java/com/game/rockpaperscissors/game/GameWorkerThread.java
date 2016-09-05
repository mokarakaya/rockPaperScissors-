package com.game.rockpaperscissors.game;

import com.game.rockpaperscissors.judge.Referee;
import com.game.rockpaperscissors.judge.Winner;
import com.sun.jmx.mbeanserver.Repository;

/**
 * Created by 212457624 on 05.09.2016.
 */
public class GameWorkerThread implements Runnable {

    private final Player playerA;
    private final Player playerB;
    private Referee referee;
    private Scoreboard scoreboard;

    public GameWorkerThread(Player playerA, Player playerB, Scoreboard scoreboard) {
        this.playerA = playerA;
        this.playerB = playerB;
        this.scoreboard = scoreboard;
        this.referee= new Referee();
    }

    @Override
    public void run() {
        Winner winner = referee.getWinner(playerA.makeMove(), playerB.makeMove());
        scoreboard.addWinner(winner);
    }
}

package com.game.rockpaperscissors;

import com.game.rockpaperscissors.game.Scoreboard;

/**
 * Created by 212457624 on 05.09.2016.
 */
public class GameMain {
    public static void main(String[] args) throws InterruptedException {
        GameCreator gameCreator = new GameCreator();
        Scoreboard game = gameCreator.createGame(100);
        game.printResults();
    }
}

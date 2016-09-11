package com.game.rockpaperscissors;

import com.game.rockpaperscissors.game.GameCreator;
import com.game.rockpaperscissors.game.Scoreboard;
import com.game.rockpaperscissors.game.player.PlayerFactory;
import com.game.rockpaperscissors.strategy.PaperStrategy;
import com.game.rockpaperscissors.strategy.RandomStrategy;

/**
 * Created by 212457624 on 05.09.2016.
 */
public class GameMain {
    public static void main(String[] args) throws InterruptedException {
        GameCreator gameCreator = new GameCreator(PlayerFactory.getInstance().createPlayer(new PaperStrategy()),
                PlayerFactory.getInstance().createPlayer(new RandomStrategy()));
        Scoreboard game = gameCreator.createGames(100);
        game.printResults();
    }
}

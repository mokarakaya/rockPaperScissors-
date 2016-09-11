package com.game.rockpaperscissors.game.player;

import com.game.rockpaperscissors.strategy.IStrategy;

/**
 * Created by p.bell on 11.09.2016.
 */
public class PlayerFactory {
    private static PlayerFactory instance;
    private PlayerFactory()
    {

    }
    public static PlayerFactory getInstance()
    {
        if (instance == null) {
            synchronized(PlayerFactory.class) {
                if (instance == null) {
                    instance = new PlayerFactory();
                }
            }
        }
        return instance;
    }
    public Player createPlayer(IStrategy strategy) {
        return new Player(strategy);
    }
}

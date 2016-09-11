package com.game.rockpaperscissors.game.player;

import com.game.rockpaperscissors.judge.Moves;
import com.game.rockpaperscissors.strategy.IStrategy;

/**
 * Created by 212457624 on 05.09.2016.
 */
public class Player {
    private final IStrategy strategy;
    public Player(IStrategy strategy) {
        this.strategy = strategy;
    }
    public synchronized Moves makeMove(){
        return strategy.makeMove();
    }
}

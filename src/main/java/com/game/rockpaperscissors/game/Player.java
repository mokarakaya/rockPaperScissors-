package com.game.rockpaperscissors.game;

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
    public Moves makeMove(){
        return strategy.play();
    }
}

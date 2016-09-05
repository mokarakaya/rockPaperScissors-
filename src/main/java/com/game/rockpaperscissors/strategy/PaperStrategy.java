package com.game.rockpaperscissors.strategy;

import com.game.rockpaperscissors.judge.Moves;

/**
 * Created by 212457624 on 05.09.2016.
 */
public class PaperStrategy implements IStrategy {
    @Override
    public Moves play() {
        return Moves.PAPER;
    }
}

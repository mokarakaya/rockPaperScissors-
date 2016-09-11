package com.game.rockpaperscissors.strategy;

import com.game.rockpaperscissors.judge.Moves;

/**
 * Created by mokarakaya on 05.09.2016.
 */
public class PaperStrategy implements IStrategy {
    @Override
    public Moves makeMove() {
        return Moves.PAPER;
    }
}

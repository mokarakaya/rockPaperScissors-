package com.game.rockpaperscissors.strategy;

import com.game.rockpaperscissors.judge.Moves;

import java.util.Random;

/**
 * Created by mokarakaya on 05.09.2016.
 */
public class RandomStrategy implements IStrategy {

    private final Random random;
    private final Moves[] moves;

    public RandomStrategy() {
        this.random = new Random();
        this.moves = Moves.values();
    }

    @Override
    public Moves makeMove() {
        return moves[random.nextInt(moves.length)];
    }
}

package com.game.rockpaperscissors.judge;

import junit.framework.TestCase;

/**
 * Created by mokarakaya on 11.09.2016.
 */
public class RefereeTest extends TestCase {

    /**
     * test Referee
     */
    public void testReferee() {
        Referee referee= new Referee();
        assertEquals(Winner.PLAYERA,referee.getWinner(Moves.PAPER,Moves.ROCK));
        assertEquals(Winner.PLAYERA,referee.getWinner(Moves.SCISSORS,Moves.PAPER));
        assertEquals(Winner.PLAYERA,referee.getWinner(Moves.ROCK,Moves.SCISSORS));
        assertEquals(Winner.PLAYERB,referee.getWinner(Moves.SCISSORS,Moves.ROCK));
        assertEquals(Winner.PLAYERB,referee.getWinner(Moves.PAPER,Moves.SCISSORS));
        assertEquals(Winner.PLAYERB,referee.getWinner(Moves.ROCK,Moves.PAPER));
        assertEquals(Winner.TIE,referee.getWinner(Moves.PAPER,Moves.PAPER));
        assertEquals(Winner.TIE,referee.getWinner(Moves.ROCK,Moves.ROCK));
        assertEquals(Winner.TIE,referee.getWinner(Moves.SCISSORS,Moves.SCISSORS));

    }
}

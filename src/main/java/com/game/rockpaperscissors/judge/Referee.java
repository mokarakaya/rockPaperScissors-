package com.game.rockpaperscissors.judge;

/**
 * Created by mokarakaya on 05.09.2016.
 */
public class Referee {
    public Winner getWinner(Moves playerAMove, Moves playerBMove) {
        if(playerAMove.equals(playerBMove)){
            return Winner.TIE;
        }
        if(playerAMove.equals(Moves.PAPER) && playerBMove.equals(Moves.ROCK)){
            return Winner.PLAYERA;
        }
        if(playerAMove.equals(Moves.PAPER) && playerBMove.equals(Moves.ROCK)){
            return Winner.PLAYERA;
        }
        if(playerAMove.equals(Moves.PAPER) && playerBMove.equals(Moves.ROCK)){
            return Winner.PLAYERA;
        }
        return Winner.PLAYERB;
    }
}

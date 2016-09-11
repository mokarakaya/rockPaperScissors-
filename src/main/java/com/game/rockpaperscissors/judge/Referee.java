package com.game.rockpaperscissors.judge;

/**
 * Created by mokarakaya on 05.09.2016.
 */
public class Referee {
    public synchronized Winner getWinner(Moves playerAMove, Moves playerBMove) {
        if(playerAMove==null || playerBMove==null){
            throw new IllegalArgumentException("moves of players can not be null");
        }
        if(playerAMove.equals(playerBMove)){
            return Winner.TIE;
        }
        switch (playerAMove){
            case PAPER: return playerBMove.equals(Moves.ROCK) ? Winner.PLAYERA: Winner.PLAYERB;
            case ROCK: return playerBMove.equals(Moves.SCISSORS) ? Winner.PLAYERA: Winner.PLAYERB;
            case SCISSORS: return playerBMove.equals(Moves.PAPER) ? Winner.PLAYERA: Winner.PLAYERB;
        }
        throw new IllegalArgumentException("unknown condition to decide for the referee:"+playerAMove.name()+";"+playerBMove.name());
    }
}

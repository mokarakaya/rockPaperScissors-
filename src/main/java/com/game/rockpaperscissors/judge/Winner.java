package com.game.rockpaperscissors.judge;

/**
 * Created by mokarakaya on 05.09.2016.
 */
public enum Winner {
    PLAYERA("Player A"),PLAYERB("Player B"),TIE("Tie");
    private final String value;
    Winner(String value) {
        this.value=value;
    }
    public String getValue(){
        return this.value;
    }
}

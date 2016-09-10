package com.game.rockpaperscissors.game;

import com.game.rockpaperscissors.judge.Winner;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by 212457624 on 05.09.2016.
 */
public class Scoreboard {
    private volatile Map<Winner,Integer> board;
    public Scoreboard(){
        board=new ConcurrentHashMap<>();
    }
    public synchronized void addWinner(Winner winner){
        board.putIfAbsent(winner,0);
        board.put(winner,board.get(winner)+1);
    }

    public void printResults() {
        System.out.println(board.get(Winner.PLAYERA));
        System.out.println(board.get(Winner.PLAYERB));
        System.out.println(board.get(Winner.TIE));
    }
}

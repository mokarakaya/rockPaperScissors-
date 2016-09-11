package com.game.rockpaperscissors.game;

import com.game.rockpaperscissors.judge.Winner;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by mokarakaya on 05.09.2016.
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

    public synchronized void printResults() {
        int sum = board.values().stream().mapToInt(i -> i).sum();
        System.out.println(Winner.PLAYERA.getValue() +" wins "+ board.get(Winner.PLAYERA) +" of " +sum+" games");
        System.out.println(Winner.PLAYERB.getValue() +" wins "+ board.get(Winner.PLAYERB) +" of " +sum+" games");
        System.out.println(Winner.TIE.getValue()+": "+board.get(Winner.TIE)+" of " +sum+" games");
    }
    public Map<Winner,Integer> getBoard(){
        return board;
    }
}

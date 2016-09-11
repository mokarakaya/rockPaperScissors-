package com.game.rockpaperscissors.game;

import com.game.rockpaperscissors.game.player.Player;
import com.game.rockpaperscissors.game.player.PlayerFactory;
import com.game.rockpaperscissors.judge.Moves;
import com.game.rockpaperscissors.strategy.PaperStrategy;
import com.game.rockpaperscissors.strategy.RandomStrategy;
import junit.framework.TestCase;

import java.util.*;

/**
 * Created by 212457624 on 10.09.2016.
 */
public class PlayerTest extends TestCase {

    /**
     * test every moves of the player is Paper
     */
    public void testPlayerPaper() {
        Player player= PlayerFactory.getInstance().createPlayer(new PaperStrategy());
        for(int i=0;i<10;i++){
            assertEquals(Moves.PAPER,player.makeMove());
        }
    }

    /**
     * testing distribution of random move strategy player.
     */
    public void testPlayerRandom(){
        Player player=PlayerFactory.getInstance().createPlayer(new RandomStrategy());
        Map<Moves,Integer> moves = new HashMap<>();
        for(int i=0;i<100;i++){
            final Moves move = player.makeMove();
            moves.putIfAbsent(move,0);
            moves.put(move,moves.get(move)+1);
        }
        assertEquals(3,moves.size());
        moves.forEach((k,v)->{
            assertTrue(v<50);
            assertTrue(v>10);
        });
    }
}

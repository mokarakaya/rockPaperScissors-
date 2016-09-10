package com.game.rockpaperscissors.game;

import com.game.rockpaperscissors.judge.Moves;
import com.game.rockpaperscissors.strategy.PaperStrategy;
import com.game.rockpaperscissors.strategy.RandomStrategy;
import junit.framework.TestCase;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by 212457624 on 10.09.2016.
 */
public class PlayerTest extends TestCase {

    /**
     * test every moves of the player is Paper
     */
    public void testPlayerPaper() {
        Player player= new Player(new PaperStrategy());
        for(int i=0;i<10;i++){
            assertEquals(Moves.PAPER,player.makeMove());
        }
    }
    public void testPlayerRandom(){
        Player player= new Player(new RandomStrategy());
        Set<Moves> moves = new HashSet<>();
        for(int i=0;i<100;i++){
            moves.add(player.makeMove());
        }
        assertEquals(3,moves.size());
    }
}

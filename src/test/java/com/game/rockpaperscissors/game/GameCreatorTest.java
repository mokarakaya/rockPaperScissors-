package com.game.rockpaperscissors.game;

import com.game.rockpaperscissors.game.player.PlayerFactory;
import com.game.rockpaperscissors.judge.Winner;
import com.game.rockpaperscissors.strategy.PaperStrategy;
import com.game.rockpaperscissors.strategy.RandomStrategy;
import junit.framework.TestCase;

import java.util.Map;

/**
 * Created by mokarakaya on 11.09.2016.
 */
public class GameCreatorTest extends TestCase {

    /**
     * play 100 games and test results.
     * @throws InterruptedException
     */
    public void testGame() throws InterruptedException {
        GameCreator gameCreator = new GameCreator(PlayerFactory.getInstance().createPlayer(new PaperStrategy()),
                PlayerFactory.getInstance().createPlayer(new RandomStrategy()));
        Scoreboard scoreboard = gameCreator.createGames(100);
        Map<Winner, Integer> board = scoreboard.getBoard();
        assertEquals(3,board.size());
        board.forEach((k,v)->{
            assertTrue(v<50);
            assertTrue(v>10);

        });
        assertEquals(100,board.values().stream().mapToInt(i->i).sum());
    }
}

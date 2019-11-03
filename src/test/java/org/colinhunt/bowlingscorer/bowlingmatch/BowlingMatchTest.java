package org.colinhunt.bowlingscorer.bowlingmatch;

import org.colinhunt.bowlingscorer.player.Player;
import org.junit.Test;

import static org.junit.Assert.*;

public class BowlingMatchTest
{
    @Test
    public void currentPlayerReturnsPlayer1AtStart()
    {
        Player player1 = new Player("player1");
        BowlingMatch match = new BowlingMatch(player1, new Player("player2"));

        assertSame(player1, match.currentPlayer());
    }
}
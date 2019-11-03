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

    @Test
    public void currentPlayerReturnsPlayer1AfterFirstRoll()
    {
        Player player1 = new Player("player1");
        BowlingMatch match = new BowlingMatch(player1, new Player("player2"));
        match.roll(0);

        assertSame(player1, match.currentPlayer());
    }

    @Test
    public void currentPlayerReturnsPlayer2AfterSecondAndThirdRoll()
    {
        Player player1 = new Player("player1");
        Player player2 = new Player("player2");
        BowlingMatch match = new BowlingMatch(player1, player2);
        match.roll(0);
        match.roll(0);
        match.roll(0);

        assertSame(player2, match.currentPlayer());
    }

    @Test
    public void currentPlayerReturnsPlayer1AfterFourthRoll()
    {
        Player player1 = new Player("player1");
        Player player2 = new Player("player2");
        BowlingMatch match = new BowlingMatch(player1, player2);
        match.roll(0);
        match.roll(0);
        match.roll(0);
        match.roll(0);

        assertSame(player1, match.currentPlayer());
    }
}
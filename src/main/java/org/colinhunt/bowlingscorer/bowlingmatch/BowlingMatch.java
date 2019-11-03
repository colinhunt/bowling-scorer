package org.colinhunt.bowlingscorer.bowlingmatch;

import org.colinhunt.bowlingscorer.player.Player;

public class BowlingMatch
{
    private final Player player1;
    private final Player player2;

    public BowlingMatch(Player player1, Player player2)
    {

        this.player1 = player1;
        this.player2 = player2;
    }

    public boolean isOver()
    {
        return false;
    }

    public Player currentPlayer()
    {
        return player1;
    }

    public void roll(int pinsDown)
    {

    }

    public Player getWinner()
    {
        return null;
    }

    public boolean isTie()
    {
        return false;
    }
}

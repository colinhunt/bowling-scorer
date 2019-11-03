package org.colinhunt.bowlingscorer.bowlingmatch;

import org.colinhunt.bowlingscorer.player.Player;

public class BowlingMatch
{
    private Player lastPlayer;
    private Player currentPlayer;
    private int rolls = 0;


    public BowlingMatch(Player player1, Player player2)
    {
        this.currentPlayer = player1;
        this.lastPlayer = player2;
    }

    public boolean isOver()
    {
        return false;
    }

    public Player currentPlayer()
    {
        return currentPlayer;
    }

    public void roll(int pinsDown)
    {
        if (++rolls % 2 == 0)
        {
            Player nextPlayer = lastPlayer;
            lastPlayer = currentPlayer;
            currentPlayer = nextPlayer;
        }
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

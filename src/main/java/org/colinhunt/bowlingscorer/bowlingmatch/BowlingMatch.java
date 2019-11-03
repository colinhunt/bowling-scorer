package org.colinhunt.bowlingscorer.bowlingmatch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.colinhunt.bowlingscorer.player.Player;

public class BowlingMatch
{
    private final List<Player> players;
    private int rolls = 0;
    private int currentPlayerIndex = 0;

    public BowlingMatch(Player player1, Player player2)
    {
        this.players = new ArrayList<>(Arrays.asList(player1, player2));
    }

    public boolean isOver()
    {
        return false;
    }

    public Player currentPlayer()
    {
        return players.get(currentPlayerIndex);
    }

    public void roll(int pinsDown)
    {
        if (++rolls % 2 == 0)
        {
            currentPlayerIndex = (currentPlayerIndex + 1) % 2;
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

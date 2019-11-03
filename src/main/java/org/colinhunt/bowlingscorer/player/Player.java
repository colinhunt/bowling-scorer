package org.colinhunt.bowlingscorer.player;

import org.colinhunt.bowlingscorer.scorecard.ScoreCard;

public class Player
{
    private final String name;

    public Player(String name)
    {

        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public ScoreCard getScoreCard()
    {
        return null;
    }
}

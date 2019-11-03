import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.colinhunt.bowlingscorer.bowlingmatch.BowlingMatch;
import org.colinhunt.bowlingscorer.player.Frame;
import org.colinhunt.bowlingscorer.player.Player;
import org.colinhunt.bowlingscorer.player.ScoreCard;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("Welcome to bowling scorer!");
        System.out.print("Please enter player 1 name > ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String player1name = reader.readLine();
        System.out.println("Hi " + player1name);

        System.out.print("Please enter player 2 name > ");
        String player2name = reader.readLine();
        System.out.println("Hi " + player2name);

        Player player1 = new Player(player1name);
        Player player2 = new Player(player2name);

        BowlingMatch match = new BowlingMatch(player1, player2);

        while (!match.isOver())
        {
            printScoreCard(player1);
            printScoreCard(player2);

            Player currentPlayer = match.currentPlayer();
            System.out.println(String.format("It's %s's turn > ", currentPlayer.getName()));

            int pinsDown = Integer.parseInt(reader.readLine());
            match.roll(pinsDown);
        }

        if (match.isTie())
        {
            System.out.println("Both players win!");
        }
        else
        {
            System.out.println(match.getWinner() + " wins!");
        }
    }

    private static void printScoreCard(Player player)
    {
        ScoreCard scoreCard = player.getScoreCard();
        System.out.print(player.getName() + ": ");
        for (Frame frame : scoreCard.getFrames())
        {
            printFrame(frame);
        }
        System.out.println();
    }

    private static void printFrame(Frame frame)
    {
        System.out.print(String.format("|%d,%d: %d|", frame.roll1(), frame.roll2(), frame.score()));
    }
}

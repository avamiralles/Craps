
/**
 * Mimicks a game of craps
 *
 * @author Ava Miralles
 * @version 01-18-2019
 */
import java.util.Scanner;
public class Craps
{
    /**
     * 
     */
    public static boolean wannaPlay()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Wanna play craps? (y/n)");
        String result = in.nextLine();
        if (result.equals("") || result.substring(0,1).equalsIgnoreCase("y"))
        {
            //wannaPlay is true if player wishes to play
            return true;
        }
        else 
        {
            //if this is false, the game will not continue
            return false;
        }
    }

    public static void giveInstructions()
    {
        //these are the instructions for craps that you gave in the sample interactions :)
        System.out.println("1. Roll two six-sided dice.");
        System.out.println("2.a) On first roll, if you get a 7 or 11 you win!");
        System.out.println("2.b) On first roll,if you get a 2, 3, or 12 you lose!");
        System.out.println("2.c) Any other number you don't win or lose. The die roll becomes your 'point'");
        System.out.println("3. Keep rolling the dice again until:");
        System.out.println("    a) You roll the point again and win!");
        System.out.println("    b) or you roll a 7 and lose.");
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Dice dice = new Dice(); //these are the dice the person will use the whole time
        boolean win = false; 
        while (wannaPlay())
        {
            System.out.println("Let's play craps!");
            System.out.println("Do you need instructions? (y/n)");
            if (in.nextLine().equalsIgnoreCase("n"))
            {
                System.out.println("Okay, let's play!");
            }
            else
            {
                giveInstructions();
            }
            System.out.println("\nGood luck!\n");
            System.out.println("Press <Enter> to roll the dice...");
            int[] rolls = dice.rollEm(); //rolls the dice
            if (in.nextLine().equals(""))
            {
                System.out.println("You rolled: " + rolls[0] + " and " + rolls[1]);
            }
            int point = rolls[0] + rolls[1]; //this makes the if/else statements shorter
            if (point == 7 || point == 11)
            {
                System.out.println("You win! :)");
                win = true; //they won
            }
            else if (point == 2 || point == 3 || point == 12)
            {
                System.out.println("You lose. Sorry!");
                win = false; //they lost
            }
            else
            {
                win = false;
                //if they roll something else, it will enter a loop until they roll their point or a 7
                System.out.println("That's your point.");
                System.out.println("If you can roll it again before rolling a 7, you win!");
                while (!win)
                {
                    System.out.println("Press <Enter> to roll the dice...");
                    int[] roll2 = dice.rollEm();
                    if (in.nextLine().equals(""))
                    {
                        System.out.println("You rolled: " + roll2[0] + " and " + roll2[1]);
                    }
                    if ((roll2[0] + roll2[1]) == 7)
                    {
                        System.out.println("Sorry, you lose.");
                        win = true; //they lost, but this will end the loop
                    }
                    else if ((roll2[0] + roll2[1]) == point)
                    {
                        System.out.println("You win! :)");
                        win = true; // they won
                    }
                }
            }
        }
        System.out.println("Thanks for playing!");
    }
}
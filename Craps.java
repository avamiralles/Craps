
/**
 * Mimicks a game of craps
 *
 * @author Ava Miralles
 * @version 01-18-2019
 */
import java.util.Scanner;
public class Craps
{
    public static boolean wannaPlay()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Wanna play craps? (y/n)");
        String result = in.nextLine();
        if (result.equals("") || result.substring(0,1).equalsIgnoreCase("y"))
        {
            return true;
        }
        else 
        {
            return false;
        }
    }

    public static void giveInstructions()
    {
        System.out.println("1. Roll two six-sided dice.");
        System.out.println("2.a) On first roll, if you get a 7 or 11 you win!");
        System.out.println("2.b) On first roll,if you get a 2, 3, or 12 you lose!");
        System.out.println("2.c) Any other number you don't win or lose. The die roll becomes your 'point'");
        System.out.println("3. Keep rolling the dice again until:");
        System.out.println("    a) You roll the point again and win!");
        System.out.println("    b) or you roll a 7 and lose.");
        System.out.println("Good luck!");
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Dice dice = new Dice();
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
            
        }
    }
}
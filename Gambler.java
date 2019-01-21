
/**
 * Adds a gambling aspect to the craps game
 *
 * @author Ava Miralles
 * @version 01-20-2019
 */
import java.util.Scanner;
public class Gambler
{

    /**
     * Constructor for objects of class Gambler
     */
    public Gambler()
    {
        
    }

    /**
     * 
     */
    public static boolean wannaGamble()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Shall we make this a little more interesting ($$$) ? (y/n)");
        String result = in.nextLine();
        if (result.equals("") || result.substring(0,1).equalsIgnoreCase("y"))
        {
            //wannagGamble is true if player wishes to bet
            return true;
        }
        else 
        {
            //if this is false, the player does not want to bet
            return false;
        }
    }
}

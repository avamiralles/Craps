
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
     * Asks the player if they would like to play
     * 
     * @return if the person would like to play
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

    /**
     * Asks if the player would like to gamble
     * 
     * @return whether or not the player wants to gamble
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

    /**
     * Gives the instructions for craps
     */
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
        boolean gambler = false;
        //boolean gamble = false;
        int bet = 0;
        while (wannaPlay())
        {
            gambler = false;
            System.out.println("\nLet's play craps!");
            System.out.println("Do you need instructions? (y/n)");
            if (in.nextLine().equalsIgnoreCase("n"))
            {
                System.out.println("Okay, let's play!");
            }
            else
            {
                giveInstructions(); //prints instructions
            }

            if (wannaGamble()) //will ask if they want to gamble and return true or false
            {
                gambler = true; //are they a gambler or not?
                System.out.println("Double or nothing. How much do you want to risk? (enter a number)");
                bet = in.nextInt(); //this is the money they bet
                if (in.nextLine().equals("")) //if i don't have this, then it assumes the
                //enter is for the first roll and this all gets very complicated
                {
                    System.out.println("Sounds good!");
                }
            }

            System.out.println("\nGood luck!\n");
            System.out.println("Press <Enter> to roll the dice...");
            int[] rolls = dice.rollEm(); //rolls the dice
            String[] rollvis = dice.showEm();
            if (in.nextLine().equals(""))
            {
                System.out.println("You rolled: " + rolls[0] + " and " + rolls[1]);
            }
            System.out.println(rollvis[0] + rollvis[1]);
            int point = rolls[0] + rolls[1]; //this makes the if/else statements shorter
            if (point == 7 || point == 11)
            {
                System.out.println("You win! :)");
                win = true; //they won
                if (gambler) //will only print this if they wanted to gamble
                {
                    System.out.println("You won $" + (bet * 2) + "!!!!!"); //returns the bet doubled!
                }
            }
            else if (point == 2 || point == 3 || point == 12)
            {
                System.out.println("You lose. Sorry!");
                win = false; //they lost
                if (gambler)
                {
                    System.out.println("You get $0."); //they get nothing
                }
            }
            else //this is what happens if the player rolls a 4, 5, 6, 8, 9, or 10
            {
                win = false; //they haven't won yet
                //if they roll something else, it will enter a loop until they roll their point or a 7
                System.out.println("Your point is " + point + ".");
                System.out.println("If you can roll it again before rolling a 7, you win!");
                while (!win) //makes it so that until there's a conclusion (win or lose) they can keep rolling
                {
                    System.out.println("Press <Enter> to roll the dice...");
                    int[] roll2 = dice.rollEm();
                    String[] rollvis2 = dice.showEm();
                    if (in.nextLine().equals(""))
                    {
                        System.out.println("You rolled: " + roll2[0] + " and " + roll2[1]);
                        //prints their new rolls
                    }
                    System.out.println(rollvis2[0] + rollvis2[1]);
                    if ((roll2[0] + roll2[1]) == 7)
                    {
                        System.out.println("Sorry, you lose.");
                        if (gambler)
                        {
                            System.out.println("You get $0.");
                        }
                        win = true; //technically they lost, but this will end the loop
                    }
                    else if ((roll2[0] + roll2[1]) == point)
                    {
                        System.out.println("You win! :)");
                        if (gambler)
                        {
                            System.out.println("You won $" + (bet * 2) + "!!!!!");
                        }
                        win = true; // they won
                    }   
                }
            }
        }
        System.out.println("Have a nice day!"); //end of program! phew :)
    }
}
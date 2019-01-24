
/**
 * Deals with two die objects
 *
 * @author Ava Miralles
 * @version 01-18-2019
 */
public class Dice
{
    private Die d1;
    private Die d2;
    private int[] rolls;
    /**
     * Constructor for objects of class Dice
     */
    public Dice()
    {
        // initialise instance variables
        int[] rolls = new int[2];
        String[] rollvis = new String[2];
        d1 = new Die();
        d2 = new Die();
    }

    /**
     * Rolls two dice.
     *
     * @return    the two rolls from the two dice
     */
    public int[] rollEm()
    {
        int[] rolls = {d1.roll(), d2.roll()};
        return rolls;
    }
    /**
     * Shows the dice.
     * 
     * @return a drawing of the two dice rolls
     */
    public String[] showEm()
    {
        String[] rollvis = {d1.toString(), d2.toString()};
        return rollvis;
    }
}

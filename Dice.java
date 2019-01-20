
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
        d1 = new Die();
        d2 = new Die();
    }

    /**
     * Rolls two dice.
     *
     * @return    the sum of rolling two dice
     */
    public int[] rollEm()
    {
        int[] rolls = {d1.roll(), d2.roll()};
        return rolls;
    }
}

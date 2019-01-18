
/**
 * Creates a die and rolls
 *
 * @author Ava Miralles
 * @version 01-18-2019
 */
public class Die
{
    private int roll;
    
    /**
     * Constructor for objects of class Die
     */
    public Die()
    {
        roll = roll();
    }

    /**
     * Rolls a die
     *
     * @return    a random roll from 1-6
     */
    public int roll()
        {
            roll = (int) (Math.random() * 6 + 1);
            return roll;
    }
}

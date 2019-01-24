
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

    /**
     * Prints a visual representation of a die
     * 
     * @return a string that looks like the die roll
     */
    public String toString()
    {
        String die = "+---------+\n|";
        if (roll == 1)
        {
            die += "         |\n|    *    |\n|         |";
        }
        else if (roll == 2)
        {
            die += " *       |\n|         |\n|       * |";
        }
        else if (roll == 3)
        {
            die += " *       |\n|    *    |\n|       * |";
        }
        else if (roll == 4)
        {
            die += " *     * |\n|         |\n| *     * |";
        }
        else if (roll == 5)
        {
            die += " *     * |\n|    *    |\n| *     * |";
        }
        else if (roll == 6)
        {
            die += " *     * |\n| *     * |\n| *     * |";
        }
            die += "\n+---------+\n\n";
            return die;
        }
    }

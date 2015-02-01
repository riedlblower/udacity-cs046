// BlueJ project: lesson6/counting_matches
// unit6.2-14
import java.util.Scanner;
public class CountingMatches
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int counter = 0;

        // TODO: Prompt the user for a value until they enter Q
        // count how many times the user enters a negative number
        // using the variable counter

        System.out.print("Enter a value, Q to quit: " );

        while (in.hasNextDouble())
        {
            double value = in.nextDouble();
            if (value<0)
            {
                counter++;
            }
            System.out.print("Enter a value, Q to quit: ");
        }
        System.out.println("The water line fell on " + counter + " years.");
    }
}
//======================================
// Bluej project: lesson6/counting_matches_digits
// unit6.2-15
/**
 * A class that represents a number and can report
 * properties of the number.
 */
public class Number
{
    private long number;

    public Number(long number)
    {
        this.number = number;
    }

    /**
     * Returns the number of times digitToMatch appears
     * in this number.
     * @param digitToMatch the digit to search for.
     *   must be at least 0 and at most 9.
     * @return number of occurrences of digitToMatch
     */
    public int countMatchingDigits(int digitToMatch)
    {
        // TODO: count and return the number of times the given digit appears in the number
        // Hint: The last digit is (int)(numbers % 10).
        int numberOfOccurances = 0;
        long mainNumber = number;
        while (mainNumber>0)
        {
            int remainder = (int)(mainNumber % 10);
            mainNumber = mainNumber / 10;
            if (remainder == digitToMatch)
            {
                numberOfOccurances++;
            }
        }
        return numberOfOccurances;
    }
}
//======================================

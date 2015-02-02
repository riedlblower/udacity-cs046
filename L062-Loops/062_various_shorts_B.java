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
// unit6.2-15/16
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
// Bluej project: finding_the_first_match
// unit6.2-16/17
// Write a program that finds the first word in Alice In Wonderland
// that is longer than a given number of characters.

import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class FirstMatch
{
    public static void main(String[] args) throws java.io.FileNotFoundException
    {
        // TODO: Write a loop that searches for long words
        // (more than THRESHOLD letters)
        // The loop should stop if you find one or if you run out of words
        Scanner in = new Scanner(new FileReader("aliceInWonderland.txt"));
        String longWord = "";
        boolean found = false;
        final int THRESHOLD = 9;
        String nextWord = "";
        while (!found && in.hasNext())
        {
                nextWord = in.next();
                if (nextWord.length() > THRESHOLD)
                {
                    longWord = nextWord;
                    found = true;
                }
        }
        System.out.println("The first long word is: " + longWord);
    }
}
//======================================

// Bluej project: lesson6/first_match_no_long_words
// Write a program that finds the first word in Alice In Wonderland
// that is longer than 60 characters, and if there are no words
// that long, prints "There are no long words".
// unit6.2-18/19

import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class FirstMatch
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner in = new Scanner(new FileReader("aliceInWonderland.txt"));
        String longWord = "";
        boolean found = false;

        final int THRESHOLD = 60;

        while (in.hasNext() && !found)
        {
            String word = in.next();
            if (word.length() > THRESHOLD)
            {
                longWord = word;
                found = true;
            }
        }
        // TODO: if there are no long words, print
        // "There are no long words"
        // instead of
        // "The first long word is: " ...
        if (longWord.equals(""))
        {
            System.out.println("There are no long words");
        }
        else
        {
            System.out.println("The first long word is: " + longWord);
        }
    }
}
//======================================

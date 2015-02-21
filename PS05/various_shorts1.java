//
// Complete the code below to print each letter in the string name followed by a space.
// 
//
public class StringTester
{
   public static void main(String[] args)
   {
       String name = "Udacity";
       int length = name.length();
       for (int i = 0; i < length; i++)
       {
           System.out.print(name.substring(i,i+1) + " ");
       }
   }
}
//===============================================================
//
// Complete the method to return the product of
// all the numbers 1 to the parameter n (inclusive)
//

public class MathUtil
{
   public int product(int n)
   {
       int result = 1;
       for (int i = 1; i <=n; i++)
       {
           result = result * i;
       }
       return result;
   }
}
//===============================================================
//
// Complete the method to return the number of non-vowels in the parameter
// Assume the vowels are  a,e,i,o,u or A, E, I, O, U
//

public class Word
{
    /**
     * Gets the number of non-vowels in the parameter
     * @param word the string to count the non-vowels in
     * @return the number of non-vowels in the word
     */
    public int nonVowelCount(String word)
    {
        int nonVowelCount = 0;
        int length = word.length();
        for (int i = 0; i < length; i++)
        {
            String letter = word.substring(i,i+1);
            if (!"aeiouAEIOU".contains(letter))
            {
                nonVowelCount++;
            }
        }
        return nonVowelCount;
    }
}
//===============================================================
//
// TODO Write code to get a number in the range of 1 to 10
// HINT: You need to use a do while loop.
// HINT: You will need to import the Scanner class and create a Scanner object to use to get input from the user
//

import java.util.Scanner;

public class InputWithDo
{
    /*
     * Gets a number betwwen 1 and 10 (inclusive) from the user
     * @return user input between 1 and 10 (inclusive)
     */
    public int getValidInput()
    {
        Scanner in = new Scanner(System.in);
        int value; // A user entered value between 0 and 10 inclusive.
        do
        {
            System.out.print("Enter an integer >=1 and <=10: ");
            value = in.nextInt();
        }
        while (value > 10 || value < 1);
        return value;
    }
}
//===============================================================
// hw05_11
//
// Complete this method to read integer scores from the user and find the average
// Stop asking for input when the user enters a negative number.
//
// Keep a running total and keep track of the number of entries
// then find and return the average
//
// Be sure not to divide by 0. Return 0 if no scores are entered
//

import java.util.Scanner;
public class MathUtil
{
    public double averageScore()
    {
        Scanner in = new Scanner(System.in);
        int score; // A user entered score
        int runningTotal = 0;
        int count = 0;
        do
        {
            System.out.print("Enter a score. -1 to quit: ");
            score = in.nextInt();
            runningTotal = runningTotal + score;
            count++;
        }
        while (score > -1);
        return (runningTotal/count);
    }
}
//===============================================================

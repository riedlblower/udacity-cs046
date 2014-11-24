==========================================

/**
 * Complete the method to return true if the parameter is between 0 and 100,
 * inclusive of both 0 and 100
 */
    public boolean inRange(int value)
    {
        if ((value>=0) && (value<=100)){
            return true;
        }
        else {
            return false;
        }
    }
}
==========================================
/**
 * Complete the method to return true if the parameter comes after "Udacity" in
 * lexicographic order
 */
    public boolean comesAfter(String string1)
    {
        if (string1.compareTo("Udacity") > 0){
            return true;
        }
        else {
            return false;
        }
    }
==========================================

/**
 *
 * Complete this method to determine if the string parameter instructor is the same as
 * your Udacity instructor, Cay Horstmann
 */
   public boolean isMyInstructor(String instructor)
   {
       //fullName contains Cay Horstmann
       String fullName = firstName + " " + lastName;
       // your code goes here
        if (instructor.compareTo(fullName) == 0){
            return true;
        }
        else {
            return false;
        }
   }
==========================================
/**
 * Complete the method to determine if the parameter month is one of the summer
 * months, "June", "July", "August" Use a compound if
 */
public class Month
{
   /**
    * determine if the parameter is one of the summer
    * months, "June", "July", "August"
    * @param month the month to test
    * @return true if month is "June", "July" or "August"
    */
   public boolean isSummer(String month)
   {
       if (month.equals("June") || month.equals("July") || month.equals("August")) {
           return true;
       }
       else{
           return false;
       }
   }
}
==========================================

/**
 * Complete the method to find the largest power of 2 less than the given number
 * Use a loop
 */
public class MathUtil
{
   public int largestPowerOf2(int n)
   {
       double i = 1.0;      
       while (Math.pow(2,i) < n){
           i++;
       }
       double res = Math.pow(2,i-1);
       return (int)res;
   }
}
==========================================

public class Sum
{
   /**
    * Gets the sum of all the even numbers less than or equal to the given number
    * @param n the given number, the ceiling
    * @return the sum of all the even numbers less that the ceiling
    */
   public int sum(int n)
   {
       int i = 0;
       int sum = 0;
       while (i <= n) {
           if (i % 2 == 0){
               sum = sum + i;
           }
           i++;
       }
       return sum;           
   }
}
==========================================

//hw04_20
/**
 * Complete the class. Using a Scanner, ask the user to enter a series of integers
 * and count the number of even numbers
 * Use a loop. Do not let bad input (a non-integer) terminate your program with an error.
 * When the user enters any non-integer, print the number of even integers entered and quit.
 * Hint: remember hasNextInt()
 * Hint: use the % operator to determine if a number is even
 */
import java.util.Scanner;
public class CountEvenTester
{
   public static void main(String[] args)
   {
       System.out.print("Enter an integer: ");
       Scanner in = new Scanner(System.in);
       int sum = 0;
       while (in.hasNextInt())
       {
           int num = in.nextInt();
           if (num%2 == 0){
               sum++; 
           }
           System.out.print("Enter an integer: ");
       }
       System.out.print(sum);
   }
}
==========================================

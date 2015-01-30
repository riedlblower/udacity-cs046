// unit6.2-3
// TODO: Change this program so that it accepts values between 0 and
// 100 inclusive. Remember to change the prompt as well.

import java.util.Scanner;

public class InputValidation
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int value; // A user entered value between 0 and 100 inclusive.
        do
        {
            System.out.print("Enter an integer between 0 and 100 inclusive: ");
            value = in.nextInt();
        }
        while (value > 100 || value < 0);

        System.out.println("Thank you for entering " + value);
    }
}

//======================================
// unit6.2-6
import java.util.Scanner;
// Write a program that helps a user compute their average time
// for sprinting 100 meters.
public class AverageDemo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int count = 0;
        double sum = 0;
        double value = 0;
        boolean done;

        // TODO: Collect values from the user until they enter a 0.
        // Track the sum of all the inputs so you can calculate the
        // average at the end
        done = false;
        while (!done)
        {
            System.out.print("Enter a value, 0 to quit: ");
            value = in.nextDouble();
            if (value != 0) {
                    sum += value;
                    count = count + 1;
            }
            else {
                done = true;
            }
        }
            
        double average = sum / count;
        System.out.printf("Average: %.2f\n", average);
    }
}
//======================================
// unit6.2-7
import java.util.Scanner;

// TODO: Update your method average() so that it can accept
// altitudes (which can be positive, negative or zero).
// Use Q as a sentinel value instead of 0.
// Use the scanner method hasNextDouble to control your loop.
// Remember to change the prompt.
public class Average
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double value;
        int count = 0;
        double sum = 0;

        System.out.print("Enter a value, Q to quit: ");

        while (in.hasNextDouble())
        {
            value = in.nextDouble();
            sum = sum + value;
            count++;
            System.out.print("Enter a value, Q to quit: ");
        }
        double average = sum / count;
        System.out.printf("Average: %.2f\n", average);
    }
}
//======================================
import java.util.Scanner;
// unit6.2-9
// Update your program so that the user supplies at least
// one input.
// Use Q as a sentinel value.
// Start prompting for the sentinel value after the first input.
// If the user doesn't provide even the first input, print Error: No input
public class Average
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int count = 0;
        double sum = 0;
        System.out.print("Enter a value: ");
        while (in.hasNextDouble())
        {
            double value = in.nextDouble();
            sum = sum + value;
            count++;
            System.out.print("Enter a value, Q to quit: ");
        }
        if (count==0)
        {
            System.out.printf("Error: No input");
        }
        else
        {
            double average = sum / count;
            System.out.printf("Average: %.2f\n", average);
        }
    }
}

//======================================
// unit6.2-10

import java.util.Scanner;
public class Largest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter values, Q to quit: ");
        double largest = in.nextDouble();
        while (in.hasNextDouble())
        {
            double input = in.nextDouble();
            if (input > largest)
            {
                largest=input;
            }
        }
        System.out.println("Largest value: " + largest);
    }
}
//======================================
// unit6.2-11

// Read in the values from the file input.txt, stopping
// at the end of the file (or if the file contains
// an input that is not a number). Print out the largest
// value that you read.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Largest2
{
    public static void main(String[] args)
    throws FileNotFoundException
    {
        String filename = "input.txt"; // please don't change this line
        // ... create a file object that uses filename as a argument 
        File inputFile = new File(filename);
        // ... with that object we construct a scanner
        Scanner in = new Scanner(inputFile);

        double largest = in.nextDouble();
        while (in.hasNextDouble())
        {
            double input = in.nextDouble();
            if (input > largest)
            {
                largest = input;
            }
        }
        System.out.println("Largest value: " + largest);
    }
}
//======================================
// Bluej project: lesson6/largest_countries
// unit6.2-12

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class LargestCountries
{
    public static void main(String[] args) throws FileNotFoundException
    {
        String filename = "population.txt";
        File inputFile = new File(filename);
        Scanner in = new Scanner(inputFile);

        String country = in.next();
        double population = in.nextDouble();
        double largest = population;
        String largest_country = "";

        // TODO: Print the population and name of the country with largest population

        // HINT: What else do you need to remember?
        // What variable(s) should you add so you can
        // print the population and the country name at the end?
        while (in.hasNext())
        {
            country = in.next();
            population = in.nextDouble();
            if (population > largest)
            {
                largest = population;
                largest_country = country;
            }
        }
        System.out.println("The country with the largest population is " + largest_country);
        System.out.println("The largest population is " + largest);
    }
}

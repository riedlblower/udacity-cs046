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

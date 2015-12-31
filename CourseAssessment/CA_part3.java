Course Assessment Part 3 (Intro to Java Programming)

===============================

25. Arraylist Algorithms

//
// RectangleList class manages a list of Rectangles from the graphics package
// you have used this semester

// RectangleList has a no-argument constructor that simply initializes the
// instance variable
// It has a method to add Rectangles to the list
//These are provided for you
//
// It has a method to return the Rectangle with the largest perimeter
// (or null if the list is empty)
//You are to complete the largestPerimeter method.
//
// perimeter = 2 * (width + height)
//
// This class uses the Rectangle class from the graphics package. It has
// getWidth() and getHeight() methods
//
// There is a tester included to help you test your code.
//
//
import java.util.ArrayList;

public class RectangleList
{
    // private instance variables
    ArrayList<Rectangle> list;

    /**
     * Constructs a Rectangle list to manage a list of Rectangles
     */
    public RectangleList()
    {
        list = new ArrayList<Rectangle>();;
    }

    /**
     *
     * Adds a Rectangle to the list
     * @param r the rectangle to add
     */
    public void add(Rectangle r)
    {
        list.add(r);
    }

    /**
     * Gets the Rectangle with the largest perimeter
     * @return the rectangle with the largest perimeter or null if
     * there are no rectangles
     *
     */
    public Rectangle largestPerimeter()
    {
        if (list.isEmpty())
        {
            return null;
        }

        Rectangle largest = list.get(0);
            
        for (Rectangle rec : list)
        {
            int largestPerimeter = 2 * (largest.getWidth() + largest.getHeight());
            int recPerimeter = 2 * (rec.getWidth() + rec.getHeight());
            if (recPerimeter > largestPerimeter) 
            {
                largest = rec;
            }
        }
        return largest;
    }
}

===============================
26. Decay Rate

//developed by Cay Horstmann
// You are provided with a class, Substance, that represents a radioactive substance that
// decays at a uniform rate over time. Do not make any changes in that class.
// Just check the javadoc to see how to use the methods.
//
// The class has a method decayOneYear which simulates the decay after one year.
// The mass will be reduced by the appropriate amount each time the method is called.
//
// The class has a getMass method that returns the current mass of the substance.
//
// The DecayRunner class is started for you. It gets the initial mass and the rate of decay
// from the keyboard - as a percentage value (5% is entered as 5) And creates a Substance object
//
// You are to complete the main method so that it prints the mass at the end of each year
// to two decimal points. You can use printf format specifier "%.2f\n"
// Stop when the current mass is less than half the original mass of the substance
// And print the number of years taken to reach that mass
//
// Here is a sample runn
//Enter the initial mass: 100.0
//Enter the rate of decay as a percent: 5.0
//95.00
//90.25
//85.74
//81.45
//77.38
//73.51
//69.83
//66.34
//63.02
//59.87
//56.88
//54.04
//51.33
//48.77
//14
//

import java.util.Scanner;
/**
 * This application assumes a well-behaved user who always
 * enters valid data
 */
public class DecayRunner
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the initial mass: ");
        double mass = in.nextDouble();
        System.out.print("Enter the rate of decay as a percent: ");
        double decayRate = in.nextDouble();

        Substance stuff = new Substance(mass, decayRate);

        // TODO:  prints the mass at the end of each year
        // to two decimal points. You can use printf format specifier "%.2f\n"
        // Stop when the current mass is less than half the original mass of the substance
        // TODO:  print the number of years it takes to reach that mass
        double initialMass = stuff.getMass();
        int years = 0;
        while (stuff.getMass() > (initialMass / 2))
        {
            stuff.decayOneYear();
            System.out.printf("%.2f\n", stuff.getMass());
            years++;
        }
        System.out.println(years);
    }
}

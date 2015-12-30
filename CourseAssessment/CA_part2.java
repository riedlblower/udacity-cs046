Course Assessment Part 2 (Intro to Java Programming)

17. StaticPrinter.java

// There is a static method called getTip in the
// Finance class already written for you.
//
// You are to complete the statement double tip ...
// to call the static getTip method
// You can ignore the rest of the method.
// It gets a value from the user and prints
//
// DO NOT instantiate a Finance object. 
// You will get no credit for that. Call the method in a static manner

import java.util.Scanner;

public class StaticPrinter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the cost of the dinner: ");
        double cost = in.nextDouble();
        
        // TODO: call the static method getTip in the Finance class
        double tip = Finance.getTip(cost);
        System.out.printf("\n%.2f",tip);
    }
}

Finance.java
public class Finance
{
    public static double getTip(double costOfDinner)
    {
        final double TIP_RATE = .2;
        return costOfDinner * TIP_RATE;
    }
}

=============================
18. Is X or Z

// My favorite letters are x and z.
//
// Complete the isXOrZ method to determine
// if a word contains either x or z. 
//
// Ignore case, So if the word contains:
// X, x, Z, or z
// return true.
//
// Otherwise return false

public class WordUtil
{
   /**
    * Determines if the string contains either x or z
    * @param text the string to test for x or z
    * @return true if the string contains x or z, ignoring case.
    *  Otherwise false
    */
    public  boolean isXOrZ(String text)
    {
        String lower = text.toLowerCase();
        boolean found = false;
        int i = 0;

        // TODO: complete the loop header
        String test = "XZxz";
        while (i < lower.length())
        {
            String letter = lower.substring(i, i +1);
            // TODO: complete the loop to determine if 
            // lower contains x or z
            if (test.contains(letter))
            {
                found = true;
            }
            i++;
        }
        return found;
    }
}
=============================
19. Spanish Nouns
 
//In Spanish, nouns that end with "a" are feminine while words that end in "o" are masculine.
//(We will ignore exceptions in this exercise). Feminine nouns are preceded by the article
//"la" while maculine words are preceded by the article "el"
//You are to complete the method fixNoun in the SpanishWord class so
//that it returns the noun preceded by:
//  "la " if the noun ends in "a",
//  "el " if it ends in "o"
//  "? " if it ends in some other letter.

//Examples:
//fixNoun(cara) returns: la cara
//fixNoun(ojo) returns: el ojo
//fixNoun(nariz) returns: ? nariz

//(Notice the space between the la and cara, el and ojo, and ? and nariz)

//Hint: Think about how to get the last character of a String and then think about how
// to compare strings

//If you are a Spanish speaker, please ignore any error in this simplified explanation.
//and just follow the directions to return the required string.

public class SpanishNouns
{
    /**
     * Gets the noun with the proper article
     * @param noun the word to fix
     * @return the string with the proper article if the name ends in "a" or "o"
     * otherwise preceded by "? "
     */
    public String fixNoun(String noun)
    {
        String result = "";
        String[] addition = {"la ", "el ", "? "};
        String lastletter = noun.substring(noun.length() - 1);
        switch (lastletter)
        {
            case "a": result = addition[0] + noun; break;
            case "o": result = addition[1] + noun; break;
            default: result = addition[2] + noun; break;
        }
        return result;
    }
}
=============================
20. El Solid

// On the planet Vegas, a storage vessel has an unusual shape. It is el shaped and
// called an el-solid. Look at the image at this link.
// http://i.imgur.com/luiAm6O.png
//   
// The  yellow cube has a side of x
// The red retangle has dimensions of 2x, x, and x
// The volume is the shape is volume rectangle + volume cube
// (2x)(x)(x) + x^3 = 3x^3
// (Don't spend time trying to figure this out. Just use the formula.)
//
// Complete the El_Solid class.
// An El_Solid has a constructor that takes the height of the cube (x in the diagram) as a
// parameter.
// It has a method volume that returns the volume of this el-solid.
// It has a method increaseX that increases the value of x by a given amount - The shape always
// maintains the same proportions.

public class El_Solid
{
    // instance variables - replace the example below with your own
    private double x;

    /**
     * Constructor for objects of class El_Solid
     * @param side the side of the cube part of the shape
     */
    public El_Solid(double side)
    {
        x = side;
    }

    /**
     * Gets the volume of this el-shpae
     * @return the volume
     */
    public double volume()
    {
       // TODO: complete the method
        return 3 * Math.pow(x,3);
    }

    /**
     * Increase the side of the cube part of the el-shape by the given delta
     * @delta the amount be which to increase the side (a double)
     */
    public void increaseX(double delta)
    {
       // TODO: complete the method
        x = x + delta;
    }
}
=============================
21. Temperature
// In a galaxy far, far away, there is a planet Java. Javans also have two
// scales for measuring temperature. The Lee and the Tansey.

// 50 degrees Lee (L) = 0 degrees Tansey (T)
// 210 degrees Lee (L) = 100 degrees Tansey (T)

//The formula for converting from Lee to Tansey is
// T = 5/8(L - 50)

//Complete this class. It creates a Scanner and asks the user to enter a temperature  in Lee
// then convert the temperature to Tansey and print it.

//Sample run:
//Enter temperature 210
//100.000

//Hint: Remember how integer division works.

import java.util.Scanner;
public class TemperatureConversion
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter temperature in degrees Lee: ");

        // TODO: get the temperature in degrees Lee
        // TODO: apply the formula to get degrees Tansey
        // TODO: print the temeperature in Tansey with 3 decimal points
        double LeeValue = in.nextDouble();
        double TanseyValue = ((LeeValue - 50) * 5) / 8.0;
        System.out.printf("%.3f", TanseyValue);
    }
}

=============================
22. Rectangle List

// RectangleList class manages a list of Rectangles
// It has a constructor that takes an array list of Rectangles as a parameter.
// It has a method to return the Rectangle with the smallest area
// (or null if the list is empty)
//
// The class is started for you. You are to complete the class.
//
// This class uses the Rectangle class from the graphics package.
// It has the getWidth() and getHeight() methods
//
// There is a tester included to help you test your code.

import java.util.ArrayList;

public class RectangleList
{
    // private instance variables
    ArrayList<Rectangle> list = new ArrayList<Rectangle>();

   /**
    * Constructs a Rectangle list to manage this list of Rectangles
    * @param theList the lest of Rectangles to manage
    */
    public RectangleList(ArrayList<Rectangle> theList)
    {
        list = theList;
    }

   /**
    * Gets the Rectangle with the smallest area
    * @return the rectangle with the smallest area or null if
    * there are no rectangles
    *
    */
    public Rectangle smallestArea()
    {
        //TODO: implement this method
        if (list.isEmpty())
        {
            return null;
        }
        
        Rectangle smallest = list.get(0);

        for (Rectangle rec : list)
        {
            int smallest_area = smallest.getHeight() * smallest.getWidth();
            int rec_area = rec.getHeight() * rec.getWidth();
            if (rec_area < smallest_area) 
            {
                smallest = rec;
            }
        }
        return smallest;
    }
}
=============================

// BlueJ project: lesson6/nested
// unit6.2-21
// The x- and y- positions of the rectangles should start at
// 0, WIDTH, 2 * WIDTH, and so on.
// The colors should start at 0, end up at 255, and grow in
// equal increments.

public class Colors
{
    public static void main(String[] args)
    {
        final int WIDTH = 30;
        final int ROWS = 16;
        final int COLUMNS = 16;

        for (int i = 0; i < ROWS; i++)
        {
            for (int j = 0; j < COLUMNS; j++)
            {
                int x = i * WIDTH;
                int y = j * WIDTH;
                Rectangle rect = new Rectangle(x, y, WIDTH - 1, WIDTH - 1); //'-1' to leave gap between rectangles
                int blue = i * 255/(COLUMNS-1);
                int green = j * 255/(ROWS-1);
                Color fillColor = new Color(0, green, blue);
                rect.setColor(fillColor);
                rect.fill();
            }
        }
    }
}
//======================================
// lesson6/clock-times
// unit6.2-22
//
// Write code that prints a table of all the possible times a digital
// clock can show. The clock only shows hours and minutes. 
// print the table this way : 
// 1:00 2:00 3:00 4:00 5:00 6:00 7:00 8:00 9:00 10:00 11:00 12:00 
// 1:01 2:01 3:01 4:01 5:01 6:01 7:01 8:01 9:01 10:01 11:01 12:01 
// 1:02 2:02 3:02 4:02 5:02 6:02 7:02 8:02 9:02 10:02 11:02 12:02 
// 1:03 2:03 3:03 4:03 5:03 6:03 7:03 8:03 9:03 10:03 11:03 12:03 
// 1:04 2:04 3:04 4:04 5:04 6:04 7:04 8:04 9:04 10:04 11:04 12:04 
// 1:05 2:05 3:05 4:05 5:05 6:05 7:05 8:05 9:05 10:05 11:05 12:05 
// ...
// 1:59 2:59 3:59 4:59 5:59 6:59 7:59 8:59 9:59 10:59 11:59 12:59 
public class ClockTimes
{
    public static void main(String[] args)
    {
        for (int minute = 0; minute < 60; minute++)
        {
            // YOUR CODE HERE
            // Use nested loops to count through all the hours 
            // and all the minutes, and print formatted strings. 
            // Hint: use %02d to print single digit numbers with 
            // a leading zero. The 0 means "zero-padded" check out
            // the fact sheet from lesson 4 to read about more 
            // formattingoptions. 
            for (int hour = 1; hour <= 12; hour++)
            {
                System.out.printf("%d:%02d ", hour, minute);
            }
        System.out.println();
        }
    }
}
//======================================
// lesson6/triangle_pattern
// unit6.2-22
//
// Write nested loops that make the following pattern of brackets
// (Use the numberOfRows variable so it can easily be modified
// to print any number of rows): 
// []
// [][]
// [][][]
// [][][][]
// [][][][][]

// If numberOfRows were 6, the pattern would be: 
// []
// [][]
// [][][]
// [][][][]
// [][][][][]
// [][][][][][]
public class TrianglePattern
{
    public static void main(String[] args)
    {
        // Please do not modify this line. 
        int numberOfRows = 5;
            for (int i = 0; i < numberOfRows; i++)
            {
                for (int j = 0; j <= i; j++)
                {
                    System.out.printf("[]");
                }
                System.out.println();
            }
    }
}
//======================================
// BlueJ project: lesson6/telescope
// unit6.2-24

// Your task is to color all pixels black that are outside the
// telescope circle. The center and radius of the circle are
// given below.

// For each point, find out the distance to the center and
// check if it is larger than the radius.

// Hint: The distance between two points (x1, y1) and (x2, y2) is
// Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2))

public class Center
{
    public static void main(String[] args)
    {
        Picture pic = new Picture();
        pic.load("queen-mary.png");
        pic.draw();

        double centerX = pic.getWidth() / 2;
        double centerY = pic.getHeight() / 2;
        double radius = pic.getHeight() / 4;

        for (int x = 0; x < pic.getWidth(); x++)
        {
            for (int y = 0; y < pic.getHeight(); y++)
            {
                double distance = Math.sqrt((x - centerX) * (x - centerX) + (y - centerY) * (y - centerY));
                if (distance > radius)
                {
                    pic.setColorAt(x, y, Color.BLACK);
                }
            }
        }
    }
}

//======================================
// BlueJ project: lesson6/dice
// unit6.2-25

// In the cast method, call the nextInt method and return a
// random value between 1 and sides

import java.util.Random;

/**
   This class models a die that, when cast, lands on a random
   face.
*/
public class Die
{
    private Random generator;
    private int sides;

    /**
       Constructs a die with a given number of sides.
       @param s the number of sides, e.g. 6 for a normal die
    */
    public Die(int s)
    {
        sides = s;
        final int SEED = 42;
        generator = new Random(SEED);
    }

    /**
       Simulates a throw of the die
       @return the face of the die
    */
    public int cast()
    {
        // TODO: Complete this method
        return generator.nextInt(sides) + 1;
    }
}
//======================================
// BlueJ project: lesson6/darts
// unit6.2-26

// Generate a random floating-point number and transform it so
// that it is between -1 and 1. Store in x. Repeat for y.
// Check that (x, y) is in the unit circle, that is, the distance
// between (0, 0) and (x, y) is <= 1.

// Hint: The distance between two points (x1, y1) and (x2, y2) is
// Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2))

import java.util.Random;
import java.util.Scanner;

/**
   This program computes an estimate of pi by simulating dart throws onto a square.
*/
public class MonteCarlo
{
    public static void main(String[] args)
    {
        System.out.println("Number of tries");
        Random generator = new Random(42);
        Scanner in = new Scanner(System.in);
        int tries = in.nextInt();

        int hits = 0;
        for (int i = 1; i <= tries; i++)
        {
            // Generate two random numbers between -1 and 1
            double x = 2 * generator.nextDouble() - 1;
            double y = 2 * generator.nextDouble() - 1;

            // Check whether the point lies in the unit circle
            double distance = Math.sqrt((x * x) + (y * y));
            if ((1 - distance) >= 0)
            {
                hits++;
            }
        }

        /*
           The ratio hits / tries is approximately the same as the ratio
           circle area / square area = pi / 4
        */

        double piEstimate = 4.0 * hits / tries;
        System.out.println("Estimate for pi: " + piEstimate);
    }
}
//======================================
// lesson6/throwing_a_die
// unit6.2-27
//
// A program that simulates tossing a die 100 times. 
// It prints the number of times you roll a 6. 
import java.util.Random;

public class ThrowingADie
{
    public static void main(String[] args)
    {
        // This line nitializes the generator and gives it 42 as a "seed." 
        // The generator will generate a sequence of numbers that
        // look random, but if you create another generator and seed 
        // it with 42, it will generate the same sequence. 
        Random generator = new Random(42);
        int count = 0;
        int rolled_dice;
        // YOUR CODE HERE
        // Use a loop to roll a die 100 times. 
        // Count how many sixes you see, and print the number of
        // 6's at the end. 
        // Hint: if you're not sure how to simulate rolling a die, 
        // check out the fact sheet on generating random numbers. 
        for (int i = 1; i <= 100; i++)
        {
            rolled_dice = generator.nextInt(6) + 1;
            if (rolled_dice == 6)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
//======================================

// lesson6/chevalier_de_mere
// unit6.2-28

import java.util.Random;

public class DiceGame
{
    Random generator;
    
    public DiceGame()
    {   
        generator = new Random(45);
    }
    /** 
     * Throw a die four times and bet on at least one 6. 
     * @return true if the chevalier wins. 
     */
    public boolean game1()
    {
        boolean game1_result = false;
        for (int i = 1; i <= 4; i++)
        {
            int rolled_dice = generator.nextInt(6) + 1;
            if (rolled_dice == 6)
            {
                game1_result = true;
            }
        }
        return game1_result;            
    }
    
    /**
     * Throw two dice 24 times and bet on at least one double-six.
     * @return true if the chevalier wins. 
     */
    public boolean game2()
    {   
        boolean game2_result = false;
        for (int i = 1; i <= 24; i++)
        {
            int rolled_dice1 = generator.nextInt(6) + 1;
            int rolled_dice2 = generator.nextInt(6) + 1;
            if ((rolled_dice1 == 6) && (rolled_dice2 == 6))
                {
                    game2_result = true;
                }
        }
        return game2_result;
    }
}
//======================================
// BlueJ Project: lesson6/BuffonPiExperiment
// unit6.2-29
//
// Estimates pi using the Compte de Buffon's needle dropping method
// Take a 1 inch needle. Repeatedly drop it on a sheet of
// ruled paper whose lines are 2 inches apart 
// tries / hits = an approximation of pi

import java.util.Random;
import java.util.Scanner;

public class BuffonPiEstimation
{
    public static void main(String[] args) 
    {
        System.out.println("Buffon Pi Estimation");
        System.out.println("Enter the number of tries: ");
        Scanner in = new Scanner(System.in);
        int tries = in.nextInt();

        Random generator = new Random(42);
        // YOUR CODE HERE
        // Calculate the number of hits. 
        // generate a yLow, the lowest point, or the farthest point on 
        // the needle from the line (a number between 0 and 2).
        // generate a random angle a between 0 and 180 degrees. 
        // yHigh is yLow plus the sine of a. 
        // if yHigh is above the line (the line is at a height of 2), 
        // the needle is touching the line, and counts as a hit.
        // Hint: Math.sin takes an angle in radians. 
        double piEstimate;
        int numberHits = 0;

        for (int index = 0; index < tries; index++)
        {
            double yLow = 2 * generator.nextDouble();
            double a = 180 * generator.nextDouble();
            double radians = Math.toRadians(a);
            double yHigh = yLow + Math.sin(radians);
            if (yHigh > 2)
            {
                numberHits = numberHits+1;
            }
        }
        
        piEstimate = (1.0 * tries) / numberHits;
        System.out.println();
        System.out.println(piEstimate);
    }   
}
//======================================

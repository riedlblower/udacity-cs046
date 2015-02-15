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

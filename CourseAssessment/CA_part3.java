Course Assessment Part 3 (Intro to Java Programming)

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

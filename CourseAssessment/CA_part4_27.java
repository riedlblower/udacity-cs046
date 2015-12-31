Course Assessment Part 4 (Intro to Java Programming)

Question 27 Udacity Rectangle (there are three java files here)

===============================

27A. UdacityRectangle.java

// The Rectangle in the graphics package we have been using in  
// this course is limited because it cannot calculate its area.
//
// Create a class UdacityRectagle that extends Rectangle and
// adds an area() method which returns an int
//
// This class will not need to provide any new instance variables,
// but it will need a constructor which takes x, y corordinates and
// width and height. Write this in the space indicated below.
// 
// A RectangleDemo class is included on a different tab. This may give you some hints.

public class UdacityRectangle extends Rectangle
{
    // Write your code for the constructor and the area() method here. 
    public UdacityRectangle(int x, int y, int width, int height)
    {
        // Instead of setting the variables separately, you can call Constructor of the superclass 
        //(the call to the superclass constructor should be on the first line of your subclass constructor)
        super(x, y, width, height); 
    }
    
    /**
     * Gets the area of the rectangle
     * @return the area of rectangle
     */
    public int area()
    {
        return getWidth() * getHeight();
    }
}


===============================

27B. RectangleDemo.java

import java.util.Scanner;
public class RectangleDemo
{
    public static void main(String[] args)
    {
        UdacityRectangle box = new UdacityRectangle(20, 30, 70, 50);
        int area = box.area();
        System.out.println(area);
        
        box.grow(5, 10);
        int area2 = box.area();
        System.out.println(area2);
    }

}

===============================

27C. Rectangle.java

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class Rectangle implements Shape
{
    private Color color = Color.BLACK;
    private boolean filled = false;
    private double x;
    private double y;
    private double width;
    private double height;

    /**
       Constructs an empty rectangle.
    */
    public Rectangle()
    {
        x = 0;
        y = 0;
        width = 0;
        height = 0;
    }       

    /**
       Constructs a rectangle.
       @param x the leftmost x-coordinate
       @param y the topmost y-coordinate
       @param width the width
       @param height the height
    */
    public Rectangle(double x, double y, double width, double height)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    /**
       Gets the leftmost x-position of this rectangle.
       @return the leftmost x-position
    */
    public int getX()
    {
        return (int) Math.round(x);
    }

    /**
       Gets the topmost y-position of this rectangle.
       @return the topmost y-position
    */
    public int getY()
    {
        return (int) Math.round(y);
    }

    /**
       Gets the width of this rectangle.
       @return the width
    */    
    public int getWidth()
    {
        return (int) Math.round(width);
    }

    /**
       Gets the height of this rectangle.
       @return the height
    */    
    public int getHeight()
    {
        return (int) Math.round(height);
    }

    /**
       Moves this rectangle by a given amount.
       @param dx the amount by which to move in x-direction
       @param dy the amount by which to move in y-direction
    */
    public void translate(double dx, double dy)
    {
        x += dx;
        y += dy;
        Canvas.getInstance().repaint();
    }

    /**
       Resizes this rectangle both horizontally and vertically.
       @param dw the amount by which to resize the width on each side
       @param dw the amount by which to resize the height on each side
    */
    public void grow(double dw, double dh)
    {
        width += 2 * dw;
        height += 2 * dh;
        x -= dw;
        y -= dh;
        Canvas.getInstance().repaint();
    }

    /**
       Sets the color of this rectangle.
       @param newColor the new color
    */
    public void setColor(Color newColor)
    {
        color = newColor;
        Canvas.getInstance().repaint();
    }

    /**
       Draws this rectangle.
    */
    public void draw()
    {
        filled = false;
        Canvas.getInstance().show(this);
    }

    /**
       Fills this rectangle.
    */
    public void fill()
    {
        filled = true;
        Canvas.getInstance().show(this);
    }

    public String toString()
    {
        return "Rectangle[x=" + getX() + ",y=" + getY() + ",width=" + getWidth() + ",height=" + getHeight() + "]";
    }

    public void paintShape(Graphics2D g2)
    {
        Rectangle2D.Double rect = new Rectangle2D.Double(getX(), getY(),
                getWidth(), getHeight());
        g2.setColor(new java.awt.Color((int) color.getRed(), (int) color.getGreen(), (int) color.getBlue()));
        if (filled)
        {
            g2.fill(rect);
        }
        else
        {
            g2.draw(rect);
        }
    }
}


===============================

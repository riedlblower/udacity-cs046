//Create a Polygon class. A polygon is a closed shape with lines joining the corner points.
//You will keep the points in an array list. Use object of java.awt.Point for the point.

//Polygon will have as an instance variable an ArrayList of Points to hold the points
//The constructor takes no parameters but initializes the instance variable
//
//The add method adds a Point to the polygon
//
//The perimeter method returns the perimeter of the polygon
//
//The draw method draws the polygon by connecting consecutive points and then
//connecting the last point to the first.

import java.util.ArrayList;
import java.awt.Point;
public class Polygon
{
    // TODO: provide the required constructor, instance variable, and methods
    
    // Add an instance variable
    ArrayList<Point> polygon;
    
    // Initialise the instance variable by constucting an empty polygon
    public Polygon()
    {
        polygon = new ArrayList<Point>();
    }
    
    // add a point to the polygon
    // @param point the point to add
    public void add(Point point)
    {
        polygon.add(point);
    }
    
    // returns the perimeter of the polygon
    // @return the perimeter of the polygon
    public double perimeter()
    {
        double x0, y0, x1, y1;
        double perimeter = 0;
        if (polygon.size() < 2)
        {
            return 0;
        }
        //measure length between first and last points first
        Point first = polygon.get(polygon.size()-1);
        for (int i = 0; i <= polygon.size()-1; i++)
        {
            Point second = polygon.get(i);
            x0 = second.getX();
            y0 = second.getY();
            x1 = first.getX();
            y1 = first.getY();
            perimeter = perimeter + Math.sqrt(Math.pow((x0 - x1),2) + Math.pow((y0 - y1),2));
            first = second;
        }
        return perimeter;
    }
    
    // draws the polygon, line by line
    public void draw()
    {
        double x0, y0, x1, y1;
        Line line;
        Point first = polygon.get(polygon.size()-1);
        for (int i = 0; i <= polygon.size()-1; i++)
        {
            Point second = polygon.get(i);
            x0 = second.getX();
            y0 = second.getY();
            x1 = first.getX();
            y1 = first.getY();
            //Try swapping the beginning and end points in the lne. There is some weird issue 
            //with drawing the diagonal where it matters if you draw from top to bottom or bottom to top.
            line = new Line(x1,y1,x0,y0);
            line.draw();
            first = second;
        }

    }
}

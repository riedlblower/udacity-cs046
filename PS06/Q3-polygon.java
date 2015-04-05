import java.util.ArrayList;
import java.awt.Point;
public class Polygon
{
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
        Point second = polygon.get(polygon.size()-1);
        for (int i = 0; i <= polygon.size()-1; i++)
        {
            Point first = polygon.get(i);
            x0 = first.getX();
            y0 = first.getY();
            x1 = second.getX();
            y1 = second.getY();
            perimeter = perimeter + Math.sqrt(Math.pow((x0 - x1),2) + Math.pow((y0 - y1),2));
            second = first;
        }
        return perimeter;
    }
    
    // draws the polygon
    public void draw()
    {
    }
}

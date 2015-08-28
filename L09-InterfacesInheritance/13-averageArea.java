// BlueJ project: lesson9/measure1

public class Data
{
    /**
       Computes the average area of the given countries.
       @param objects an array of Country objects
       @return the average of the areas
    */
    public static double average(Country[] objects)
    {
        // TODO: Compute the average area
        double sum = 0;
        double totalArea = 0;
        for (Country obj : objects)
        {
            totalArea = totalArea + obj.getArea();
            sum = sum + 1;
        }
        if (sum==0) { return 0; }
        else { return totalArea / sum; }
    }
}

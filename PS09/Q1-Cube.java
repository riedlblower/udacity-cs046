// formulas for surface area and volume
// http://math2.org/math/geometry/areasvols.htm
//
// TODO: complete the code so that Cube implements the GeometricSolid interface
//
public class Cube implements GeometricSolid
{
    private double side;

    public Cube(double s)
    {
        side = s;
    }

    public double getVolume()
    {
        double volume;
        volume = side * side * side;
        return volume;
    }
    
    public double getSurfaceArea()
    {
        double surfaceArea;
        surfaceArea = 6 * side * side;
        return surfaceArea;
    }

}

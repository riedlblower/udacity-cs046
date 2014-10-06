   public class YardCalculator
{
   public static final double METERS_PER_FOOT = 0.3048;
   private double length;
   private double width;
   
   /**
    * Constructs a YardCalculator with the given parameters
    * @param theLength the length of the yard
    * @param theWidth the width of the yard
    */
   public YardCalculator(double theLength, double theWidth)
   {
       this.length = theLength * METERS_PER_FOOT;
       this.width = theWidth * METERS_PER_FOOT;
   }

   /**
    * Gets the perimeter of the yard
    * @return the perimeter
    */
   public double perimeter()
   {
       return ((length * 2) + (width * 2));
   }

   /**
    * Gets the area of the yard
    * @return the area
    */
   public double area()
   {
       return (length * width);
   }

    /**
    * Gets the diagonal of the yard
    * @return the diagonal
    */
   public double diagonal()
   {
       return   Math.sqrt( Math.pow(width,2) + Math.pow(length,2));
  }
}

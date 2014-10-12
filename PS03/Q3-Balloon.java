/**
 * models a spherical balloon that is being filled with air
 */

public class Balloon
{
        private double volume;
        private double radius;

        /**
        * Constructs an empty balloon
        */
        public Balloon()
        {
           this.volume = 0;
           this.radius = 0;
        }

        /**
        @amount add a given amount of air to the balloon
        */
        public void addAir(double amount)
        {
            volume = volume + amount;
            radius = Math.pow((3.0 * volume) / (4 * Math.PI),1.0/3);
        }

        /**
        returns the current volume of the balloon
        */
        public double getVolume()
        {
            return volume;
        }
    
        /**
        returns the current surface area of the balloon
        */
        public double getSurfaceArea()
        {
            return (4.0 * Math.PI * Math.pow(radius,2));
        }
    
        /**
        returns the current radius of the balloon
        */
        public double getRadius()
        {
            return radius;
        }
}

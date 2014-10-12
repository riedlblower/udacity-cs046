import java.util.Scanner;

public class MileagePrinter
{
    private static final double COST_PER_GALLON = 3.95;
   
    public static void main(String[] args)
    {
        System.out.print("Enter the number of gallons of gas in the tank ");
        Scanner in = new Scanner(System.in);
        double gallons = Double.parseDouble(in.nextLine());
        System.out.print("Enter the fuel efficiency ");
        double efficiency = Double.parseDouble(in.nextLine());

        if (efficiency <= 0) {
            System.out.printf("No can go");
        } else {
            double distance = gallons * efficiency;
            double cost = COST_PER_GALLON * 100.0 / efficiency;
            System.out.printf("Distance: %5.1f\n", distance); 
            System.out.printf("Cost: %5.2f\n", cost);
        }        
    }
}

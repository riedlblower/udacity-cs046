/**
 * Exercises the methods in the Month class
 */
import java.util.Scanner;
public class MonthPrinter
{
   public static void main(String[] args)
   {
       Scanner in = new Scanner(System.in);
       System.out.print("Enter a month number (1 through 12) " );

        if (in.hasNextInt() == true) {
            int monthNumber = in.nextInt();
            if (monthNumber > 12 || monthNumber < 1){
                System.out.println("Number must be 1 through 12");
            }
            else {
                Month myMonth = new Month(monthNumber);
                System.out.printf("%s %d", myMonth.getMonthName(), myMonth.getNumberOfDays());
            }
        }
        else {
            System.out.println("Not an integer. Terminating");
        }    
    }
}

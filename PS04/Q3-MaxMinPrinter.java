//Write a class called MinMaxPrinter. Using a Scanner, ask the user to enter
//a series of integers and find the maximum and the minimum value.
//Use a loop.

import java.util.Scanner;
public class MaxMinPrinter
{
   public static void main(String[] args)
   {
       Scanner in = new Scanner(System.in);
       int max = Integer.MIN_VALUE;    //-2147483648   (int)
       int min = Integer.MAX_VALUE;    // 2147483647   (int)

       System.out.print("Enter an integer: ");

       while (in.hasNextInt())
       {
           int number = in.nextInt();
           if(number > max){
               max = number;
           } 
           if (number < min){
               min = number;
           }
           System.out.print("Enter an integer: ");
       }
       System.out.println(max);
       System.out.println(min);
   }
}

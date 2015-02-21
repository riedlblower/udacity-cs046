//
// Complete the code below to print each letter in the string name followed by a space.
// 
//
public class StringTester
{
   public static void main(String[] args)
   {
       String name = "Udacity";
       int length = name.length();
       for (int i = 0; i < length; i++)
       {
           System.out.print(name.substring(i,i+1) + " ");
       }
   }
}
//===============================================================
//
// Complete the method to return the product of
// all the numbers 1 to the parameter n (inclusive)
//

public class MathUtil
{
   public int product(int n)
   {
       int result = 1;
       for (int i = 1; i <=n; i++)
       {
           result = result * i;
       }
       return result;
   }
}
//===============================================================


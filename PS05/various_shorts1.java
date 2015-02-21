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
//
// Complete the method to return the number of non-vowels in the parameter
// Assume the vowels are  a,e,i,o,u or A, E, I, O, U
//

public class Word
{
    /**
     * Gets the number of non-vowels in the parameter
     * @param word the string to count the non-vowels in
     * @return the number of non-vowels in the word
     */
    public int nonVowelCount(String word)
    {
        int nonVowelCount = 0;
        int length = word.length();
        for (int i = 0; i < length; i++)
        {
            String letter = word.substring(i,i+1);
            if (!"aeiouAEIOU".contains(letter))
            {
                nonVowelCount++;
            }
        }
        return nonVowelCount;
    }
}
//===============================================================


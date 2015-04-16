1. Write the code to declare an array of doubles called prices

double[] prices;

2. Complete the statement to create an array of ints called scores that can hold 50 ints

int[] scores = new int[50];

3. double[] temperatures = new double[12];
=> this array can hold 12 elements and 12 is the length of the array.

4. double[] temperatures = new double[12];
=> initial value at index 5 is 0.0

5. double[] temperatures = new double[12];
print out the element at index 9.

System.out.println(temperatures[9]);

6. Write the statement to assign 95 to the first element of an int array scores

scores[0] = 95;

7. Complete the code to initialise an array containing the prime numbers less than 10.

int[] primes = {2,3,5,7};

8. double[] temperatures = new double[12];
=> the indeces range from 0 to 11.

9. You have an int array variable scores  of unknown length.
Complete the code to get the length of the array. You can assume the scores is not null.

int length = scores.length;

10. Write code to assign 98 to the last element of the array "scores". scores is of unknown length.
scores[scores.length-1] = 98;
 
11. Print the first element of an array "scores" of unknown length.
System.out.println(scores[0]);
 
===========================================================
16.
// Complete the method in this class. It returns a string with the elements of the array
// in reverse order separated by a space. If the array looks like this [1, 2 ,3 ,4], your
// output will look like this 4 3 2 1
public class ArrayUtil
{
  /**
   * Returns a string with the elements of the array in reverse order separated by a space
   * @param values the array to reverse
   * @return the string containing the elements in reverse order
   */
  public String inReverse(int[] values)
  {
      String message ="";
      for ( int value : values) //finish the loop header
      {
          // TODO: concatenate the elements to message in reverse order
          message = String.valueOf(value) + " " + message;
      }
      return message;
  }
}

===========================================================
17.
// Complete this method to return the number of zeros in the int array
// parameter, values
public class Util
{
    public int getCount(int[] values)
    {
        int count = 0;
        for (int current : values)
        {
            // TODO: count the number of zeros in values
            if (current == 0)
            {
                count++;
            }
        
        }
        return count;
    }
}

===========================================================











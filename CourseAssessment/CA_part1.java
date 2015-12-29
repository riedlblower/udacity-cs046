Course Assessment Part 1 (Intro to Java Programming)

1. Complete the line of code to fine the length of a String name
int length = name.length();

2. Complete the code to get ta substring of the String name which contains just the first letter
String first = name.substring(0,1);

3. Complete the code to get an uppercase version of the String name
String upper = name.toUpperCase();

4. You need to declare your instance variables as private so that they can only be accessed by 
methods of the same class. And not by methods of other classes.

5. How do add in description of a method when returning a variable
/** Gets the perimeter of this Circle object
* @return the perimeter
*/

6. answer = none of the above

7. Write the code to declare volume as a local variable of type double and then initialize it to 0
double volume = 0;

8. Write the code to declare an integer constant HOURS_PER_DAY in a METHOD. Initialise it to 24
final int HOURS_PER_DAY = 24;

9. Complete the if statement to test if an int variable score is exactly equal to 90.
if (score == 90)

10. The grade for score is: 89 B; 90 B; 91 A.

11. 
4	0	0	false
4	1	4	false
4	2	3	false
4		0	true
return value = 2

12. 
6	0	0	false
6	1	6	false
6	2	5	false
6	3	2	false
6	3	-3	true
return values = -1

====================================
13. 
// This Matrix class has a contructor that has already been completed for you.
//
// It takes a int[][] as a parameter and saves it in
// the instance variable, matrix.
//
// Your task is to complete the numberOfColumns method
// to return the number of columns in the matrix

public class Matrix
{
    private int[][] matrix;

    /**
     * Constructor for objects of class Matrix
     * @param array a 2-d array
     */
    public Matrix(int[][] array)
    {
       matrix = array;
    }


    /**
     * Gets the number of columns
     * @return the number of columns
     */
    public int numberOfColumns()
    {
        // TODO: get the number of columns
        int cols = matrix[0].length;
        return cols;
    }
====================================
14.
// This Matrix class has a contructor that has already been completed for you.
// It takes a int[][] as a parameter and saves it in the instance variable, matrix
// Your task is to complete the numberOfRows method to return the number of rows in the
// matrix

public class Matrix
{
    private int[][] matrix;

    /**
     * Constructor for objects of class Matrix
     * @param array a 2-d array
     */
    public Matrix(int[][] array)
    {
        matrix = array;
    }

    /**
     * gets the number of rows
     * @return the number of rows
     */
    public int numberOfRows()
    {
        int rows = matrix.length;
        return rows;
    }
}

====================================
15.
// This Matrix class has a contructor that has already been completed for you.
// It takes a int[][] as a parameter and saves it in the instance variable, matrix
// Your task is to complete the setLast method to set the value of the element in the
// last column of the last row.

public class Matrix
{
    private int[][] matrix;

    /**
     * Constructor for objects of class Matrix
     * @param array a 2-d array
     */
    public Matrix(int[][] array)
    {
        matrix = array;
    }


    /**
     * Sets the value of the element in the last column of the last row
     * @param value the value to set
     */
    public void setLast(int value)
    {
        //TODO: Set the value of the element in the last column of the last row to the parameter value
        int rows = matrix.length;
        int cols = matrix[0].length;
        matrix[rows-1][cols-1] = value;
    }

    public int[] getLastRow()
    {
        return matrix[matrix.length - 1];
    }

}
====================================
16.
// This Matrix class has a contructor that has already
// been completed for you.
// It takes a int[][] as a parameter and saves it in
// the instance variable, matrix.
//
// Your task is to complete the sumOfEvenNumbers method
// to calculate and return the sum of all the even numbers in the array.
//
// Note that this is talking about the values themselves
// which are even and not about even indexes

public class Matrix
{
    private int[][] matrix;

    /**
     * Constructor for objects of class Matrix
     * @param array a 2-d array
     */
    public Matrix(int[][] array)
    {
        matrix = array;
    }


    /**
     * Gets the sum of all the even numbers in the matrix
     * @return the sum of all the even numbers
     */
    public int sumOfEvenNumbers()
    {
         // TODO: Return the sum of all the numbers which are even
        int sum = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++)
            {
                for (int j = 0; j < cols; j++)
                {
                    if (matrix[i][j] % 2 == 0)
                    {
                        sum = sum + matrix[i][j];
                    }
                }
            }
        return sum;
    }
}
====================================

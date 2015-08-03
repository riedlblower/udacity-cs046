1. Declare and instantiate a two dimensional array of ints with 4 rows and 5 columns.

int [][] numbers = new int[4][5];

2. Put 10 in the first column of the first row in a two dimensional array of ints.

matrix[0][0] = 10;

3. Find the number of rows in the array.

int rows = matrix.length;

4. Find the number of columns in the array.

int columns = matrix[0].length

5. Put 54 into the last column of the last row of the matrix.

matrix[matrix.length-1][matrix[0].length-1] = 54;

6. Print out the last entry of the last row of the matrix.

System.out.println(matrix[matrix.length-1][matrix[0][length-1]);

========================================================
7.// Complete this method to print a 2D array of ints in column and row format.
// Use printf with a format specifier of "%6d"
//     System.out.printf("%6d", ...);
// We will assume that none of the arrays the method is asked to print will
//have values greater than 999. You will need to use nested loops.
//
// Notice that the method is static. That is because it does not work on the
//instance variables of the class. It gets all its data as parameters

public class ArrayUtil
{
    /**
     * Prints the given 2D array in columns and rows
     * @param the array to print
     */
    public static void print2D(int[][] matrix)
    {
        // TODO: Complete this method to print a 2D array of ints in column and row format.
        int rows = matrix.length;
        int columns = matrix[0].length;
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                System.out.printf("%6d", matrix[i][j]);
            }
            System.out.println();
            
        }
    }

}

========================================================
8.
// Complete the method to fill a 2D array of Strings with all X's ("X")
// Use nested loops
//
// Note that the method is static. It does not use the instance variables of
//the class. It gets all the information it needs as a parameter

public class ArrayUtil
{
     /**
     * Fills the given 2D array with X's ("X").
     * @param the array to fill
     */
    public static void fill2D(String[][] matrix)
    {
        // TODO:  Complete the method to fill a 2D array of Strings with all X's ("X")
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[0].length; j++)
            {
                matrix[i][j] = String.valueOf('X');
            }
        }
    }
}
========================================================
9. A 'static' method is not invoked on any object.

10. An 'instance' method is invoked on a specific instance of a class
========================================================


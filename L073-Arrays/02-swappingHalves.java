// BlueJ project: lesson7/swapHalves

import java.util.Arrays;

public class SwapHalves
{
    public static void main(String[] args)
    {
        int[] elements = { 1, 4, 9, 7, 3, 2, 5, 11, 0, 9 };

        // TODO: Swap the first and second half
        int j,saved;
        int halfsize = elements.length/2;
        for (int i = 0; i < halfsize; i++)
        {
            j = i + halfsize;
            saved = elements[i];
            elements[i] = elements[j];
            elements[j] = saved;
        }
        
        // Print all elements
        System.out.println(Arrays.toString(elements));
    }
}

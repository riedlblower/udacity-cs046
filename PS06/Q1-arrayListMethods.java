//
//Complete the class ArrayListMethods. It consists of four short methods to manipulate an array list of strings.
//The method header and javadoc are given to you.
//
// Need help starting this question? In the lesson titled 
// "Starting points: Problem Set Questions", go to the
// problem titled "Problem Set 6 - Question 1" for some tips on 
// how to begin.
//

import java.util.ArrayList;
public class ArrayListMethods
{
    ArrayList<String> list; //instance variable
    /**
     * Constructor for objects of class ArrayListMethods
     */
    public ArrayListMethods(ArrayList<String> arrayList)
    {
        // initialise instance variables
        list = arrayList;
    }

    /**
     * Determines if the array list is sorted (do not sort)
     * When Strings are sorted, they are in alphabetical order
     * Use the compareTo method to determine which string comes first
     * You can look at the String compareTo method in the Java API
     * @return true if the array list is sorted else false.
     */
    public boolean isSorted()
    {
        // TODO: Determine if the array is sorted.
        boolean sorted = true;
        int length = list.size();
        for (int index=0; index < length-1; index++)
        {
            for (int i = index+1; i < length; i++)
            {
                if (list.get(index).compareTo(list.get(i)) > 0)
                {
                    sorted = false;
                }
            }
        }
        return sorted;
    }

    /**
     * Replaces all but the first and last elements with the larger of its two neighbors
     * You can use the compareTo() method to determine which string is larger (larger in alphabetical
     * order).
     * Example: if the list is originally
     *    ["cat", "ape", "dog", "horse", "zebra"]
     * after this method it should be: 
     *    ["cat", "dog", "horse", "zebra", "zebra"]
     */
    public void replaceWithLargerNeighbor()
    {
        // TODO: Replace all but the first and last elements with the larger of its to neighbors
        for (int i = 1; i < list.size()-1; i++)
        {
            if (list.get(i).compareTo(list.get(i-1)) < 0)
            {
                list.set(i,list.get(i-1));
            }
            if (list.get(i).compareTo(list.get(i+1)) < 0)
            {
                list.set(i,list.get(i+1));
            }
        }
    }

    /**
     * Gets the number of duplicates in the list.
     * Be careful to only count each duplicate once. Start at index 0. (Does it match any of the other elements?)
     * Get the next word. It is at index i. (Does it match any of the words with index > i?)
     * @return the number of duplicate words in the list
     */
    public int countDuplicates()
    {
        // TODO: Write the code to get the number of duplicates in the list
        int duplicates = 0;
        for (int index = 0; index < list.size()-1; index++)
        {
            for (int i=index+1; i < list.size(); i++)
            {
                if (list.get(index).equals(list.get(i)))
                    {
                        duplicates++;
                    }
            }
        }
        return duplicates;
    }

     /**
     * Moves any word that starts with x, y, or z to the front of the ArrayList, but
     * otherwise preserves the order
     * Example: if the list is orginially
     *   ["ape", "dog", "xantus", "zebra", "cat", "yak"]
     * after this method is called it should be
     *   ["xantus", "zebra", "yak", "ape", "dog", "cat"]
     */
    public void xyzToFront()
    {
        int insertAt = 0;
        // TODO:  Move any word that starts with x, y, or z to the front of the ArrayList, but otherwise preserves the order
        int length = list.size();
        for (int index=0; index <= length-1; index++)
        {
            if("xyzXYZ".contains(list.get(index).substring(0,1)))
            {
//                list.add(insertAt,list.get(index));
//                list.remove(index+1);
                list.add(insertAt,list.remove(index));
                insertAt++;
            }
        }
    }

    /**
     * gets the string representation of this array list
     * @returns the string representation of this array list in
     * standard collection format
     */
    public String toString()
    {
        return list.toString();
    }
}

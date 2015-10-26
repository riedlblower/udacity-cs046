1. declare and instantiate and ArrayList of Colors objects using the Color class;

ArrayList<Color> palette = new ArrayList<Color>();

left hand side: declares that palette is a reference to an ArrayList object. 
right hand side: creates (instantiates) an ArrayList object and returns a reference. 

Note the following from from Lesson 9 Video 24 
[start]
public class ChoiceQuestion extends Question
{
    // TODO: Add an ArrayList<String> instance variable to hold the choices
    private ArrayList<String> choices;
    
    /**
       Constructs a choice question with no choices.
    */
    public ChoiceQuestion()
    {
        // TODO: Initialize the list of choices
        choices = new ArrayList<String>();
    }
    :
}
[end]

2. add Color.Red to the ArrayList

palette.add(Color.RED);

3. get last element in ArrayList of 9 colors;

Color color = palette.get(8);

==================================================
4. 
//
// Complete the given class to display the picture object vertically
// (rather than horizontally).
// You can find the pictures required in the bluej project
// Place the first picture so that the top of the picture is 10 pixels below 
// the top of the canvas and put 10 pixels between the pictures

import java.util.ArrayList;

public class ListOfVerticalPictures
{
   public static void main(String[] args)
   {
      ArrayList<Picture> gallery = new ArrayList<Picture>();
      gallery.add(new Picture("degas1.jpg"));
      gallery.add(new Picture("gaugin1.jpg"));
      gallery.add(new Picture("monet1.jpg"));
      gallery.add(new Picture("monet2.jpg"));
      gallery.add(new Picture("renoir1.jpg"));

      // your code goes here
      // TODO Write the code to display the pictures vertically
        int height = 0;
        for (Picture pic : gallery)
        {      
            height = height + 10;
            pic.translate(0,height);
            height = pic.getMaxY();
            pic.draw();
        }
   }
}

==================================================
5. get size of array list named palette

int size = palette.size()

6. get last element

Color color = palette.get(palette.size()-1);

==================================================
7.
//
// Complete the given class to shift the first picture (the one at index 0)
// to the end of the array list and  display the pictures object in the modified list
// horizontally as was done in the lesson.  Put 10 pixels between pictures.
// You can find the pictures required in in the bluej project
//

import java.util.ArrayList;

public class ShiftFirstToEnd
{
   public static void main(String[] args)
   {
      ArrayList<Picture> gallery = new ArrayList<Picture>();
      gallery.add(new Picture("degas1.jpg"));
      gallery.add(new Picture("gaugin1.jpg"));
      gallery.add(new Picture("monet1.jpg"));
      gallery.add(new Picture("monet2.jpg"));
      gallery.add(new Picture("renoir1.jpg"));

        gallery.add(gallery.get(0));
        gallery.remove(0);
        int width = 0;
        for (Picture pic : gallery)
        {      
            width = width + 10;
            pic.translate(width,0);
            width = pic.getMaxX();
            pic.draw();
        }
   }
}
==================================================
8. Complete the given class to display the last picture in the array list

gallery.get(gallery.size()-1).draw();

9. Find index of next to last element in an array list named palette.
int index = palette.size()-2;

==================================================
11.
// Complete this class to do the following.
// 1. Define and create an ArrayList of Strings called animals
// 2. Add the string "ape"
// 3. Add the string "dog"
// 4. Add the string "horse"
// 5. print the arraylist

import java.util.Scanner;

import java.util.ArrayList;
public class AddTester
{
   public static void main(String[] args)
   {
       // TODO: Define and create an ArrayList of Strings called animals
       ArrayList<String> animals = new ArrayList<String>();

       // TODO: Add the strings "ape", "dog", "horse"
       animals.add("ape");
       animals.add("dog");
       animals.add("horse");

       System.out.println(animals);
       System.out.println("Expected: [ape, dog, horse]");
   }
}
==================================================
12.
// Complete this class. An array list of Strings called cities has been defined
// for you and partially populated. Add code to do the following:
// 1. Add the string "New York so that it is first in the arraylist
// 2. replace the string "Dallas" (should be at index 2. Don't search) with "Houston"
// 3. remove last element in the list
// 4. print the arraylist

import java.util.ArrayList;
public class ArrayListMethodTester
{
   public static void main(String[] args)
   {
       ArrayList<String> cities = new ArrayList<String>();
       cities.add("Chicago");
       cities.add("Dallas");
       cities.add("San Jose");
       cities.add("Seattle");

       // TODO: Add code for steps 1-4 above
       cities.add(0,"New York");
       cities.remove("Dallas");
       cities.add(2,"Houston");
       cities.remove(cities.get(cities.size()-1));
       // TODO: Print the arraylist
       System.out.println(cities);
       System.out.println("Expected: [New York, Chicago, Houston, San Jose]");
   }
}
==================================================
13.
// Complete this class. An array list of Strings called cities has been defined
// for you and populated
// You are to print the elements, one to a line (please use a for loop)
// Afterwards, print the element at index 2

import java.util.ArrayList;
public class GetAndLoopDemo
{
   public static void main(String[] args)
   {
       ArrayList<String> cities = new ArrayList<String>();
       cities.add("Chicago");
       cities.add("Dallas");
       cities.add("San Jose");
       cities.add("Seattle");

       // TODO: Use a loop to print the elements one to a line
       for (String city : cities)
        {
           System.out.println(city);
        }
       // TODO: Print the element at index 2
       System.out.println(cities.get(2));
   }
}
==================================================
14.
// Complete the method in this class to find the average length of the words in an
// array list of strings and return it. The average length of words is sometimes used
// as a simple measure of reading difficulty.
import java.util.ArrayList;
public class StringArrays
{
   public double averageCountPerWord(ArrayList<String> words)
   {
       double average = 0;
       double count = 0.0; //defined as double so we do double division
       double length = 0;

       // TODO: Find the total number of characters in all the words
       for (String word : words)
       {
           length = length + word.length();
           count = count + 1;
       }

       // TODO: Calculate the average
       if (count > 0) //supply the condition
       {
          //your code here
           average = length / count;
       }

       return average;
    }
}
==================================================
15.
// Complete the method in this class to compute and return the shortest string
// (the one with the fewest characters)
// HINT: You can use the ArrayList algorithm for finding the minimum
import java.util.ArrayList;
public class StringArrayUtil
{
   public String shortestString(ArrayList<String> words)
   {
      // TODO: initialize the string to the hold the shortest string
      String shortest = words.get(0); //initialize
      int shortestLength = shortest.length();

      // TODO: Write the code to find the shortest string
       for (String word : words)
       {
           int length = word.length();
           if (length < shortestLength)
           {
               shortestLength = length;
               shortest = word;
           }
       }
      return shortest;
   }
}
==================================================
16.
// Complete the method in the class to print the elements in the array list in reverse order,
// one to a line.
import java.util.ArrayList;
public class ReversePrinter
{
   /**
    * prints the array list in reverse order, one to a line
    * @param text the array list to print
    */
    public void reversePrint(ArrayList<String> text)
    {
        // TODO: Write the code to print the elements in the array list in reverse order, one to a line.
        int length = text.size();
        for (int i = length-1; i >= 0; i--)
        {
            System.out.println(text.get(i));
        }
    }
}
==================================================
17.
// Complete the method in this class to print the length of each string
// all on one line separated by spaces
import java.util.ArrayList;
public class ArrayListUtil
{
   /**
    * prints length of each string in the arraylist all on one line
    * @param text the array list to process
    */
    public void getLengths(ArrayList<String> text)
    {
        // TODO: Use a loop to print the length of each string all on one line separated by spaces
        for (String word : text)
        {
            int length = word.length();
            System.out.print(length + " ");
        }
    }
}
==================================================
18.
// Complete the method in this class to return the number of strings
// that start with the target
import java.util.ArrayList;
public class Counter
{
   /**
    * Gets the number of strings that starts with the target
    * @param text the array list to process
    * @param target the desired letter
    * @return the count of strings starting with target
    */
    public int getCount(ArrayList<String> text, String target)
    {
       // TODO: Adapt an ArrayList algorithm to return the number of Strings that start within the target
        int count = 0;
        for (String word: text)
        {
            if (word.startsWith(target))
            {
                count++;
            }
        }
        return count;
        }
}
==================================================
19.
// Complete the method in this class to return the index of the first string
// that starts with the target. Return -1 if no string starts with the target

import java.util.ArrayList;
public class Finder
{
   /**
    * Gets the index of the first String that starts with the target
    * @param text the array list to process
    * @param target the desired letter
    * @return the index of first string starting with target or -1 if not found
    */
    public int getIndex(ArrayList<String> text, String target)
    {
        int i = 0;
        int index = -1;
        boolean found = false;
        int length = text.size();
        while (length > 0) //supply condition
        {
            // TODO: Adapt an ArrayList algorithm to return the index of the first string that start with the target
            // TODO: Return -1 if no string starts with the target
            for (String word: text)
            {
                if (word.startsWith(target) && found == false)
                {
                    index = i;
                    found = true;
                }
                i++;
                length--;
            }
        }
        return index;
    }
}
==================================================
20.
 * Complete the method in this class to return the first string
 * that starts with the target. Return null if no string starts with the target

import java.util.ArrayList;
public class StringFinder
{
   /**
    * Gets the first String that starts with the target
    * @param text the array list to process
    * @param target the desired letter
    * @return the first string starting with target or null if not found
    */
    public String getTarget(ArrayList<String> text, String target)
    {
        int i = 0;
        String startsWith = null;
        boolean found = false;
        while (i < text.size() && found == false) //supply condition
        {
           //your code goes here
            if (text.get(i).startsWith(target))
                {
                    startsWith = text.get(i);
                    found = true;
                }
            i++;
            }
        return startsWith;
    }
}
==================================================

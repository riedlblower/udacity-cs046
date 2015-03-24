1. declare and instantiate and ArrayList of Colors objects using the Color class;

ArrayList<Color> palette = new ArrayList<Color>();

left hand side: declares that palette is a reference to an ArrayList object. 
right hand side: creates (instantiates) an ArrayList object and returns a reference. 

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
10.
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
11.
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

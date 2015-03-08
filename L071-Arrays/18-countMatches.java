// BlueJ project: lesson7/gallery7
//Find the number of pictures in the ArrayList whose height is bigger than their width (portrait pictures)

import java.util.ArrayList;

public class ListOfPictures
{
    public static void main(String[] args)
    {
        ArrayList<Picture> gallery = new ArrayList<Picture>();
        gallery.add(new Picture("degas1.jpg"));
        gallery.add(new Picture("gaugin1.jpg"));
        gallery.add(new Picture("monet1.jpg"));
        gallery.add(new Picture("monet2.jpg"));
        gallery.add(new Picture("renoir1.jpg"));
        
        // Your code here
        int count = 0;
        for (Picture pic : gallery)
        {
            if (pic.getHeight() > pic.getWidth()) //portrait orientation
            {
                count++;
            }
        }
        
        System.out.println("Pictures with portrait orientation: " + count);
    }
}

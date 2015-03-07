// BlueJ project: lesson7/gallery5

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
        
        int sum = 0;
        for (Picture pic : gallery)
        {      
            int width = pic.getWidth();
            sum = sum + width;
        }
        
        System.out.println("Sum of widths: " + sum);
    }
}

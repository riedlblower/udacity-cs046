// BlueJ project: lesson7/gallery8
// Find and draw the first portrait in the gallery.
// Notice the pseudocode from the instructions has been started for you; your task is to complete it. 

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
        
        int i = 0;
        boolean found = false;
        while (i < gallery.size()-1 && !found)
        {
            Picture pic = gallery.get(i); 
            if (pic.getHeight() > pic.getWidth())
            {
                found = true;
            }
            else
            {
                i++;
            }
        }
        
        if (found)
        {
            gallery.get(i).draw();
        }
    }
}

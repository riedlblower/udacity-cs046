// BlueJ project: lesson7/gallery4

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
        
        // TODO: Rotate the gallery so that the last picture
        // becomes the first one, the first the second, and so on. 

        // "remove" also takes a copy of the last element.         
        Picture last = gallery.remove(gallery.size()-1);
        gallery.add(0, last);
        
        int rightmostX = 0;        
        for (Picture pic : gallery)
        {        
            pic.translate(rightmostX + 10, 0);
            rightmostX = pic.getMaxX();
            pic.draw();
        }
    }
}

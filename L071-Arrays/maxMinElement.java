// BlueJ project: lesson7/gallery6

import java.util.ArrayList;

public class ListOfPictures
{
    public static void main(String[] args)
    {
        ArrayList<Picture> gallery = new ArrayList<Picture>();
        gallery.add(new Picture("degas1.jpg"));
        gallery.add(new Picture("guigou1.jpg"));
        gallery.add(new Picture("gaugin1.jpg"));
        gallery.add(new Picture("monet1.jpg"));
        gallery.add(new Picture("seurat1.jpg"));
        
        // Your code here        

        Picture tallest = gallery.get(0);
        for (int i = 1; i < gallery.size(); i ++)
        {      
            Picture pic = gallery.get(i);
            if (pic.getHeight() > tallest.getHeight())
            {
                tallest = pic;
            }
        }
        
        System.out.println("Tallest height: " 
           + tallest.getHeight());
        tallest.draw();
    }
}

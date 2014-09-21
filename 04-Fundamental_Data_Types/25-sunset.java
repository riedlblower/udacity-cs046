// BlueJ project: lesson4/sunsetInput
// Video: Color Your Own Sunset Effect

import java.util.Scanner;

public class Sunset
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        Picture pic = new Picture();
        pic.load("queen-mary.png");

        System.out.print("Added redness: ");
        int added_redness = in.nextInt();

        pic.draw();
        for (int i = 0; i < pic.pixels(); i++)
        {
            Color c = pic.getColorAt(i);
            c.redden(added_redness); // TODO: Pass added redness to method
            pic.setColorAt(i, c);
        }
    }
}

// Bluej project: charlieFlag
public class Flag
{
    private Picture pic;
    private int width;
    private int height;

    public Color getColorAt(int x, int y)
    {
        Color c;
        if ((y>=4*height/5 || y<height/5))
        {
            c = Color.BLUE;
        }
        else if (((y>=height/5 && y<2*height/5)) || ((y>=3*height/5 && y<4*height/5)))
        {
            c = Color.WHITE;
        }
        else
        {
            c = Color.RED;
        }
        return c;
    }

    public Flag(int width, int height)
    {
        this.width = width;
        this.height = height;
        pic = new Picture(width, height);
        pic.draw();
        for (int x = 0; x < width; x++)
        {
            for (int y = 0; y < height; y++)
            {
                Color c = getColorAt(x, y);
                pic.setColorAt(x, y, c);
            }
        }
    }
}

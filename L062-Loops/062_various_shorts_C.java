// BlueJ project: lesson6/nested
// unit6.2-21
// The x- and y- positions of the rectangles should start at
// 0, WIDTH, 2 * WIDTH, and so on.
// The colors should start at 0, end up at 255, and grow in
// equal increments.

public class Colors
{
    public static void main(String[] args)
    {
        final int WIDTH = 30;
        final int ROWS = 16;
        final int COLUMNS = 16;

        for (int i = 0; i < ROWS; i++)
        {
            for (int j = 0; j < COLUMNS; j++)
            {
                int x = i * WIDTH;
                int y = j * WIDTH;
                Rectangle rect = new Rectangle(x, y, WIDTH - 1, WIDTH - 1);
                int blue = i * 255/(COLUMNS-1);
                int green = j * 255/(ROWS-1);
                Color fillColor = new Color(0, green, blue);
                rect.setColor(fillColor);
                rect.fill();
            }
        }
    }
}
//======================================

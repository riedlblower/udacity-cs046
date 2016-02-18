import javax.swing.*;
import java.awt.*;

/**
 * The panel for displaying the current status of the game itself.
 * 
 * You should not modify this class, and your agent should not need to access the methods within
 * it directly.
 */
public class Connect4Panel extends JPanel
{
    private Connect4Game myGame;    // the game to display
    private int slotDiameter;  // size of the individual slots
    private int slotSpacing; // space between slots
    
    /**
     * Creates a new Connect4Panel with a given game.
     * 
     * Your agent will not need to use this method.
     * 
     * @param game the game to display.
     */
    public Connect4Panel(Connect4Game game)
    {
        super();
        this.myGame = game;
        
        this.slotDiameter = 75;
        this.slotSpacing = 10;
        
        final int WIDTH = 605;
        final int HEIGHT = 520;
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }
    
    /**
     * Paints the current status of the game.
     * 
     * Your agent will not need to use this method.
     * 
     * @param g the graphics object with which to paint.
     */
    public void paint(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(Color.BLUE);
        g2.fillRect(0, 0, getWidth(), getHeight());
        
        for (int i = 0; i < myGame.getColumnCount(); i++)
        {
            for (int j = 0; j < myGame.getRowCount(); j++)
            {
                Connect4Column column = myGame.getColumn(i);
                Connect4Slot currentSlot = column.getSlot(j);
                Color color;
                if(!currentSlot.getIsFilled())
                {
                    color=Color.WHITE;
                }
                else
                {
                    if (currentSlot.getIsRed())
                    {
                        color = Color.RED;
                    }
                    else
                    {
                        color = Color.YELLOW;
                    }
                }
                int x = ((i + 1) * slotSpacing) + (i * slotDiameter);
                int y = ((j + 1) * slotSpacing) + (j * slotDiameter);
                drawSlot(g2, x, y, color);
                if (currentSlot.getIsHighlighted())
                {
                    drawHighlight(g2, x, y);
                }
            }
        }
    }
    
    /**
     * Draw a single slot.
     * 
     * Your agent will not need to use this method.
     *
     * @param g2 the graphics object with which to paint.
     * @param x the top-left x-coordinate where to draw the slot.
     * @param y the top-left y-coordinate where to draw the slot.
     * @param color the color for the slot.
     */
    public void drawSlot(Graphics2D g2, int x, int y, Color color)
    {
        g2.setColor(color);
        g2.fillOval(x, y, slotDiameter, slotDiameter);
    }
    /**
     * Highlight a slot.
     * 
     * Your agent will not need to use this method.
     *
     * @param g2 the graphics object with which to paint.
     * @param x the top-left x-coordinate where to draw the highlight.
     * @param y the top-left y-coordinate where to draw the highlight.
     */
    public void drawHighlight(Graphics2D g2, int x, int y)
    {
        Stroke save = g2.getStroke();
        g2.setStroke(new BasicStroke(10.0f));
        g2.setColor(Color.GREEN);
        g2.drawOval(x + 4, y + 4, slotDiameter - 8, slotDiameter - 8);
        g2.setStroke(save);
    }
}

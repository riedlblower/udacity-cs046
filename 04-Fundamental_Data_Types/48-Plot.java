// BlueJ Project: lesson4/fields

public class Plot
{
    private int width;
    private int length;

    /**
        Constructs a plot of a given size.
        @param width the width of the plot
        @param length the length of the plot
    */
    public Plot(int width, int length)
    {
        this.width = width;
        this.length = length;
    }

    /**
     * Calculates the number of circular fields that can fit on this plot.
     */
    public int getNumberOfFields(int radius)
    {
        int diameter = radius * 2;
        int rows = (int) ((length - diameter)/ ( radius * Math.sqrt(3.0))) + 1;
        int oddRows = rows/2 + 1;
        int evenRows = rows/2;
        int columnsInOddRow = width/diameter;
        int columnsInEvenRow = (width-radius)/diameter;
        int numberOfFields = (oddRows * columnsInOddRow) + (evenRows * columnsInEvenRow);
        return numberOfFields;        
    }
}

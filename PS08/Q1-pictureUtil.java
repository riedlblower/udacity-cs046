/**
 * Methods to manipulate the Picture class
 */
public class PictureUtil
{
    /**
     * Gets a version of the given Picture in gray scale and flipped left to right
     * @param pic the Picture to convert to gray scale and flip
     * @return a version of the original Picture in gray scale and flipped
     * left to right.
     */
    public static Picture grayAndFlipLeftToRight(Picture pic)
    {
        // TODO get a gray scale version
        // TODO flip it left to right
        // TODO create and return the new Picture
        int[][] pixels = pic.getGrayLevels();  // convert all the pixels to grayscale
        int rows = pixels.length;
        int columns = pixels[0].length;
        int midpoint = columns / 2;
        int temp_pixel;
        for (int row = 0; row < rows; row++)
        {
            for (int column = 0; column < midpoint; column++)
            {
                temp_pixel = pixels[row][column];
                pixels[row][column] = pixels[row][(columns-column)-1];
                pixels[row][(columns-column)-1] = temp_pixel;
            }
           
        }
        Picture flipped = new Picture(pixels); // create a picture from the pixels
        return flipped;
    }

    /**
     * Gets a version of the given Picture in gray scale and rotated 90 degrees clockwise
     * @param pic the Picture to convert to gray scale and rotate 90 degrees clockwise
     * @return a version of the original Picture in gray scale and rotated 90 degrees clockwise
     */
    public static Picture grayAndRotate90( Picture pic)
    {
        // TODO get a gray scale version
        // TODO make a new array where the first row of the original becomes the last
        // column of the new array
        int[][] pixels = pic.getGrayLevels();
        int original_rows = pixels.length;
        int original_columns = pixels[0].length;
        int[][] rotated_pixels = new int[original_columns][original_rows];
        for (int row = 0; row < original_columns; row++)
        {
            for (int column = 0; column < original_rows; column++)
            {
                rotated_pixels[row][column] = pixels[(original_rows-1)-column][row];
            }
        }
        Picture rotated = new Picture(rotated_pixels);
        return rotated;
    }

}

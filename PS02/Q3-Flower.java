// Write a class that describes a flower. A flower has a location, a
// constructor and a draw method.
// The flower should look like the picture below:
// http://imgur.com/uOPHb3E

public class Flower
{
   private int x;
   private int y;
   
   public Flower(int theX, int theY)
   {
       x = theX;
       y = theY;
   }
    
   /**
    * This function draws the flower.
    */
   public void draw()
   {
       // highest circle
    Ellipse circle1 = new Ellipse(x+20, y, 20,20);
    circle1.setColor(Color.PINK);
    circle1.fill();
       // middle circles
    Ellipse circle2 = new Ellipse(x, y+20, 20,20);
    circle2.setColor(Color.PINK);
    circle2.fill();
    Ellipse circle3 = new Ellipse(x+20, y+20, 20,20);
    circle3.setColor(Color.YELLOW);
    circle3.fill();
    Ellipse circle4 = new Ellipse(x+40, y+20, 20,20);
    circle4.setColor(Color.PINK);
    circle4.fill();
       //lowest circle
    Ellipse circle5 = new Ellipse(x+20, y+40, 20,20);
    circle5.setColor(Color.PINK);
    circle5.fill();
        //stem of flower
    Line stem = new Line(x+30,y+60,x+30,y+120);
    stem.setColor(Color.GREEN);
    stem.draw();
   }
}

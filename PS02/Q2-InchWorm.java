

public class InchWorm
{
   // TODO: Add instance variables
    private int position;
    private int direction;  
    
   public InchWorm()
   {
      // TODO: Complete constructor
       direction = 1;
       position = 0 ;
   }
   
   public InchWorm (int initialPosition)
   {
       // TODO: set the instance variable to the constructor parameter
       position = initialPosition;
       direction = 1;
   }
   
   public void move()
   {
        // TODO: Update the position of the inch worm   
       position = position + direction;
   }
   
   public void turn()
   {
      // TODO: Update the direction
       direction = direction * (-1);
   }
   
   public int getPosition()
   {
      return position;
   }
   
   public int getDirection()
   {
      return direction;
   }
}

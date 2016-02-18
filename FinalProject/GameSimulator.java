import java.util.Arrays;
public class GameSimulator
{
   private int gamesToRun = 100; //change this for amount of games to run. 1000 games takes about 5 seconds on my computer.
   Connect4Game game = new Connect4Game(7, 6); 
   Agent redPlayer = new MyAgent(game, true); //change this to your own agent!
   Agent yellowPlayer = new BeginnerAgent(game, false); 
   Connect4Frame mainframe = new Connect4Frame(game, redPlayer, yellowPlayer);
   private int[] scoreBoard = new int[3];
   
   
   
   public void simGames()
   {
        for(int i = 0; i < gamesToRun; i++)
       {           
           mainframe.newGame();
           mainframe.playToEnd();
           char winner = game.gameWon();
           if(winner == 'R')
           {
               scoreBoard[0] += 1;
           }
           else if(winner == 'Y')
           {
               scoreBoard[2] += 1;
           }
           else
           {
               scoreBoard[1] += 1;
           }
       }
       System.out.println("Score: [Red (me), Draw, Yellow]  : " + Arrays.toString(scoreBoard));
   }
   
}

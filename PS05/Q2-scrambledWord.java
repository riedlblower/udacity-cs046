import java.util.Random;
/**

 */
public class Word
{
   private Random generator = new Random();

   public Word()  //leave the constructor alone
   {
        generator = new Random();
        final long SEED = 42;
        generator.setSeed(SEED);
   }
   /**
    * Gets a version of this word with the leters scrambled
    * @param word the string to scramble
    * @return the scrabled string
    */
    
    public String scramble(String word)
   {
       int i, j;
       String SwappedString = "";
       String first, middle, last;
       int wordLength = word.length();
       for (int k = 0; k < wordLength; k++)
       {
           i = generator.nextInt(wordLength-1);
           j =  i+1 + generator.nextInt(wordLength-i-1);
           first = word.substring(0,i);
           middle = word.substring(i+1,j);
           if (j != wordLength)
           {
               last = word.substring(j+1);
           }
               else
           {
               last = "";
           }
           SwappedString = first + word.substring(j, j + 1) + middle + word.substring(i, i + 1) + last;
           word = SwappedString;
       }
        return SwappedString;
   }
}

17. 
StaticPrinter.java

// There is a static method called getTip in the
// Finance class already written for you.
//
// You are to complete the statement double tip ...
// to call the static getTip method
// You can ignore the rest of the method.
// It gets a value from the user and prints
//
// DO NOT instantiate a Finance object. 
// You will get no credit for that. Call the method in a static manner

import java.util.Scanner;

public class StaticPrinter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the cost of the dinner: ");
        double cost = in.nextDouble();
        
        // TODO: call the static method getTip in the Finance class
        double tip = Finance.getTip(cost);
        System.out.printf("\n%.2f",tip);
    }
    
}

Finance.java
public class Finance
{
    public static double getTip(double costOfDinner)
    {
        final double TIP_RATE = .2;
        return costOfDinner * TIP_RATE;
    }
}

=============================
18.
// My favorite letters are x and z.
//
// Complete the isXOrZ method to determine
// if a word contains either x or z. 
//
// Ignore case, So if the word contains:
// X, x, Z, or z
// return true.
//
// Otherwise return false

public class WordUtil
{
   /**
    * Determines if the string contains either x or z
    * @param text the string to test for x or z
    * @return true if the string contains x or z, ignoring case.
    *  Otherwise false
    */
    public  boolean isXOrZ(String text)
    {
        String lower = text.toLowerCase();
        boolean found = false;
        int i = 0;

        // TODO: complete the loop header
        String test = "XZxz";
        while (i < lower.length())
        {
            String letter = lower.substring(i, i +1);
            // TODO: complete the loop to determine if 
            // lower contains x or z
            if (test.contains(letter))
            {
                found = true;
            }
            i++;
        }
        return found;
    }
}
=============================
19. 
//In Spanish, nouns that end with "a" are feminine while words that end in "o" are masculine.
//(We will ignore exceptions in this exercise). Feminine nouns are preceded by the article
//"la" while maculine words are preceded by the article "el"
//You are to complete the method fixNoun in the SpanishWord class so
//that it returns the noun preceded by:
//  "la " if the noun ends in "a",
//  "el " if it ends in "o"
//  "? " if it ends in some other letter.

//Examples:
//fixNoun(cara) returns: la cara
//fixNoun(ojo) returns: el ojo
//fixNoun(nariz) returns: ? nariz

//(Notice the space between the la and cara, el and ojo, and ? and nariz)

//Hint: Think about how to get the last character of a String and then think about how
// to compare strings

//If you are a Spanish speaker, please ignore any error in this simplified explanation.
//and just follow the directions to return the required string.

public class SpanishNouns
{
    /**
     * Gets the noun with the proper article
     * @param noun the word to fix
     * @return the string with the proper article if the name ends in "a" or "o"
     * otherwise preceded by "? "
     */
    public String fixNoun(String noun)
    {
        String result = "";
        String[] addition = {"la ", "el ", "? "};
        String lastletter = noun.substring(noun.length() - 1);
        switch (lastletter)
        {
            case "a": result = addition[0] + noun; break;
            case "o": result = addition[1] + noun; break;
            default: result = addition[2] + noun; break;
        }
        return result;
    }
}
=============================

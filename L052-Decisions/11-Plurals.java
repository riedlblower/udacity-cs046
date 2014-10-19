// Bluej project: plurals
public class Word
{
    private String letters;

    public Word(String letters)
    {
        this.letters = letters.toLowerCase();
    }

    /**
        Forms the plural of this word.
        @return the plural, using the rules for regular nouns
    */
    public String getPluralForm()
    {
        String partName = letters;
        String endName = "s";
        int lastLetterIndex = letters.length()-1;
        int secondLastLetterIndex = letters.length()-2;

        if (is(lastLetterIndex,"y")){
            if (isVowel(secondLastLetterIndex)){
                endName = "s";
            }
            else{
                partName = letters.substring(0,letters.length()-1);
                endName = "ies";
            }
        }
        else if (is(lastLetterIndex,"o") || is(lastLetterIndex,"s")){
            endName = "es";
        }
        else if (is(lastLetterIndex,"h")){
            if (is(secondLastLetterIndex,"s") || is(secondLastLetterIndex,"c")){
                endName = "es";
            }
        }
        return partName + endName;
    }

    /**
       Tests whether the ith letter is a vowel.
       @param i the index of the letter to test
       @return true if the ith letter is a vowel
    */
    public boolean isVowel(int i)
    {
        return is(i, "a")
               || is(i, "e")
               || is(i, "i")
               || is(i, "o")
               || is(i, "u");
    }

    /**
       Tests whether the ith letter is a consonant.
       @param i the index of the letter to test
       @return true if the ith letter is a consonant
    */
    public boolean isConsonant(int i)
    {
        return !isVowel(i);
    }

    /**
     * Checks what letter is in position i
     * @return true when the the letter of letters is the given letter.
     *         false otherwise.
     * @param i index in letters
     * @param letter the letter to match with. must be one character long.
     */
    public boolean is(int i, String letter)
    {
        return letters.substring(i, i + 1).equals(letter);
    }
}

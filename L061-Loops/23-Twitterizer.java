// Write code for the shorten(String longPost) method.   
public class Twitterizer
{
    /**
     * Shortens and prints longPost by removing vowels
     * @param longPost the post whose vowels need to be removed.
     */
    public String shorten(String longPost) 
    {
        String shortenedPost = "";
        String letter;
        boolean isSmallVowel, isBigVowel;
        int lengthOfLongPost = longPost.length()-1;
        
        for (int index = 0; index <= lengthOfLongPost; index = index+1){
            letter = longPost.substring(index,index+1);
//            isSmallVowel = letter.equals("a")||letter.equals("e")||letter.equals("i")||letter.equals("o")||letter.equals("u");
//            isBigVowel = letter.equals("A")||letter.equals("E")||letter.equals("I")||letter.equals("O")||letter.equals("U");
//            if (!isSmallVowel && !isBigVowel){
            if (!"aeiouAEIOU".contains(letter)){
                shortenedPost = shortenedPost + letter;
            }                
        }
        return shortenedPost;
    }
}

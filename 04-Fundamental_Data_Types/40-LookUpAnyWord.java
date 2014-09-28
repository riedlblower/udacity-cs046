// BlueJ Project: lesson4/book7
// Video: Working with the Book Text
    
import java.util.Scanner;

public class LookUpAnyWord
{
    public static void main(String[] args)
    {
        System.out.print("Type a word and I'll tell you how many times it appears: ");
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();

        Book book1 = new Book("aliceInWonderland.txt");

        int occurrences = book1.occurrencesOf(word);
        System.out.println(word + " occurs " + occurrences + " times!");
    }
}

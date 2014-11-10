
public class TwitterizerTester
{
    public static void main(String[] args)
    {
        Twitterizer twitterizer = new Twitterizer();
        String longPost = "How did I ever program without loops?!";
        
        System.out.println("Actual " + twitterizer.shorten(longPost));
        System.out.println("Expected Hw dd  vr prgrm wtht lps?!");
    }
}

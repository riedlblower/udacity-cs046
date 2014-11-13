// Bluej project: secret_messages
//
// TODO: implement the read method.
//
public class SecretMessage
{
    private String encodedMessage;

    public SecretMessage(String encodedMessage)
    {
        this.encodedMessage = encodedMessage;
    }

    /**
     * Reads every 10th letter of encodedMessage and returns a string
     * with the letters it reads.
     * @return A message hidden in the garbled text
     */
    public String read()
    {
        String decodedMessage = "";
        for (int i = 0; i < encodedMessage.length(); i = i + 10)
        {
            decodedMessage = decodedMessage + encodedMessage.substring(i,i+1);
        }
        return decodedMessage;
    }

    /**
     * Optional:
     * Decodes the same way as String read() but takes an index to start at.
     * There may be more than one secret message in the garbled text.
     * @return A message hidden in the garbled text starting at startingIndex
     * @param the first indexToRead
     */
    public String read(int startingIndex)
    {
        String decodedMessage = "";
        for (int i = startingIndex; i < encodedMessage.length(); i = i + 10)
        {
            decodedMessage = decodedMessage + encodedMessage.substring(i,i+1);
        }
        return decodedMessage;
    }
}

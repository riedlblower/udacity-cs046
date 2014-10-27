// Bluej project: lesson6/credit_card
// Video: Credit Card Checksum

// TODO: Implement the isValid method.
public class CreditCard
{
    private long cardNumber;

    public CreditCard(long cardNumber)
    {
        this.cardNumber = cardNumber;
    }

    /**
     * Calculates whether this CreditCard has a valid number.
     * @return true if the number is valid, false if it's not.
     */
    public boolean isValid()
    {
        long n = cardNumber;
        int sum = 0;
        int count = 0;

        while (n > 0)
        {
            int digit = (int)(n % 10);
            count++;
            if (count % 2 == 1){
                sum = sum + digit;
            }
            else if (digit<5){
                sum = sum + 2 * digit;
            }
            else{
                sum = sum + (2 * digit) - 9;
            }
            n = n/10;
        }
        return (sum % 10 == 0);
    }
}

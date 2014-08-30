/**
   A credit card has a balance that can be changed by purchases and payments.
*/
public class CreditCard
{
    private double balance ;
   /**
      Constructs a credit card with a zero balance.
   */
   public CreditCard()
   {
    balance = 0.0;
   }


   /**
      Makes a payment to  credit card.
      @param amount the amount to pay
   */
   public void payment(double amount)
   {
       // TODO #1: You should subtract amount from balance variable in this function
       balance = balance - amount;
   }

   /**
      Makes a purchase with the credit card
      @param amount the amount of the purchase
   */
   public void purchase(double amount)
   {
       // TODO #2: You should add amount to the balance variable in this function
       balance = balance + amount;
   }

   /**
      Gets the current balance of the credit card.
      @return the current balance
   */
   public double getBalance()
   {
       // TODO #3: You should return the instance variable balance in this function
       return balance;
   }
}

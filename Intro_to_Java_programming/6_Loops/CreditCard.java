// Bluej project: lesson6/credit_card1
// Video: Sum Every Other Digit

// TODO: Implement the sumCertainDigits method.
public class CreditCard
{
    private long cardNumber;

    public CreditCard(long cardNumber)
    {
        this.cardNumber = cardNumber;
    }

    /**
     * Calculates the sum of ever other digit in cardNumber 
     * starting from the rightmost digit.
     * @return the sum of every other digit starting from the rightmost.
     */
    public int sumCertainDigits()
    {
        // So that we don't accidentally change the credit card number,
        // make a copy called n. 
        long n = cardNumber;
  
        int sum = 0;
        int count =0;

        while (n > 0)
        {
            int digit = (int)(n % 10); 
            if(count%2==0){
                sum = sum + digit;                
            }
            count++;
            n = n/10;
        }
        return sum;
    }

    /**
    * Calculates whether this CreditCard has a valid number.
    * @return true if the number is valid, false if it's not.
    */
    public boolean isValid(){

        long n = cardNumber;
        int sum = 0;
        int count = 0;

        while (n > 0)
        {
            int digit = (int)(n % 10); 

            if (count%2==0){
                sum += digit;    
            }else if( digit < 5){
                sum += 2*digit; 
            }else{
                sum += 2*digit - 9;
            }
            
            count++;
            n = n/10;
        }
        if(sum%10==0){
            return true;
        }else{
            return false;
        }
    }    
}

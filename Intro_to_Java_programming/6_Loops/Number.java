// Bluej project: lesson6/counting_matches_digits
/**
 * A class that represents a number and can report
 * properties of the number.
 */
public class Number
{
    private long number;

    public Number(long number)
    {
        this.number = number;
    }

    /**
     * Returns the number of times digitToMatch appears
     * in this number.
     * @param digitToMatch the digit to search for.
     *   must be at least 0 and at most 9.
     * @return number of occurrences of digitToMatch
     */
    public int countMatchingDigits(int digitToMatch)
    {
        // TODO: count and return the number of times the given digit appears in the number
        long temp=number;
        int remainder;
        int count =0;
        while(temp !=0){
            remainder = (int)(temp%10);
            if (remainder==digitToMatch){
                count++;
            }
            temp/=10;
        }
        // Hint: The last digit is (int)(numbers % 10).
        return count;
    }
}

/**
 * Complete the method to find sum of all the positive even numbers less than or equal to the given number
 * use a loop
 */
public class Sum
{
    /**
     * Gets the sum of all the even numbers less than or equal to the given number
     * @param n the given number, the ceiling
     * @return the sum of all the even numbers less that the ceiling
     */
    public int sum(int n)
    {
        //TODO: implement this method.
        int sumVal = 0;
        int count =0;
        while(count<=n){
        	if (count%2==0){
        		sumVal +=count;
        	}
        	count++;
        }
        return sumVal;
    }
}

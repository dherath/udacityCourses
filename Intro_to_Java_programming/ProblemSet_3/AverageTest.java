/**
 * Compelete the method to return the average of three numbers
 */
public class AverageTest
{
    public double average(int test1, int test2, int test3)
    {
        //you can put code here
        return (double)((test1+test2+test3)/3);
    }


    //------------Main----------------------
    public static void main(String[] args) {
    	AverageTest t1 = new AverageTest();
    	System.out.println(t1.average(23,34,10));
    }
}

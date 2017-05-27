/**
 * Complete the method to find the largest power of 2 less than the given number
 * Use a loop
 */
public class MathUtil
{
	int n;

	public MathUtil(int n)
	{
		this.n = n;
	}

    public int largestPowerOf2()
    {
    	int p =0;
    	int base = 2;
    	int val = (int)(Math.pow(base,p));
    	while (val<this.n) {
    		val = (int)(Math.pow(base,p));
    		p++;
    	}
    	val = val/base;
    	return val;
    }


    public static void main(String[] args) {
    	// System.out.println(largestPowerOf2(9));
    	// System.out.println(largestPowerOf2(1000));
    	// System.out.println(largestPowerOf2(64));
    	MathUtil temp = new MathUtil(1000);
    	System.out.println(temp.largestPowerOf2());

    }
}

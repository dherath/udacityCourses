
public class InvertingAmplifier extends Amplifier
{
    // TODO: supply the implementation of InvertingAmplifier as a subclass of Amplifier
    // R1 and R2 represent resistance. The gain (g) is calculated from the resistance as follows:
    // InvertingAmplifier:         g = R2 / R1
    // TODO: the getGain method needs to return the correct gain (g)

    /**
     * Constructor for inverting amplifier
     **/
    public InvertingAmplifier(int r1, int r2)
    {
	super(r1,r2);
    }

    /**
     * finds gain using g = R2/ R1
     * @return the gain
     **/
    public double getGain()
    {
	if (super.getR1()==0){
	    return  super.getGain();
	}
	return  ( (double)(super.getR2())/super.getR1());
    }
}

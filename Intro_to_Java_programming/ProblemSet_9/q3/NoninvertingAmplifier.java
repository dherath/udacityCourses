
public class NoninvertingAmplifier extends Amplifier
{
    // TODO: supply the implementation of NoninvertingAmplifier as a subclass of Amplifier
    // R1 and R2 represent resistance. The gain (g) is calculated from the resistance as follows:
    // NoninvertingAmplifier:      g = 1 + (R2 / R1)
    // TODO: the getGain method needs to return the correct gain (g)

    /**
     * Constructor for NOnINvertingamplifier
     **/
    public NoninvertingAmplifier(int r1, int r2)
    {
	super(r1,r2);
    }

    /**
     * gets gain g= 1+ R2/R1
     * @return the gain 
     **/
    public double getGain()
    {
	if (super.getR1()==0){
	    return (double)(1 + super.getGain());
	}
	return ( 1.0 + (double)(super.getR2())/super.getR1());
    } 
}

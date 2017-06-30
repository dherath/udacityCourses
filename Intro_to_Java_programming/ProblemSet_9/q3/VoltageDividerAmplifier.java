
public class VoltageDividerAmplifier extends Amplifier
{
     // TODO: supply the implementation of VoltageDividerAmplifier as a subclass of Amplifier
     // R1 and R2 represent resistance. The gain (g) is calculated from the resistance as follows:
     // VoltageDividerAmplifier:    g = R2 / (R1 + R2)
     // TODO: the getGain method needs to return the correct gain (g)

    /**
     * Constructor for Voltagedivideramplifier
     **/
    public VoltageDividerAmplifier(int r1, int r2)
    {
        super(r1,r2);
    }

    /**
     * gets gain g = R2 / (R1 + R2)
     * @return the gain g
     **/
    public double getGain()
    {
        if (super.getR1()==0 && super.getR2()==0){
            return super.getGain();
        }
        return ( (double) (super.getR2()) / (super.getR1() + super.getR2()));
    }
}

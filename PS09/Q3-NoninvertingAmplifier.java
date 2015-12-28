
public class NoninvertingAmplifier extends Amplifier
{
    // TODO: supply the implementation of NoninvertingAmplifier as a subclass of Amplifier
    // R1 and R2 represent resistance. The gain (g) is calculated from the resistance as follows:
    // NoninvertingAmplifier:      g = 1 + (R2 / R1)
    // TODO: the getGain method needs to return the correct gain (g)
    public NoninvertingAmplifier(int resistance1, int resistance2)
    {
        super(resistance1, resistance2);
    }

    /**
     * Gets the gain for this amplifier circuit
     * @return the gain
     */
    public double getGain()
    {
        int R1 = getR1();
        int R2 = getR2(); 
        return 1 + (R2 / (double) R1);
    }
}

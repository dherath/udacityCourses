// BlueJ Project: lesson4/fields

public class Plot
{
    private int width;
    private int length;

    /**
    *    Constructs a plot of a given size.
    *    @param width the width of the plot
    *    @param length the length of the plot
    */
    public Plot(int width, int length)
    {
        this.width = width;
        this.length = length;
    }

    /**
     * Calculates the number of circular fields that can fit on this plot.
     */
    public int getNumberOfFields(int radius)
    {
        // TODO: Using the formulas that we developed, compute
        // the total number of rows, then
        // the number of even and odd rows,
        // the number of columns in each even and odd row,
        // and finally the total number of fields
        int d = 2*radius; //diameter
        int noRows = width/d;
        int noCol = length/d;
        if (noRows%2==0){
            return (noRows/2)*(noCol)+(noRows/2)*(noCol-1);
        }else if ((noRows/2)*2 > noRows){
            return (noRows/2+1)*(noCol)+(noRows/2)*(noCol-1);
        }else{
            return (noRows/2)*(noCol)+(noRows/2+1)*(noCol-1);
        }
    }
}

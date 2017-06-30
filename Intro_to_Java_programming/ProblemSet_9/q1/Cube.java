// formulas for surface area and volume
// http://math2.org/math/geometry/areasvols.htm
//
// TODO: complete the code so that Cube implements the GeometricSolid interface
//
public class Cube implements GeometricSolid
{
    private double side;

    public Cube(double s)
    {
        side = s;
    }

    // other methods
    public double getSide()
    {
	return this.side;
    }

    /**
     * finds volume
     * @return the volume
     **/
    public double getVolume()
    {
	double s = this.getSide();
	return Math.pow(s,3.0);
    }

    /**
     * finds surface area
     * @return the surface area
     **/
    public double getSurfaceArea()
    {
	double s = this.getSide();
	return 6.0*Math.pow(s,2.0);
    }
}

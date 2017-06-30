// formulas for surface area and volume
// http://math.about.com/od/formulas/ss/surfaceareavol.htm
//
// TODO: complete the code so that Sphere implements the GeometricSolid interface
//
public class Sphere implements GeometricSolid
{
    private double radius;

    /**
     * Constructor for objects of class Sphere
     */
    public Sphere()
    {
        radius = 0;
    }

    /**
     * Constructs a Shpere with the given radius
     * @param r the radius
     */
    public Sphere( double r)
    {
        radius = r;
    }

    public void setRadius(double r)
    {
        radius = r;
    }

    public double getRadius()
    {
        return radius;
    }

    //other methods
    /**
     * finds volume
     * @return the volume
     **/
    public double getVolume()
    {
	double r = this.getRadius();
	return (4.0/3.0)*Math.PI*Math.pow(r,3.0);
    }

    /**
     * finds surface Area
     * @return the surface area
     **/
    public double getSurfaceArea()
    {
	double r = this.getRadius();
	return 4.0*Math.PI*Math.pow(r,2.0);
    }

}

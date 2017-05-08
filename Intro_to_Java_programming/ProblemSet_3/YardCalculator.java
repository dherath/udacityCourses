//A landscape designer needs a program to make calculations in meters about a front yard 
//given its width and length in feet.  Write a class YardCalculator with a constructor that 
//takes the width and length in feet as arguments:
//public YardCalculator(double length, double width)

//Provide methods:
//  public double perimeter() which returns the perimeter in meters
//  public double area() which returns the area in square meters
//  public double diagonal() which returns the diagonal in meters

//For reference:
//  1 foot = 0.3048 meters.

//Define and use a constant for the conversion factor. Define it in the class itself, 
//outside any method, so all methods in any class can see it, e.g.
//  public static final double METERS_PER_FOOT = 0.3048;

//HINT: diagonal = square root of (width^2 plus height^2)

// Need help starting this question? In the lesson titled 
// "Starting points: Problem Set Questions", go to the
// problem titled "Problem Set 3 - Question 1" for some tips on 
// how to begin. 

public class YardCalculator
{
    //Instance variables go here.
    double theLength;
    double theWidth;

    final double foot = 0.3048;

    /**
     * Constructs a YardCalculator with the given parameters
     * @param theLength the length of the yard
     * @param theWidth the width of the yard
     */
    public YardCalculator(double theLength, double theWidth)
    {
     this.theWidth=theWidth*foot;
     this.theLength=theLength*foot;
    }

    /**
     * Gets the perimeter of the yard
     * @return the perimeter
     */
    public double perimeter()
    {
        double perimeter = 2*(this.theLength+this.theWidth);
        return perimeter;
    }

    /**
     * Gets the area of the yard
     * @return the area
     */
    public double area()
    {
        double area = this.theWidth*this.theLength;
        return area;
    }

     /**
     * Gets the diagonal of the yard
     * @return the diagonal
     */
    public double diagonal()
    {
        double diagonal = Math.sqrt(Math.pow(this.theLength,2)+Math.pow(this.theWidth,2));
        return diagonal;
    }

}

//
// RectangleList class manages a list of Rectangles from the graphics package
// you have used this semester

// RectangleList has a no-argument constructor that simply initializes the
// instance variable
// It has a method to add Rectangles to the list
//These are provided for you
//
// It has a method to return the Rectangle with the largest perimeter
// (or null if the list is empty)
//You are to complete the largestPerimeter method.
//
// perimeter = 2 * (width + height)
//
// This class uses the Rectangle class from the graphics package. It has
// getWidth() and getHeight() methods
//
// There is a tester included to help you test your code.
//
//
import java.util.ArrayList;

public class RectangleList
{
    // private instance variables
    ArrayList<Rectangle> list;

    /**
     * Constructs a Rectangle list to manage a list of Rectangles
     */
    public RectangleList()
    {
        list = new ArrayList<Rectangle>();;
    }

    /**
     *
     * Adds a Rectangle to the list
     * @param r the rectangle to add
     */
    public void add(Rectangle r)
    {
        list.add(r);
    }

    /**
     * Gets the Rectangle with the largest perimeter
     * @return the rectangle with the largest perimeter or null if
     * there are no rectangles
     *
     */
    public Rectangle largestPerimeter()
    {
        int largestPeri, tempPeri;
        Rectangle largest, tempRect;
        
        if (list.size()==0) {
            return null;
        }
        
        largest = list.get(0);
        largestPeri = 2 * (largest.getWidth() + largest.getHeight());
        for (int i =1; i<list.size(); i++) {
            tempRect = list.get(i);
            tempPeri = 2 * (tempRect.getWidth()+tempRect.getHeight());
            if ( tempPeri > largestPeri) {
                largestPeri = tempPeri;
                largest = tempRect;
            }
        }
        
        return largest;
    }
}

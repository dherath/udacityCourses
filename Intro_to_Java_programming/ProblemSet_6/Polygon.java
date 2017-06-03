//You will keep the points in an array list. Use object of java.awt.Point for the point.

//Polygon will have as an instance variable an ArrayList of Points to hold the points
//The constructor takes no parameters but initializes the instance variable.  The
//Polygon class also has the following methods:
//    add: adds a Point to the polygon
//    perimeter: returns the perimeter of the polygon
//    draw: draws the polygon by connecting consecutive points and then
//          connecting the last point to the first.
//
//No methods headers or javadoc is provided this time. You get to try your hand at writing
//a class almost from scratch

// Need help starting this question? In the lesson titled 
// "Starting points: Problem Set Questions", go to the
// problem titled "Problem Set 6 - Question 3" for some tips on 
// how to begin.

import java.util.ArrayList;
import java.awt.Point;
import java.awt.Graphics;

public class Polygon
{
    // TODO: provide the required constructor, instance variable, and methods
    private ArrayList<Point> points;

    /**
     * Contstructor for Polygon
     **/
    public Polygon() {
	points = new ArrayList<Point>();
    }

    /**
     * adds point to Polygon
     * @param assings the point to Polygon
     **/
    public void add(Point point) {
	this.points.add(point);
    }

    /**
     * finds perimter of polygon
     * @return returns the perimeter
     **/
    public double perimeter() {
	double val,temp,p1,p2;
	for (int i=0;i<points.size()-1;i++) {
	    p1 = points.get(i);
	    p2 = points.get(i+1);
	    temp = Math.pow( (Math.pow(p1.getX()-p2.getX(),2.0) + (Math.pow(p1.getY()-p2.getY(),2.0)) ) ,0.5);
	    val += temp;
	}
	val += Math.pow( (Math.pow(points.get(0).getX()-points.get(points.size()-1).getX(),2.0) + (Math.pow(points.get(0).getY()-points.get(points.size()-1).getY(),2.0)) ) ,0.5);
	return val;
    }

    /**
     * draws the polygon
     **/
    public void draw() {
	double[] xPoints = new double[points.size()];
	double[] yPoints = new double[points.size()];

	for (int i=0;i<points.size();i++) {
	    xPoints[i] = points.get(i).getX();
	    yPoints[i] = points.get(i).getY();
	}

	g.drawPolygon(xPoints,yPoints,points.size());  
    }
}

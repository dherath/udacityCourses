//Implement a class Balloon that models a spherical balloon that is being filled with air.  
//The constructor constructs an empty balloon (That is, the volume is 0).

//Supply these methods: 
//	void addAir(double amount) adds the given amount of air
//	double getVolume() gets the current volume
//	double getSurfaceArea() gets the current surface area
//	double getRadius() gets the current radius

// Need help starting this question? In the lesson titled 
// "Starting points: Problem Set Questions", go to the
// problem titled "Problem Set 3 - Question 3" for some tips on 
// how to begin. 

//See this link for formulas for volume and surface area: 
//    http://math.about.com/od/formulas/ss/surfaceareavol.htm 

//Hints
//	You can find the nth root of a number by using the pow method from the Math class 
//  where the exponent is 1/n.
//	You will need to solve the volume formula for radius.


/**
 * models a spherical balloon that is being filled with air
 */
public class Balloon
{
	double volume;

	/** 
	* constructor for Balloon
	**/
	public Balloon(){
		this.volume = 0; 
	}

	/**
	* adds the volume to the Balloon
	* @param volume adds volume 
	**/
	public void addAir(double volume){
		this.volume +=volume;
	}

	/**
	* outputs current volume
	* @return returns the volume	
	**/
	public double getVolume(){
		return this.volume;
	}

	/**
	* finds the radius from volume
	* @return outputs the radius r = (3V/4pi)^(1/3)
	**/
	public double getRadius(){
		double r = (double)(Math.pow((3*this.volume)/(4*Math.PI),1.0/3.0)); // must add  1.0/3.0 instead of 1/3
		return r;
	}

	/**
	* finds the surface area of the baloon
	* @return returns the area = 4*pi*r^2
	**/
	public double getSurfaceArea(){
		double r = this.getRadius();
		double area = (double)(4*Math.PI*Math.pow(r,2.0));
		return area;
	}


}

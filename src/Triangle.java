
public class Triangle extends GeometricObject{
/*
 * Design a class named Triangle that extends GeometricObject. The class contains:

Three double data fields named side1, side2, and side3 with default values 1.0 to denote three sides of the triangle.
A no-arg constructor that creates a default triangle.
A constructor that creates a triangle with the specified side1, side2, and side3.
The accessor methods for all three data fields.
A method named getArea() that returns the area of this triangle.
A method named getPerimeter() that returns the perimeter of this triangle.
A method named toString() that returns a string description for the triangle.
Give me your GitHub URL using the unscored question (What's the GitHub URL)?


 */
	//should be private b/c we need accessor method
	//not sure what geometricobject is, and it isn't built in so I'm just going to do this how I would
	//if it didn't exist.
	
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;

	public Triangle() {
		
	}
	
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
	    this.side2 = side2;
	    this.side3 = side3;
	    }

	    public double getSideOne() {
	        return side1;
	    }

	    public double getSideTwo() {
	        return side2;
	    }

	    public double getSideThree() {
	        return side3;
	    }
	    public double area() {
	    	side1 = getSideOne();
	    	side2 = getSideTwo();
	    	side3 = getSideThree();
	    	double area = (side1 + side2 + side3) / 2;
	        return area;
	    }

	    public double perimeter() {
	    	side1 = getSideOne();
	    	side2 = getSideTwo();
	    	side3 = getSideThree();
	    	double perimeter = side1 + side2 + side3;
	    	return perimeter;
	    }

	    public String toString() {
	    	side1 = getSideOne();
	    	side2 = getSideTwo();
	    	side3 = getSideThree();	
	    	String verbalDescription = "The first side is "+side1+" long, the second side is "+side2+" long and "
	    			+ "the third side is "+side3+" long";
	    	return verbalDescription;
	    }
	}


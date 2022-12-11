package javaObj_Class;

public class Rectangle {
	//this is the area of a rectangle
	private double height;//Data Field
	private double width;//Data Field
	
	//Construct a rectangle with height and width value in 1
	public Rectangle() {//Constructor
		height = 1;
		width = 1;
	}
	
	//Construct a rectangle object with a specified height and width
	Rectangle(double newHeight, double newWidth){
		height = newHeight;
		width = newWidth;
	}
	
	/*accessor - Return the height of this rectangle*/
	public double getHeight() {//Method
		return height;
	}
	
	/*accessor - Return the width of this rectangle*/
	public double getWidth() {//Method
		return width;
	}
	
	/*accessor - Return the area of this rectangle*/
	double getArea() {//Method
		return height * width;
	}
	
	/*accessor - Return the perimeter of this rectangle*/
	double getPerimiter() {//Method
		return height + height + width + width;
	}
	
	//mutator
	public void display(Rectangle r) {//Method
		System.out.println("The width of your rectangle is: " + r.getWidth());
		System.out.println("The height of your rectangle is: " + r.getHeight());
		System.out.println("The area of your rectangle is: " + r.getArea());
		System.out.println("The perimiter of your rectangle is: " + r.getPerimiter());
	}
}


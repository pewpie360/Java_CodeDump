package javaObj_Class;
import java.util.*;//import java package
public class Test_Rectangle {
	//Main test for Rectangle Class
	public static void main(String[] args) {
		//creating a scanner
		Scanner sc = new Scanner(System.in);
		
		//creating new object
		Rectangle rectangle = new Rectangle(40, 4);//Declaring and Creating a reference variable
		rectangle.display(rectangle);//Accessing the display value of an objects to display value of rectangle obj
		
		System.out.println("Enter height: ");
		double h = sc.nextDouble();//convert inputs into double
		
		System.out.println("Enter width: ");
		double w = sc.nextDouble();//convert inputs into double
		
		//creating new object
		Rectangle rect = new Rectangle(h, w);//Declaring a reference variable and pass the h and w user input for height and width
		rect.display(rect);//Accessing the display value of an objects to display value of rect obj

	}

}

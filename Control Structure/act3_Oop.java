package javaControlStructures;
import java.util.*;
public class act3_Oop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//this class is used to get user input, and it is found in the java.util package
		
		System.out.println("Christian Jay Baguio | DS2A\n");
		
		System.out.println("Please input num: ");
		int f_num = sc.nextInt();
		
		/* Checking if number is even or odd number
         via remainder */
		//using if-else-if statement
		if (f_num % 2 == 0) {
			//If remainder is zero then this number is even
			System.out.println("This is even num");
		}
			//if the remainder is one then this number is odd
		else if (f_num % 2 == 1) {
			System.out.println("This is odd num");
		}
		else {
			//if the user input 0 then the else will be executed
			System.out.println("this is zero");
		}
			
		System.out.println("Input three value numbers: ");
		int order = sc.nextInt();
		int order2 = sc.nextInt();
		int order3 = sc.nextInt();
		//the three int var takes the three user input value and convert it to int
		
			//Using if-else-if conditional statement for this problem
		//if the order is less than order2 and order2 is less than order3 then the print order would be order, order2 and order3
		if((order < order2) && (order2 < order3)) {
			System.out.println("The ascending order is " + order + " " + order2 + " " + order3);
		}
		//else if order is less than order2 and order2 is greater than order3 then the print order would be order, order3 and order2
		else if((order < order2) && (order2 > order3)) {
			System.out.println("The ascending order is " + order + " " + order3 + " " + order2);
		}
		//else if order is greater than order2 and order2 is greater than order3 then the print order would be order3, order2 and order
		else if((order > order2) && (order2 > order3) ) {
			System.out.println("The ascending order is " + order3 + " " + order2 + " " + order);
		}
		//else if order is greater than order2 and order2 is less than order3 then the print order would be order2, order and order3
		else if((order > order2) && (order2 < order3)) {
			System.out.println("The ascending order is " + order2 + " " + order + " " + order3);
		}

	}

}

package javaControlStructures;
//import existing packages
import java.util.*;
public class Switch_StatementAct3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//class is used to get user input, and it is found in the java.util package
		//create a new object and store variable input 
		System.out.println("Christian Jay Baguio | DS2A\n");
		
		System.out.println("This is for the Switch statement");
		//create string choices for operations.
		System.out.println("Choose a letter: \n");
		System.out.println("a) Addition");
		System.out.println("b) Subtraction");
		System.out.println("c) Multiplication");
		System.out.println("d) Division\n");
		String operation = sc.nextLine();
		//convert all input into strings.
		
		
		System.out.print("Input first num: ");
		int intp = sc.nextInt();
		//getting the  first user input and convert it into string.
		System.out.print("Input second num: ");
		int intp1 = sc.nextInt();
		//same as the second getting the user input and convert it into string.
		
		switch(operation.toLowerCase()) {
		/*the toLowerCase is method where if the user input an upper case letter string
		 *  it converts a string to lower case letters.
		 */
		//switch statement is to select one of many code blocks to be executed.
		
		case "a":
		//The value of the expression is compared with the values of each case.
		//If there is a match, the associated block of code is executed
			int addi = intp + intp1;
			System.out.println(intp + " + " + intp1 + " = " + addi);
			break;
			/*This will stop the execution of more code and case testing inside the block
			When a match is found, and the job is done, it's time for a break. There is no need for more testing.*/
		case "b":
			int subt = intp - intp1;
			System.out.println(intp + " - " + intp1 + " = " + subt);
			break;
		case "c":
			int multi = intp * intp1;
			System.out.println(intp + " * " + intp1 + " = " + multi);
			break;
		case "d":
			//I want to get the floating point of the result so I convert it to double
			double divi = intp / intp1;
			System.out.println(intp + " / " + intp1 + " = " + divi);
			break;
			//The default keyword specifies some code to run if there is no case match.
		default:
			System.out.println("Wrong input, please choose only from the choices");
		}
	}

}

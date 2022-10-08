package javaControlStructures;
//import existing packages 
import java.util.*;
public class IfElseIf_StatementAct3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//class is used to get user input, and it is found in the java.util package
		//create a new object and store variable input 
		System.out.println("Christian Jay Baguio | DS2A\n");
		
		System.out.println("This is for the if-else-if statement");
		//create string choices for operations
		System.out.println("Choose a letter: \n");
		System.out.println("a) Addition");
		System.out.println("b) Subtraction");
		System.out.println("c) Multiplication");
		System.out.println("d) Division\n");
		//convert all into strings 
		String opt = sc.nextLine();
		
		/*Im using the java string equals() method because this method compares two strings,
		 *  and returns true if the strings are equal, and false if not
		 */
		//if user choose a then execute this portion
		if(opt.equals("a")) {
			System.out.print("Input first num: ");
			int intp = sc.nextInt();
			System.out.print("Input second num: ");
			int intp1 = sc.nextInt();
			
			int addi = intp + intp1;
			System.out.println(intp + " + " + intp1 + " = " + addi);
		}
		//else if the user choose b, then this part will execute
		else if(opt.equals("b")) {
			System.out.print("Input first num: ");
			int intp = sc.nextInt();
			System.out.print("Input second num: ");
			int intp1 = sc.nextInt();
			
			int subt = intp - intp1;
			System.out.println(intp + " - " + intp1 + " = " + subt);
		}
		//else if the user choose c, then this part will execute
		else if(opt.equals("c")) {
			System.out.print("Input first num: ");
			int intp = sc.nextInt();
			System.out.print("Input second num: ");
			int intp1 = sc.nextInt(); 
			
			int multi = intp * intp1;
			System.out.println(intp + " * " + intp1 + " = " + multi);
		}
		//else if the user choose c, then this part will execute
		else if(opt.equals("d")) {
			System.out.print("Input first num: ");
			int intp = sc.nextInt();
			System.out.print("Input second num: ");
			int intp1 = sc.nextInt();
			
			double divi = intp / intp1;
			//I want to get the floating point of the result so I convert it to double
			System.out.println(intp + " / " + intp1 + " = " + divi);
		}
		//if the user input something that is out from the choices
		else {
			System.out.println("Choose only from the choices. Thank you :)");
		}

	}

}

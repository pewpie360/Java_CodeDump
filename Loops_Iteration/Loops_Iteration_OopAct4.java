package loopState;
import java.util.*;
//import existing packages
public class Loops_Iteration_OopAct4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please input num: ");
		int f_num = sc.nextInt();
		//convert user input into integer
		
		
		//create a do state where there is a specific code to execute
		do {
			System.out.println("List of odd numbers from 1 to user input is ");
			//pass the user input to i and increment it
			for(int i = 1; i <= f_num; i++) {
				/*add conditional where if the user is divided into 2 and not equal to zero
				 * it will print values that is not equal to zero remainder which is odd numbers
				 */
				if(i % 2 != 0) {
					System.out.print(i + " ");
				}

			}
			System.out.println();
		} while(false);
		
		System.out.println("Please input another num: ");
		int summa = sc.nextInt();
	
		//create a int sum that has a value of 0 and the purpose of it is to pass the iteration on user input
		int sum = 0;
		//create a for loop that if the value of input is less than or equal to i then it increment the value and pass it to the sum
		for(int i = 0; i <= summa; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		//create while where if input is less than 0 then there is a print method
		while (summa < 0) {
			System.out.print("Below zero value");
			break;
		}
		
		System.out.println("Please input num for rows: ");
		int row = sc.nextInt();
		//convert user input into integer
		
		System.out.println("Please input num for colums: ");
		int column = sc.nextInt();
		//convert user input into integer
		
		//create a do state where there is a specific code to execute
		do {
			//for value input of user is less than i, then it will increment
		for(int i  = 0; i <= column; i++) {
			
			//print the value of row, column then print the multiply value
			System.out.println(row + " * " + i + " = " + row * i);
		}
		} while (false);
		
	}
}

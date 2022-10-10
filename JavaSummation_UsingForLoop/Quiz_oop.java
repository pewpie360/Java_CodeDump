package quizOop;
import java.util.*;
public class Quiz_oop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("input first num: ");
		int user1 = sc.nextInt();
		
		//create conditional that the user inputs an integer greater than 5 
		if (user1 > 5) {
			//create a int sum that has a value of 0 and the purpose of it is to pass the iteration on user input
			int sum = 0;
			for(int i = 5; i <= user1; i++) {
				sum = sum + i;
			}
			System.out.println(sum);

		}

		else {
			System.out.println("wrong input");
		}
			

	}

}

package Array_Oop;
import java.util.*;
import java.util.Arrays;
public class OneD_Array_Oop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i, inp, maximum, minimum, sum = 0;
		double average;
		
		do {
		//ngayo daan limit sa array
		System.out.println("Input limit array: ");
		inp = sc.nextInt();
		
		//conditional para sa user input
		if(inp >= 5) {
			System.out.println("Array is good to go");
		}
		if(inp < 0){
			System.out.println("Array limit must be positive num");
			return;
		}

		System.out.println("Input Value numbers for your array: ");
		//naka indicate na daan na max array is 5
		int array[] = new int[5];
		for(i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		maximum = array[0];
		minimum = array[0];
		
		for(i = 0; i < 5; i++) {
			if(maximum < array[i]) {
				maximum = array[i];
			}
			else if(minimum > array[i]) {
				minimum = array[i];
			}
		}
		System.out.println("This is your Array: " + Arrays.toString(array));
		System.out.println("The max value is: " + maximum);
		System.out.println("The min value is: " + minimum);
		
		for(i = 0; i < 5; i++) {
			sum = sum + array[i];
		}
		average = sum / 5;
		
		System.out.println("The sum of 5 numbers is: " + sum);
		System.out.println("The average of all numbers is: " + average);
		break;
	
	}
	while(inp > 0);
	System.out.println("Invalid Input");
	}
}

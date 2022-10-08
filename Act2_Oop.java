package javaOpSysIn;
import java.util.Scanner;

public class Act2_Oop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Activity 2 Object Oriented Programming\n");
		System.out.println("Christian Jay Baguio | DS2A\n");
			
		System.out.print("What's your Name? ");
		String name = sc.nextLine();
		
		System.out.println("Oh, Hello there " + name);
		
		System.out.print("Please input first num: ");
		int first_num = sc.nextInt();
		
		System.out.print("Please input second num: ");
		int second_num = sc.nextInt();
		
		int add = first_num + second_num;
		int min = first_num - second_num;
		int prod = first_num * second_num;
		int qou = first_num / second_num;
		
		System.out.println(first_num + " + " + second_num + " = " + add);
		System.out.println(first_num + " - " + second_num + " = " + min);
		System.out.println(first_num + " * " + second_num + " = " + prod);
		System.out.println(first_num + " / " + second_num + " = " + qou);
		System.out.println("That would be all thank you :>");
		

	}
}

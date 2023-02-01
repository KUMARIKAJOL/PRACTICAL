package controlstatement;

import java.util.Scanner;

//find out the sum of positive numbers
public class While_dowhile_test {
	public static void main(String[] args) {
		int sum =0;
		int number =0;
		
		//scanner class
		Scanner input = new Scanner(System.in); //take input
		//take input from user
		System.out.println("Enter the numbers ");
		int number1 = input.nextInt();
		while(number>=0) { //add only positive number
			sum+=number; // sum = sum+number
			System.out.println("Enter the number");
			number = input.nextInt();
			
			
		}
		System.out.println("sum is:"+sum);
		input.close();
		
		
	}

}

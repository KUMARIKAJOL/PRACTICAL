package controlstatement;

import java.util.Scanner;

public class While_dowhile_test2{
	public static void main(String[] args) {
		int sum =0;
		int number =0;
		
		//scanner class
		/*Scanner sc = new Scanner(System.in); //take input
		//take input from user
		System.out.println("Enter the numbers ");
		
		while(true) { //add only positive number
			number = sc.nextInt();
			if(number<0)break;
			
			sum+=number; // sum = sum+number
		}
			System.out.println("sum is:"+sum);
		sc.close();
		}}*/
			
		
		
		
				Scanner sc = new Scanner(System.in); //take input
				do {
					sum+=number;
				
				System.out.println("Enter the numbers ");
				
					number = sc.nextInt();
				}while(number >=0);
				
					System.out.println("sum is:"+sum);
				sc.close();
					
				
}}

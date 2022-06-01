package JavaAssignment3;

import java.util.Scanner;

//Write a program which checks if a number is prime or not.

public class CheckPrimeOrNot {

	public static void main(String[] args) {
		
		System.out.println("Enter the Number : " );
		Scanner sc = new Scanner (System.in);
		int num=sc.nextInt();
				
			 if (num % 2 != 0)
			 {
			  System.out.println(num + " is prime");
			 } else System.out.println("The given number is not prime");
			 
			 sc.close();
	}
		
	

}

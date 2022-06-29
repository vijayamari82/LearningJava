package HomeWork;

import java.util.Scanner;

public class eligibleAgeforVoting {

	public static void main(String[] args) {
		//int age = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of the person : ");
		int age = sc.nextInt();
		
		if(age>=18 && age<=60)
		{
			System.out.println("You are eligible for voting");
		}
		else if (age<18)
		{
			System.out.println("You are not eligible for voting");
		}
		
		else 
		{
			System.out.println("You are Senior Citizen");
		}
		
//		else
//		{
//		System.out.println("Enter a valid entry");
//		}
//		What if I want to print a valid entry or to say that it is a invalid entry ?
		sc.close();
	}
	
}



	
	
	
	
	



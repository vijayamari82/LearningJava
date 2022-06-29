package HomeWork;

import java.util.Scanner;

public class positiveOrnegative {
// Program for checking whether a given number is positive or negative
	
	public static void main(String[] args) {
     
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the number : ");
	int a = sc.nextInt();

	if (a>=0)
	{
		System.out.println("The give number is positive");
	}
	
	else 
	{
		System.out.println(" The given number is negative");
	}
	
	sc.close();
}

}

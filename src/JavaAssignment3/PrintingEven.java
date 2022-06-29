package JavaAssignment3;

import java.util.Scanner;

public class PrintingEven {
	
public static void main(String[] args) {
		
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number");
			int a=sc.nextInt();
					
		  for (int num = a; num >= 0; num --) 
			{
				   if (num % 2 == 0)
				   {
					
					   System.out.println("The even numbers are:" + num);
				     
				   }
				   
  
			}
		  
}
		
}

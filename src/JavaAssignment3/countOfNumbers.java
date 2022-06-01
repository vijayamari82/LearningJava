package JavaAssignment3;

import java.util.Scanner;

public class countOfNumbers {
	// Write a program to enter the numbers till the user wants and at
	//the end it should display the count of numbers entered

	public static void main(String[] args) {
		
		   System.out.println("Enter the Count of Numbers to be display : ");
		   Scanner sc = new Scanner(System.in);
		  int l=sc.nextInt();
		   
		  float sum=0;//50
		   
		   for(int i=1;i<=l;i++)//1<3,2<3,3<=3,4<=3
		   {  
			   System.out.println("Enter the value "+i);
			   float count=sc.nextFloat();
			  sum=sum+count; //35=35+15=50
		   }
		   System.out.println(sum);   
			  
				     		   
		   sc.close();
	
	}
}	
package JavaAssignment3;
import java.util.*;

public class EvenProgram {
	
	//Write a program which prints even numbers between  1 to 100 in reverse order.

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int sum=0,sum1=0;
				
	for (int num = a; num >= 0; num --) //5>=0
		{
			   if (num % 2 == 0)
			   {
				   sum=sum+num;
				   System.out.println("The even numbers are:" + sum);
			     
			   }
			   else
			   {
				   sum1=sum1+num;
				  
			   }
		}
	System.out.println("even value is "+sum+"odd value is "+sum1);
	}

}

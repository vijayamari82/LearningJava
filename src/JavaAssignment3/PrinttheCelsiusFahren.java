package JavaAssignment3;

import java.util.Scanner;

public class PrinttheCelsiusFahren {
//Change your program for Q2 so that if the user types in the value 0 (zero), 
//the program prints a table which looks like the following
//	Celsius     Fahrenheit
//	-20.00        -4.00
//	-15.00         5.00
//	-10.00        14.00

	public static void main(String[] args) {
	       double faren,celsius;
		   System.out.println("Choose the option to covert into : \n 1.Fahrenheit to Celsius  \n 2.Celsius to Fahrenheit\n");
		   Scanner sc = new Scanner (System.in);
		   int op=sc.nextInt();
		        
			if (op==1)
			   {
				      System.out.println("You have choosed Fahrenheit to Celsius !");
				      System.out.println("Enter  Fahrenheit temperature");
		              faren=sc.nextDouble();
			    	  celsius=(faren-32)*5/9;
			    	  System.out.println("Celsius temperature is = " + celsius);
				      
			   } else if(op==2) {
					  System.out.println("You have choosed Celsius to Fahrenheit !");
			          System.out.println("Enter  Celsius temperature");
		              celsius=sc.nextDouble();
			    	  faren=((9*celsius)/5)+32;
			    	  System.out.println("Fahrenheit temperature is = "+ faren);
				     
			   }  else System.out.println("please choose valid choice");
				 
	       		sc.close();
			} 
	}

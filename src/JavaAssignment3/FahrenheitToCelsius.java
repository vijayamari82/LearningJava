package JavaAssignment3;

import java.util.Scanner;

public class FahrenheitToCelsius {
	
//Write a program that can convert degrees Fahrenheit to degrees Celsius, or vice versa.
//Celsius to Fahrenheit:  (0°C × 9/5) + 32 = 32°F
//Fahrenheit to Celsius : Fo(32°F − 32) × 5/9 = 0°C
	
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

package JavaAssignment3;

import java.util.Scanner;

public class FahrenheitToCelsius {
	
//Write a program that can convert degrees Fahrenheit to degrees Celsius, or vice versa.
//Celsius to Fahrenheit:  (0°C × 9/5) + 32 = 32°F
//Fahrenheit to Celsius : Fo(32°F − 32) × 5/9 = 0°C
	
public static void main(String[] args) {
       double faren,celsius;
	   System.out.println("Choose type of conversion \n 1.Fahrenheit to Celsius  \n 2.Celsius to Fahrenheit");
	   Scanner sc = new Scanner (System.in);
	   int ch=sc.nextInt();
	        
		if (ch==1)
		   {
			      System.out.println("Enter  Fahrenheit temperature");
	              faren=sc.nextDouble();
		    	  celsius=(faren-32)*5/9;
		    	  System.out.println("Celsius temperature is = "+celsius);
			  //    break;
		   } else if(ch==2) {
				  
		          System.out.println("Enter  Celsius temperature");
	              celsius=sc.nextDouble();
		    	  faren=((9*celsius)/5)+32;
		    	  System.out.println("Fahrenheit temperature is = "+faren);
			//  break;
		     System.out.println("please choose valid choice");
		   }  
		
		sc.close();
		} 
}

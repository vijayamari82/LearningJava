package classPrograms;

import java.util.Scanner;

public class Personc {	//sub-class
	
	    int height, weight;
	    String parkname;
	    //Create a method in person class which will take park name as input and print I am at <parkname>
	    void parkname()
	    {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("Enter your Park Name :");
			parkname = sc.next();
			
	    }
	   
		void check()
		{
			
			System.out.println(" I am at" + Personc.parkname);
			
			if (height > 90 && height < 200)
			{
				if(weight > 15 && weight < 95)
				{
					System.out.println("You are allowed to Ride");
				}
				else  //Weight Else Block
				{
					System.out.println("You are not Eligble to Ride");
				}
			}
			else //Height Else Block
			{
				System.out.println("You are not Eligble to Ride");
			} 
		    
		
	}
    



}

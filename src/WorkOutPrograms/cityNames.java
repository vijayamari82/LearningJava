package WorkOutPrograms;

import java.util.Scanner;

public class cityNames {

	public static void main(String[] args) {
		String[] cityNames = new String[5];
		Scanner sc = new Scanner(System.in);
	
		for (int i = 0;  i < cityNames.length; i++)
		{
		    System.out.print("Enter City Name: ");
		    cityNames[i] = sc.next();
		}

		System.out.println("The total names of the City are:  \n");
		for (int i = 0;  i < cityNames.length; i++)
		{
		    System.out.print(cityNames[i]);
		    
		    
		}	
		
		
		System.out.println("Enter the City name to be Searched :");
        String cityToSearch = sc.next();
        for (int i = 0;  i < cityNames.length; i++) 
        {
		    if(cityNames[i].equals(cityToSearch))
		    		{
		    	System.out.println("You got the City");
		    	
		    		}
           else
		    {
		    	System.out.println("Your City is not there");
		    	break;
		    }
		 }
        
	}

}

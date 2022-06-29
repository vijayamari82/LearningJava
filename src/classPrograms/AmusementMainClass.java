package classPrograms;

import java.util.Scanner;

public class AmusementMainClass {

	public static void main(String[] args) {
	
		
		{
			Personc ap = new Personc();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your Height");
			ap.height = sc.nextInt();
			System.out.println("Enter your Weight");
			ap.weight = sc.nextInt();
			ap.check();
   		    sc.close();
} 
		
		
	}

}

package HomeWork;

import java.util.Scanner;

public class person {
	
	public static void main(String[] args)
		{
			AmusementParkClass ap = new AmusementParkClass();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your Height");
			ap.height = sc.nextInt();
			System.out.println("Enter your Weight");
			ap.weight = sc.nextInt();
			ap.check();
   		   sc.close();
} 

}






package javaAssignment4ClassMethod;

import java.util.Scanner;

public class person {
	
	public static void main(String[] args)
		{
			AmusementParkClass apd = new AmusementParkClass();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your Height");
			apd.height1 = sc.nextInt();
			System.out.println("Enter your Weight");
			apd.weight1 = sc.nextInt();
			apd.check1();
   		    sc.close();
} 

}






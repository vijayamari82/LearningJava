package javaAssign6MethodContructor;

import java.util.Scanner;

public class CalMainClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a,b,r,option;
		System.out.println(" Enter the two digits: ");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Choose you option of operation: ");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		option =sc.nextInt();
		while (option>4)
		{
		System.out.println("Choose the correct option: ");
		option=sc.nextInt();
		}
		CalClass obj = new CalClass();
		
	    if (option==1)
	    {
	    	r = obj.add(a,b);
	    	System.out.println("Result : " + r);
	    	
	    }else if (option ==2)
	    {
	    	r = obj.sub(a, b);
	    	System.out.println("Result : " + r);
	    }else if (option ==  3)
	    {
	     	r = obj.mul(a, b);
	     	System.out.println("Result : " + r);
	    }else if (option ==4)
	    {
	    	r = obj.div(a, b);
	    	System.out.println("Result : " + r);
	    }sc.close();
	   
	    }

}

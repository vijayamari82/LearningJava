package JavaAssignment4SwitchArray;
import java.util.Scanner;

public class calculatorQuestion1 {

public static void main(String[] args) {
		
		
    //String operation = "addition";
				
    Double number1, number2, result;

    Scanner input = new Scanner(System.in);
				    
				    
   	System.out.println("Enter first number: ");
    number1 = input.nextDouble();

    System.out.println("Enter second number: ");
    number2 = input.nextDouble();

    System.out.println("Enter the operation");
    System.out.println("1 for addition: ");
    System.out.println("2 for substraction ");
    System.out.println("3 for mulitiplication ");
    System.out.println("4 for division ");
    int operation = input.nextInt();
				    
   	switch (operation) {

         case 1:
				        
    	 result = number1 + number2;
		 System.out.println("you choose addition");
		 System.out.println("Result = " + number1 + " + " + number2 + " = " + result);
		 break;

         case 2:
	     result = number1 - number2;
	     System.out.println("you choose substraction");
	     System.out.println("Result = " + number1 + " - " + number2 + " = " + result);
	     break;

         case 3:
	     result = number1 * number2;
	     System.out.println("you choose mulitiplication");
	     System.out.println("Result = " + number1 + " * " + number2 + " = " + result);
	     break;

	     case 4:
	     
	     result = number1 / number2;
	     System.out.println("you choose division");
	     System.out.println("Result = " + number1 + " / " + number2 + " = " + result);
	     break;

         default:
	     System.out.println("Invalid operator!");
	     break;
	   }
         input.close();
	}

}

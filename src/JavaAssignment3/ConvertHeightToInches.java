package JavaAssignment3;
import java.util.Scanner;

public class ConvertHeightToInches {

	public static void main(String[] args) {
			   
		        Scanner in = new Scanner(System.in);
		        System.out.println("Type in height in two parts.");
		        System.out.print("Feet: ");
		        double feet = in.nextDouble();
		        System.out.print("Inches:\n ");
		        double inches = in.nextDouble();
		        System.out.println("The height in centimeters: " + (30.48 * feet + 2.54 * inches));
		        
		        in.close();
				  
		    }
	
}



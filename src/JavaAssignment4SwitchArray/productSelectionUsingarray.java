package JavaAssignment4SwitchArray;

import java.util.Scanner;
import java.util.Arrays;
public class productSelectionUsingarray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		  String[] apple = {"ihone12","iphone12 mini","iphone 11","iphone 11"};
		  String[] samsung = {"s20","s21","flip3","fold3"};
		  String[] google = {"Google Pixel 6","Google Pixel 6 pro","Google Pixel pro", "Google Pixel 5"};
		    
		  String[] selectedProduct = null; 
		  System.out.print("Enter the phone brand name: ");
		  
		  String operation = input.nextLine();
		    switch (operation) {

		      case "apple":
		    	  System.out.println(Arrays.toString(apple));
		    	  selectedProduct = apple;
		        break;

		      case "samsung":
		    	  System.out.println(Arrays.toString(samsung));
		    	  selectedProduct = samsung;	
		        break;

		      case "google":
		    	  System.out.println(Arrays.toString(google));
		    	  selectedProduct = google;
		        break;

		  
		      default:
		        System.out.println("Invalid product name!");
		        break;
		    }

		    
		    System.out.print("enter one product name.");
		    String productName = input.nextLine();
			
		    
		    if (Arrays.toString(selectedProduct).contains(productName)) {
			  System.out.println("Product selected is: " + productName);
		    }else {
		    	 System.out.print("Please select a product from the list");
		    }
		    
		    input.close();
		  }
			
}


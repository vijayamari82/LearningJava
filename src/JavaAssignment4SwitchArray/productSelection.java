package JavaAssignment4SwitchArray;
import java.util.Scanner;
public class productSelection {

public static void main(String []args)
{
	Scanner sc = new Scanner(System.in);
	String samsung[] = {"S20","S21","Flip3","Fold3"};
	String apple[] = {"Iphone12","IPhone 12 Mini", "Iphone11"};
	String google[] = {"Google Pixel 6", "Google Pixel 6 Pro", "Google Pixel Pro", "Google Pixel 5"};
	System.out.println("Choose Your Brand");
	System.out.println("samsung");
	System.out.println("google");
	System.out.println("iphone");
	String choice = sc.nextLine();
	if(choice.equals("samsung"))
	{
		System.out.println("Choose Your Product");
		for(int i = 0; i<samsung.length;i++)
		{
			
			System.out.println(samsung[i]);
		}
		String brand = sc.nextLine();
		switch(brand)
		{
		case "S20": System.out.println("Your Product is Avalible");
					break;
		case "S21": System.out.println("Your Product is Avalible");
					break;
		case "Flip3": System.out.println("Your Product is Avalible");
					break;
		case "Fold3": System.out.println("Your Product is Avalible");
					break;
		default : System.out.println("Your Product is Unavalible");
		}
	}
	else if(choice.equals("google"))
	{
		System.out.println("Choose Your Product");
		for(int i = 0; i<google.length;i++)
		{
			
			System.out.println(google[i]);
		}
		String brand = sc.nextLine();
		switch(brand)
		{
		case "Google Pixel 6": System.out.println("Your Product is Avalible");
					break;
		case "Google Pixel 6 Pro": System.out.println("Your Product is Avalible");
					break;
		case "Google Pixel Pro": System.out.println("Your Product is Avalible");
					break;
		case "Google Pixel 5": System.out.println("Your Product is Avalible");
					break;
		default : System.out.println("Your Product is Unavalible");
		}
	}
	else if(choice.equals("Apple"))
	{
		System.out.println("Choose Your Product");
		for(int i = 0; i<apple.length;i++)
		{
			
			System.out.println(apple[i]);
		}
		String brand = sc.nextLine();
		switch(brand)
		{
		case "Iphone12": System.out.println("Your Product is Avalible");
					break;
		case "Iphone12 mini": System.out.println("Your Product is Avalible");
					break;
		case "Iphone 11": System.out.println("Your Product is Avalible");
					break;
		default : System.out.println("Your Product is Unavalible");
		}
	}
	sc.close();;
  }
}


//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		  String[] apple = {"ihone12","iphone12 mini","iphone 11","iphone 11"};
//		  String[] apple1 = {"ihone12","iphone12 mini","iphone 11","iphone 11"};
//		  
//		  String[] samsung = {"s20","s21","flip3","fold3"};
//		  String[] google = {"Google Pixel 6","Google Pixel 6 pro","Google Pixel pro", "Google Pixel 5"};
//		    
//		  System.out.print("Choose your brand name: ");
//		  String operation = input.nextLine();
//		  
//		    switch (operation) {
//
//		      case "apple":
//		    	  
//		       System.out.println(Arrays.toString(apple));
//		   	   System.out.print("enter one product name : ");
//		       String productName = input.nextLine();
//		      // boolean productFound = false;
//		       System.out.println(" The product to be found is   : " + productName);
//		     	if(productName.equals(Arrays.toString(apple)))
//		     		
//		     	System.out.println("found");
//		     	{
//		     	  for(int i=0;i<apple.length;i++)
//		     		  
//			     	    { 
//			     	    	if(apple[i].equalsIgnoreCase(productName))
//			     	    			{
//			     	    		     System.out.println("The selected product is :" + productName);
//  			     	    		    } else System.out.println("The selected product name :" + productName);
//			     	    }
//		     		  
//		       }					    
//		    break;
//		    
//		      case "samsung":
//		    	  System.out.println(Arrays.toString(samsung));
//		    	  break;
//
//		      case "google":
//		    	  System.out.println(Arrays.toString(google));
//		          break;
//		  
//		      default:
//		         System.out.println("Invalid product name!");
//		         break;
//		    }
//
//		    
//     	    
////			
//     	   
////		    if (Arrays.toString(selectedProduct).contains(productName)) {
////			  System.out.println("Product selected is: " + productName);
////		    }else {
////		    	 System.out.rint("Please select a product from the list");
////		    }
////		    
//		    input.close();
//		  }
//			
//}
//

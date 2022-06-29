package javaAssign6MethodContructor;
import java.util.Scanner;

public class ProductsList {

	public static void main(String[] args) {
		
	    {
	      Scanner sc = new Scanner(System.in);
	      boolean choice = false;
	      String cc = " ";
	      do
	      {
	          Invoice pd1 = new Invoice();
	          System.out.println("Enter the Product");
	          pd1.product = sc.next();
	          System.out.println("Enter the Quantity");
	          pd1.quantity = sc.nextInt();
	          System.out.println("Enter the Price");
	          pd1.price = sc.nextInt();
	          pd1.total = pd1.quantity*pd1.price;
	          System.out.println("Do You want to Enter Another Product , If Yes then press yes");
	          cc=sc.next();
	          pd1.calculate();
	          if(cc.equals("yes"))
	          {
	              choice = true;
	          }
	      }while(choice);
	      sc.close();
	    }
	}
	
}

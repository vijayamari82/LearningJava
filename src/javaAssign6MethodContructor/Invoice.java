package javaAssign6MethodContructor;

public class Invoice {
	
	    String product;
	    int price;
	    int quantity;
	    int total;
	    int total_bill_amount=0;
	    void calculate()
	    {
	        total_bill_amount += (total*13)/100;
	        total_bill_amount += total;
	        System.out.println("Product" + product);
	        System.out.println("Price" + price);
	        System.out.println("Quantity" + quantity);
	        System.out.println("Total: " + total);
	        System.out.println("Total Bill Amount Including Tax:  " + total_bill_amount);
	    }
	
}

package javaAssign6MethodContructor;

public class Product
{
	String name;
	double pricePerunit;
	String description;
	int quantity;

	public Product(String name, double pricePerunit, String description,int qty) 
	{
		//super();
		this.name = name;
		this.pricePerunit = pricePerunit;
		this.description = description;
		this.quantity = qty;
	} 
	
}

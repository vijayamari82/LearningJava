package javaAssign6MethodContructor;

public class Laptop {
	
	String laptopName; // Variable declaration
	int ramSize;
	String processorType;
	
	void display() // method used only for displaying the values
	{
		System.out.println("The Name of the Laptop is : " + laptopName);
		System.out.println("The Size of the RAM is : " + ramSize);
		System.out.println("The Processor type is : " + processorType);
		
	}
	
	void methodDisplay(String name, int size, String processor)// method using for initializing variable
	{
		laptopName=name;
		ramSize=size;
		processorType= processor;
	}
	
	Laptop(String name, int size, String processor)// Constructor with parameters using for initializing variables
	{
		laptopName=name;
		ramSize=size;
		processorType=processor;
	}

}




public class Laptop {
	
	String laptopName;
	int ramSize;
	
	void display() // method used only for displaying the values
	{
		System.out.println("The Name of the Laptop is : " + laptopName);
		System.out.println("The Size of the RAM is : " + ramSize);
	}
	
	void methodDisplay(String name, int size)// method using for initializing variable
	{
		laptopName=name;
		ramSize=size;
	}
	
	Laptop(String name, int size)// Constructor with parameters using for initializing variables
	{
		laptopName=name;
		ramSize=size;
	}

}



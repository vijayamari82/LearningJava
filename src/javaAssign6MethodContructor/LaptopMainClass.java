package javaAssign6MethodContructor;

public class LaptopMainClass {

	public static void main(String[] args)
	{
          Laptop obj1 = new Laptop();
          Laptop obj2 = new Laptop();
          obj1.display();
//		 
//		 obj1.laptopName = "HP";
//		 obj1.ramSize = 32;
//		 obj1.display();
//		 
//		 Laptop obj2 = new Laptop();
//		 //obj2.laptopName
		 
		 Laptop obj3 = new Laptop("ACer" , 16, "AMD");
		 obj3.display();

	}

}

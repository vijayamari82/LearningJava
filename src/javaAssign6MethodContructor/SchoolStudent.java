package javaAssign6MethodContructor;

public class SchoolStudent {
	   String name;
	   int py,java,ds,ml,ai;
	   void percentage()
	   {
	       int total = py+java+ds+ml+ai;
	       int average = total/5;
	       System.out.println("Your Average is "+ average);
	   }
}

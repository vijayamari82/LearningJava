package javaAssign6MethodContructor;

public class StringJava {

	public static void main(String[] args) {
	
	int count =0;
	String[] name = new String [4];
	name[0] = "Jerin";
	name[1] = "John";
	name[2] = "Jerin";
	name[3] = "Jerin";
	
	for (int i=0;i<name.length;i++)
	{
     	if	(name[i].equals("Jerin"))
		{
			//count ++;
			++ count;
		}
	  
	} 
    System.out.println("The no. of times the name Jerin is : " + count);
	//System.out.println("The match found :" + count);
}
}

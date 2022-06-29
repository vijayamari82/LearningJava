package javaAssign6MethodContructor;

import java.util.Scanner;

public class SchoolStudentMainClass {

public static void main(String[] args) {
		
   {
     Scanner sc = new Scanner(System.in);
     boolean stu = false;
	      do
	      {
	          SchoolStudent stud = new SchoolStudent();
	          System.out.println("Enter the Student Name");
	          stud.name = sc.next();
	          System.out.println("Enter the Python Marks");
	          stud.py = sc.nextInt();
	          System.out.println("Enter the JAVA Marks");
	          stud.java = sc.nextInt();
	          System.out.println("Enter the Data Science Marks");
	          stud.ds = sc.nextInt();
	          System.out.println("Enter the Machine Learning Marks");
	          stud.ml = sc.nextInt();
	          System.out.println("Enter the Artifical Intelligence Marks");
	          stud.ai = sc.nextInt();
	          stud.percentage();
	          System.out.println("Do You want to Enter either Student Marks");
	          String choice = sc.next();
	          if(choice.equalsIgnoreCase("Yes"))
	          {
	            stu = true;   
	          }
	          else
	          {
	              stu = false;
	          }
	      }while(stu);
	      sc.close();
	    }
	}
}

package javaAssignment4ClassMethod;

import java.util.Scanner;

public class employeeDetailsMainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("<--------------   Employee Details ----------->");
        employee emp = new employee();
        System.out.println("First Name " + emp.firstName);
        System.out.println("Last Name " + emp.lastName);
        System.out.println("Hourly Rate " + emp.hourlyRate);
        System.out.println("Enter the hours worked in a Week ");
        int workingdays = sc.nextInt();
        emp.salary(workingdays);
        sc.close();
   }	
} 

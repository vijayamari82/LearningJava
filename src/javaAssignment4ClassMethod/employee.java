package javaAssignment4ClassMethod;

public class employee {
String firstName = "Viji";
String lastName = "Mari";
double hourlyRate = 10;
void print() { //Method to print the details
//System.out.println("First Name " + firstName);
//System.out.println("Last Name " + firstName);
//System.out.println("Hourly Rate " + hourlyRate);
}	

void salary(int noOfHoursWorked )
{
	double salary = hourlyRate * noOfHoursWorked;
	System.out.println("Salary : "  + salary);
}
}

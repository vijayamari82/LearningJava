package classPrograms;
import java.util.*;

public class EmployeeMainClass {

	public static void main(String[] args) {
		
				
				DetailOfEmployee emp = new DetailOfEmployee();
				Scanner sc = new Scanner(System.in);
				System.out.println("How Many Employee You will Enter??");
				int no_of_employee = sc.nextInt();
				for(int i = 1; i <=no_of_employee;i++)
				{
				System.out.println("Employee " + i + " Details"); 
				System.out.println("Enter Employee First Name");
				emp.firstName = sc.next();
				System.out.println("Enter Employee Last Name");
				emp.lastName = sc.next();
				System.out.println("Enter Employee Hourly Rate");
				emp.hourlyRate = sc.nextFloat();
				System.out.println("<----------------------Employee Details-------------------------------->");
				//emp.print();
				System.out.println("First Name "+ emp.firstName);
				System.out.println("Last Name "+ emp.lastName);
				System.out.println("Hourly Rate "+ emp.hourlyRate);
				System.out.println("Enter the hours worked in a Week");
				int workingdays = sc.nextInt();
				emp.salary(workingdays);
				}
				sc.close();
			}


}

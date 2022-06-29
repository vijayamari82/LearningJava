package javaAssignment4ClassMethod;

public class Newemploee {

	public static void main(String[] args) {
		[11:53 p.m., 2022-06-17] +91 81222 87069: import java.util.*;
		class Employee
		{
			String firstName = "", lastName = "";
			float hourlyRate;
			int employee;
			
			//void print()
			//{
				//System.out.println("First Name "+ firstName);
				//System.out.println("Last Name "+ lastName);
				//System.out.println("Hourly Rate "+ hourlyRate);
			//}
			void salary(int no_of_hours_worked)
			{
				float salary = hourlyRate * no_of_hours_worked;
				System.out.println("Salary " + salary);
			}
		}
		public class q3 {

			public static void main(String[] args) 
			{
				Employee emp = new Employee();
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

}

package inheritance;

public class Employee {
		
		String firstName;
		String lastName;
		int sinNumber;
		float salary;
		Employee(String firstName, String lastName, int sinNumber, float salary)
		{
			this.firstName = firstName;
			this.lastName = lastName;
			this.sinNumber = sinNumber;
			if(salary >= 0)
			{
				this.salary = salary;
			}
	    }
		
}
//	class permanentEmployee extends Employee
//	{
//
//		permanentEmployee(String firstName, String lastName, int sinNumber, float salary) 
//		{
//			super(firstName, lastName, sinNumber, salary);
//		}
//		 public void setFirstName(String firstName) 
//		 {
//		        this.firstName = firstName;
//		 }
//		 public String getFirstName() 
//		 {
//		        return firstName;
//		 }
//		 public void setLastName(String lastName) 
//		 {
//		        this.lastName = lastName;
//		 }
//		 public String getLastName() 
//		 {
//		        return lastName;
//		 }
//		 public void setsalary(float salary) 
//		 {
//		        if (salary >= 0) 
//		        {
//		            this.salary = salary;
//		        }
//		  }
//
//		  public double getsalary()
//		  {
//		        return salary;
//		   }
//		  void calculatePay(float salary_per_day)
//		  {
//			  salary = salary_per_day*14;
//		  }
//	}
//	class contractualEmployee extends Employee
//	{
//
//		contractualEmployee(String firstName, String lastName, int sinNumber, float salary) 
//		{
//			super(firstName, lastName, sinNumber, salary);
//		}
//		 public void setFirstName(String firstName) 
//		 {
//		        this.firstName = firstName;
//		 }
//		 public String getFirstName() 
//		 {
//		        return firstName;
//		 }
//		 public void setLastName(String lastName) 
//		 {
//		        this.lastName = lastName;
//		 }
//		 public String getLastName() 
//		 {
//		        return lastName;
//		 }
//		 public void setsalary(float salary) 
//		 {
//		        if (salary >= 0) 
//		        {
//		            this.salary = salary;
//		        }
//		  }
//
//		  public double getsalary()
//		  {
//		        return salary;
//		   }
//		  void calculatePay(int hours)
//		  {
//			  float hourly_wage = 20;
//			  salary = hours*hourly_wage;
//		  }
//	}
//	class commisionEmployee extends Employee
//	{
//
//		commisionEmployee(String firstName, String lastName, int sinNumber, float salary) 
//		{
//			super(firstName, lastName, sinNumber, salary);
//		}
//		 public void setFirstName(String firstName) 
//		 {
//		        this.firstName = firstName;
//		 }
//		 public String getFirstName() 
//		 {
//		        return firstName;
//		 }
//		 public void setLastName(String lastName) 
//		 {
//		        this.lastName = lastName;
//		 }
//		 public String getLastName() 
//		 {
//		        return lastName;
//		 }
//		 public void setsalary(float salary) 
//		 {
//		        if (salary >= 0) 
//		        {
//		            this.salary = salary;
//		        }
//		  }
//
//		  public double getsalary()
//		  {
//		        return salary;
//		   }
//		  void calculatePay(int salescount)
//		  {
//			  float basesalary = 20000;
//			  float product = 8000, percent ;
//			  percent = (product*15)/100;
//			  if(salescount >=10)
//			  {
//				  salary = basesalary+percent;
//			  }
//			  else
//			  {
//				  salary = basesalary;
//			  }
//		  }
//	
//}

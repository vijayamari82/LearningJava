package inheritance;

class contractualEmployee extends Employee
	{

		contractualEmployee(String firstName, String lastName, int sinNumber, float salary) 
		{
			super(firstName, lastName, sinNumber, salary);
		}
		 public void setFirstName(String firstName) 
		 {
		        this.firstName = firstName;
		 }
		 public String getFirstName() 
		 {
		        return firstName;
		 }
		 public void setLastName(String lastName) 
		 {
		        this.lastName = lastName;
		 }
		 public String getLastName() 
		 {
		        return lastName;
		 }
		 public void setsalary(float salary) 
		 {
		        if (salary >= 0) 
		        {
		            this.salary = salary;
		        }
		  }

		  public double getsalary()
		  {
		        return salary;
		   }
		  void calculatePay(int hours)
		  {
			  float hourly_wage = 20;
			  salary = hours*hourly_wage;
		  }
}

package inheritance;


	class permanentEmployee extends Employee
	{

		permanentEmployee(String firstName, String lastName, int sinNumber, float salary) 
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
		  void calculatePay(float salary_per_day)
		  {
			  salary = salary_per_day*14;
		  }
	
}

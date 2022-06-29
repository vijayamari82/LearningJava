package classPrograms;

public class DetailOfEmployee {
	
	String firstName = "", lastName = "";
	float hourlyRate;
	int employee;
	
	
	void salary(int no_of_hours_worked)
	{
		float salary = hourlyRate * no_of_hours_worked;
		System.out.println("Salary " + salary);
	}

}

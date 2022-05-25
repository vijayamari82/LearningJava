package testassignment;

public class LicenseIssue {

	public static void main(String[] args) {
		int age=18;
		String currentlevel = "G";
			
		if (age>=18 && currentlevel.equals("G1"))
						
		{					
			System.out.println("license issued is G1");
		}
		else if (age>=18 && currentlevel.equals("G2"))
			
		{					
			System.out.println("license issued is G2 ");
		}
		
        else if (age>=18 && currentlevel.equals("G"))
			
		{					
			System.out.println("license issued is G ");
		}
	}
	

}
		
 

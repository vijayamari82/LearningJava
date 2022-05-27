package testassignment;

public class LicenseIssue {

	public static void main(String[] args) {
		int age=16;
		String currentlevel = "G";
			
		if (age<16) {					
			System.out.println("you are less than 16");
		} 
		else if (age>=16 && currentlevel.equals("G1")){					
			System.out.println("license issued is G1");
		}
		else if (age>=16 && currentlevel.equals("G2")){					
			System.out.println("license issued is G2 ");
		}
		else if (age>=16 && currentlevel.equals("G")){					
			System.out.println("you have got full G license");
		} else {
			System.out.println("Go for G1");
		}
	}



	

}
		
 

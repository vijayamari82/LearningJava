
public class SalaryCal {

	public static void main(String[] args) {
		int TotalHrs =40;
		double payRate=14;
		double grossPay =0;
		double netPay=0;
		double Tax=0;
		GrossPay=TotalHrs*PayRate;
		System.out.println("Gross Pay in =" + "$"+ grossPay);
		Tax=(0.10*GrossPay);
		System.out.println("Tax on Gross Pay =" + "$" + Tax);
		NetPay=GrossPay-Tax;
		System.out.println("The Net Pay the Employee gets: " + "$"+ NetPay);
				
		
	}

}

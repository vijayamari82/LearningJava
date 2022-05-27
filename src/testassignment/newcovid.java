package testassignment;

public class newcovid {

	public static void main(String[] args) {
		int maxCapacity = 50;
		int currentCapacity= 15;
		int allowCapacity= 8;
		int peopleWent= 0;

		System.out.println("Current Capacity of People = " + currentCapacity);

		int newCapacity = currentCapacity + allowCapacity - peopleWent;
		while (newCapacity <= maxCapacity) {
		
		System.out.println("Allowed and new capacity will be = " + newCapacity);
		
		newCapacity = newCapacity + allowCapacity - peopleWent;
		}
			
		System.out.println ("Maximum Capacity Reached");
	}
		

}


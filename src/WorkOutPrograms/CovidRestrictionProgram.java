package WorkOutPrograms;

public class CovidRestrictionProgram {

	public static void main(String[] args) {
		int maxCapacity =50;
		int currentCapacity=25;
		int allowCapacity=7;
		int peopleWentOut=5;
		//int newNumberOfpeopleInside=0;
		
	    int	numberOfpeopleInside = (currentCapacity-peopleWentOut) + allowCapacity;
	    System.out.println("Number of People inside  =" + numberOfpeopleInside);
	    
	     //while(newNumberOfpeopleInside<=maxCapacity) {
	    // if(numberOfpeopleInside==50) 
	    	 
	      while(numberOfpeopleInside<=maxCapacity) {
	      if(((numberOfpeopleInside+allowCapacity)-peopleWentOut)<maxCapacity) {
	    	
	    	numberOfpeopleInside=((numberOfpeopleInside+allowCapacity)-peopleWentOut);
	    	
	    	System.out.println("Current People inside in shop at present is :  " + numberOfpeopleInside);
		     	
	      }
	 	   
	      }
	     }
	     
	
}
	   
			

	
	
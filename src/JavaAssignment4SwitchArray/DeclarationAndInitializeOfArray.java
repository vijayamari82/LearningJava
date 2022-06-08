package JavaAssignment4SwitchArray;

public class DeclarationAndInitializeOfArray {

	public static void main(String[] args) {
		
		     int[] samarray;          //declaration
		     samarray = new int[5];   //instantiation
		     samarray[0] = 10;        //initialization
		     System.out.println("samarray[0] = " + samarray[0]); //accessing and printing array elements
		                                                       
		     System.out.println("samarray[1] = " + samarray[1]);
		     int [] oddArray = {1,3,5,7};    //initialization with array literal
		     System.out.println("oddArray[0] = " + oddArray[0]);
		     System.out.println("oddArray[1] = " + oddArray[1]);
		     System.out.println("oddArray[2] = " + oddArray[2]);
		     System.out.println("oddArray[3] = " + oddArray[3]);
		   }
}

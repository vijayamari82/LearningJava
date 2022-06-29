package WorkOutPrograms;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class indexPointer {

 public static void main(String[] args) {
		

   String[] daysInAWeek =  {"5","2","3","4","5","6","5"}; //Initialization block
   //new String[7]; // length of an array

  // System.out.println(daysInAWeek);

				
   System.out.println("Days in a week " + Arrays.toString(daysInAWeek));

   Scanner sc = new Scanner(System.in);

   System.out.println("Length of Array =" + daysInAWeek.length);

   int index =0;
   int counter =0;
   int[] indexArray = new int[daysInAWeek.length];
  				
	for (int i = 0; i < daysInAWeek.length; i++) {

	if (daysInAWeek[i].equals("5")) {
	index =i;
	indexArray[counter]=i;
	counter++;
						
	System.out.println("Index at which 5 is stored : "+index);
						
	}
	}
				
	// Print at which index 5 exists
 System.out.println("5 exists in array this no of times "+counter);
 for (i=0;i<)
 System.out.println("5 exists at indexs "+Arrays.toString(indexArray));

 }

		
}




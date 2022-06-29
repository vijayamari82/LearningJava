import java.util.Scanner;

public class RealWorldExample {

   public static void main(String[] args) {
	   
	   
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the loan amount :\n");
   int loanAmount = sc.nextInt();
   System.out.println("The loan amount :" + loanAmount);
   double intCalOnLoan = sc.nextDouble();
   System.out.println("The intCalOnLoan : " + intCalOnLoan);
  // System.out.println("The interst on the loan amount is : " + interestCalOnLoan);
   
   for(int i=0;i<=3;i++);
   {
	   intCalOnLoan=loanAmount*.10;
	   System.out.println("Your interest amount for this nmonth:" + intCalOnLoan);
   }
   sc.close();
}

}

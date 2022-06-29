package atmPackage;

import java.util.Scanner;

public class AtmMainClass {

public static void main(String []args)
		{
			Scanner sc=new Scanner(System.in);
			atmOperations atm = new atmOperations(); //Created the Object for ATM_Operation Class
			Customer per = new Customer(34567,"Viji",25000,"Savings");
			Customer per1 = new Customer(34567,"Viji",25000,"Checking");
			int pin=1234;
			System.out.println("Enter the PIN");
			int cpin=sc.nextInt();
			if(cpin == pin)  //Validating the pin
			{
				per.display();
				per1.display();
				System.out.println("Choose Your Account Type");
				String acc_type = sc.next();
				if(acc_type.equalsIgnoreCase("Savings") || acc_type.equalsIgnoreCase("Checking"))
				{
					System.out.println("Welcome to ABC Bank");
					System.out.println("Press 1 for Cash Deposit");
					System.out.println("Press 2 for Cash Withdraw");
					System.out.println("Press 3 for Daily Cash Limit");
					System.out.println("Press 4 for Account Details");
					int option = sc.nextInt(); 
					if(option==1)
					{
						System.out.println("Enter your amount");
						int a=sc.nextInt();
						atm.cash_Deposit(a); //Passing the arguments
					}
					else if(option == 2)
					{
						System.out.println("Enter the Amount You want to withdraw");
						int withdraw = sc.nextInt();
						System.out.println("Enter the denomination You want to withdraw"); //Based on the Currency Notes
						System.out.println("enter the no.of.notes of $100");
						int b=sc.nextInt(); //gets no.of.notes in $100
						System.out.println("enter the no.of.notes of $50");
						int c=sc.nextInt(); //gets no.of.notes in $50
						System.out.println("enter the no.of.notes of $20");
						int d=sc.nextInt(); //gets no.of.notes in $20
						System.out.println("enter the no.of.notes of $10");
						int e=sc.nextInt();
						atm.cash_withdraw(withdraw,b,c,d,e);		
					}
				else if(option == 3)
				{
					atm.daily_limit();
							
				}
				else if(option == 4)
				{
					
					per.display();
					per1.display();
				}
				
			}
			}
			else
			{
				System.out.println("Choose the Correct Type of Your Account");
			}
		}
			
			

}
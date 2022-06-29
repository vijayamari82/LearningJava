package atmPackage;

public class atmOperations {

		private int balance = 10000, withdraw_limit= 50000;
		void cash_Deposit(int a) //Trying passing class objects as method arguments.
		{
			System.out.println("Please wait processing.......");
			System.out.println("Cash deposited Successfully");
			balance=a+balance;
			System.out.println("Balance amount is ="+balance);

		}
		void cash_withdraw(int withdraw,int b,int c,int d,int e)// Method For Cash Withdraw
		{
			if(withdraw < balance)
			{
				if(withdraw%10==0) //constant value 5000%100 == 0
				{
					System.out.println("$100"+"*"+b+"="+100*b);
					System.out.println("$50"+"*"+c+"="+50*c);
					System.out.println("$20"+"*"+d+"="+20*d);
					System.out.println("$10"+"*"+e+"="+10*e);
					int total=100*b+50*c+20*d+10*e;
					System.out.println("total ="+total);
					if(withdraw==total)
					{
						System.out.println("please wait processing.......");
						System.out.println("Cash deposited Successfully");
						balance-=withdraw;
						System.out.println("Please Collect Your Cash. Your Updated Balance is " + balance );
					}
					else
					{
						System.out.println("Your Denomiation does not match");
					}
				}
				
			}
			else
			{
				System.out.println("Insufficent Balance");
			}
		}
		void daily_limit()
		{
			System.out.println("Your Daily Limit is " + withdraw_limit);
		}
		
		
}
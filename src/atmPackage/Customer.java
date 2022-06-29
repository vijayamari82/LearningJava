package atmPackage;

public class Customer

{
	int bank_ac_no ;
	String name ;
	int total_funds;
	String type_of_ac; 
	Customer (int bank_ac_no, String name, int total_funds,String type_of_ac)
	{
		this.bank_ac_no = bank_ac_no;
		this.name = name;
		this.total_funds = total_funds;
		this.type_of_ac = type_of_ac;
	}
	void display()
	{
		System.out.println("Account Number " + bank_ac_no);
		System.out.println("Name " + name);
		System.out.println("Total Funds " + total_funds);
		System.out.println("Type of Account " + type_of_ac);
	}
}
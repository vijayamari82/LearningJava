package javaAssign6MethodContructor;

public class Invoice1
{
		double your_price = 0;
		double calculateInvoiceTotal(double pricePerunit,int quantity) 
		{
			double total= pricePerunit * quantity; //1 * 5 = 5.65
			double total_bill_amount = 0;
			total_bill_amount += ((total*13)/100) + total;
			your_price += total_bill_amount;
			return total_bill_amount;
		}
		
		
		
}
		
		
//		double total=0;
//		return total;
//Add a method calculateTax (13%) and provide the totalAmount including Tax.



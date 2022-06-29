package WorkOutPrograms;

public class CovidPeopleRes{

	//public class Discountassign {

		public static void main(String[] args) {
			int Cp=100;
			double FinalPrice;
			String PromoCode = "promo10";
					
			int SellingPrice = Cp-Cp*(50/100);
			
			System.out.println("Final price after 50% discount=" + SellingPrice);
				
			if (PromoCode.equals("promo5"))
			{
				FinalPrice=(SellingPrice-(SellingPrice*(5/100)));
				
				System.out.println("Final Price after all discount is = " + FinalPrice);
			}
			  
			else if (PromoCode.equals("promo10"))
			{
			
				FinalPrice=(SellingPrice-(SellingPrice*(10/100)));
				
				System.out.println("Final Price after all discount is = " + FinalPrice);
			}
			
			else if (PromoCode.equals("promo20"))
			{
				FinalPrice=(SellingPrice-(SellingPrice*(20/100)));
				
				System.out.println("Final Price after all discount is = " + FinalPrice);
			}
			
		}}
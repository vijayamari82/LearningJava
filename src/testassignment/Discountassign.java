package testassignment;

public class Discountassign {

	public static void main(String[] args) {
		int Cp=1000;
		float FinalPrice;
		String PromoCode = "promo10";
				
		int SellingPrice = (Cp*50)/100;
		
		System.out.println("Final price after 50% discount=" + SellingPrice);
			
		if (PromoCode.equals("promo5"))
		{
			FinalPrice=(SellingPrice*5)/100;
			
			System.out.println("Final Price after all discount is = " + FinalPrice);
		}
		  
		else if (PromoCode.equals("promo10"))
		{
			FinalPrice=(SellingPrice*10)/100;
			
			System.out.println("Final Price after all discount is = " + FinalPrice);
		}
		
		else if (PromoCode.equals("promo20"))
		{
			FinalPrice=(SellingPrice*20)/100;
			
			System.out.println("Final Price after all discount is = " + FinalPrice);
		}
		
	}
}
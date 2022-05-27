package testassignment;

public class Discountassign {

	public static void main(String[] args) {
		double costPrice=300;
		double finalPrice;
		String PromoCode = "promo20";
		
		System.out.println("The initial cost price of the product is =" + costPrice);
		double stdDiscount= ((costPrice*50)/100);
		System.out.println("standard discount price =" + stdDiscount);
		double sellingPrice=costPrice-stdDiscount;
		System.out.println("Selling price after standard discount = " + sellingPrice);
				
		if (PromoCode.equals("promo5"))
		{
			double promoDiscount=(sellingPrice*5)/100;
			finalPrice=(sellingPrice-promoDiscount);
			
			System.out.println("Final Price after additional promocode discount is = " + finalPrice);
		}
		  
		else if (PromoCode.equals("promo10"))
		{
			double promoDiscount=(sellingPrice*10)/100;
			finalPrice=(sellingPrice-promoDiscount);
			
			System.out.println("Final Price after all discount is = " + finalPrice);
		}
		
		else if (PromoCode.equals("promo20"))
		{
			double promoDiscount=(sellingPrice*20)/100;
			finalPrice=(sellingPrice-promoDiscount);
			
			System.out.println("Final Price after all discount is = " + finalPrice);
		}
	}
}
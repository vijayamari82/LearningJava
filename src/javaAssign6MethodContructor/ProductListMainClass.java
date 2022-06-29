package javaAssign6MethodContructor;

import java.util.Scanner;

//import java.util.*;
//import java.util.Scanner;
public class ProductListMainClass {

				public static void main(String[] args)
					
					{
						Scanner sc = new Scanner(System.in);
						Product[] selectedProducts =  new Product[10];
						Invoice1 invoice = new Invoice1();
						selectedProducts[0] = new Product("Milk",5.45,"Organic", 2);
						selectedProducts[1] = new Product("Bread",2.35,"Whole wheat",2);
						selectedProducts[2] = new Product("Butter",5.45,"Organic",1);
						selectedProducts[3] = new Product("Dhal",15.45,"Organic",1);
						selectedProducts[4] = new Product("Rice",24.00,"Organic",1);
						selectedProducts[5] = new Product("Maggi",2.50,"Organic",1);
						selectedProducts[6] = new Product("Urad Dhal",12.45,"Organic",1);
						selectedProducts[7] = new Product("Mustard",1.45,"Organic",1);
						selectedProducts[8] = new Product("Soap",4.00,"Organic",1);
						selectedProducts[9] = new Product("Detergent",7.15,"Organic",1);
						System.out.println("Choose your Product");
						for(int i =0;i<selectedProducts.length;i++) 
						{
							System.out.println(selectedProducts[i].name);
							//System.out.println(selectedProducts[i].name +" "  +selectedProducts[i].pricePerunit + " "  +selectedProducts[i].description + " " +selectedProducts[i].quantity);
							//System.out.println("Total Price Including Tax " +invoice.calculateInvoiceTotal(selectedProducts[i].pricePerunit, selectedProducts[i].quantity));
						}
						for(int i =0;i<selectedProducts.length;i++)
						{
							String pd = sc.next();
							if(pd.equalsIgnoreCase(selectedProducts[i].name))
							{
								System.out.println("Enter the Quantity");
								int quan = sc.nextInt();
								System.out.println("Total Price Including Tax " +invoice.calculateInvoiceTotal(selectedProducts[i].pricePerunit, quan));
							}
							else
							{
								System.out.println("Choose the Correct Product");
							}
						}
						System.out.println("Your Final Price " + invoice.your_price);
				        sc.close();
					}
				
				}

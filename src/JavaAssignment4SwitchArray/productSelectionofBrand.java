package JavaAssignment4SwitchArray;

import java.util.Scanner;

public class productSelectionofBrand {

	public static void main(String[] args) {
		{
			Scanner sc = new Scanner(System.in);
			String samsung[] = {"S20","S21","Flip3","Fold3"};
			String apple[] = {"Iphone12","IPhone 12 Mini", "Iphone11"};
			String google[] = {"Google Pixel 6", "Google Pixel 6 Pro", "Google Pixel Pro", "Google Pixel 5"};
			System.out.println("Choose Your Brand");
			System.out.println("1.Samsung");
			System.out.println("2.Google");
			System.out.println("3.Iphone");
			String choice = sc.nextLine();
			if(choice.equals("Samsung"))
			{
				System.out.println("Choose Your Product");
				for(int i = 0; i<samsung.length;i++)
				{
					
					System.out.println(samsung[i]);
				}
				String brand = sc.nextLine();
				for(int i = 0; i<samsung.length;i++)
				{
					
					if(brand.equals(samsung[i]))
					{
						System.out.println("Your Product is Avalible");
					}
					else
					{
						System.out.println("Your Product is Unavalible");
					}
				}
			}
			else if(choice.equals("Google"))
			{
				System.out.println("Choose Your Product");
				for(int i = 0; i<google.length;i++)
				{
					
					System.out.println(google[i]);
				}
				String brand = sc.nextLine();
				for(int i = 0; i<google.length;i++)
				{
					
					if(brand.equals(google[i]))
					{
						System.out.println("Your Product is Avalible");
					}
					else
					{
						System.out.println("Your Product is Unavalible");
					}
				}
			}
			else if(choice.equals("Apple"))
			{
				System.out.println("Choose Your Product");
				for(int i = 0; i<apple.length;i++)
				{
					
					System.out.println(apple[i]);
				}
				String brand = sc.nextLine();
				for(int i = 0; i<apple.length;i++)
				{
					
					if(brand.equals(apple[i]))
					{
						System.out.println("Your Product is Avalible");
					}
					else
					{
						System.out.println("Your Product is Unavalible");
					}
				}
			}
		}
	}

}

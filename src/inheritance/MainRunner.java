package inheritance;

public class MainRunner {

	public static void main(String[] args) 
		
		{
			
				double salary []= new double[10];
				String name[] = new String[10];
				//double persalary[] = new double[4];
				permanentEmployee[] peremp =  new permanentEmployee[4];
				peremp[0] = new permanentEmployee("Viji", "Mari",123, 2);
				peremp[0].calculatePay(150);
				salary[0] = peremp[0].getsalary();
				name[0] = peremp[0].getFirstName();
				//persalary[0] = peremp[0].getsalary();
				peremp[1] = new permanentEmployee("Sai", "Venkat",124, 2);
				peremp[1].calculatePay(150);
				salary[1] = peremp[1].getsalary();
				name[1] = peremp[1].getFirstName();
				//persalary[1] = peremp[1].getsalary();
				peremp[2] = new permanentEmployee("Saravana", "Akash",125, 2);
				peremp[2].calculatePay(150);
				salary[2] = peremp[2].getsalary();
				name[2] = peremp[2].getFirstName();
				//persalary[2] = peremp[2].getsalary();
				peremp[3] = new permanentEmployee("Siva", "Sakthi",126, 2);
				peremp[3].calculatePay(150);
				salary[3] = peremp[3].getsalary();
				name[3] = peremp[3].getFirstName();
				//persalary[2] = peremp[2].getsalary();
				contractualEmployee[] conemp =  new contractualEmployee[3];
				conemp[0] = new contractualEmployee("Raj", "Kumar",128, 2);
				conemp[0].calculatePay(40);
				salary[4] = conemp[0].getsalary();
				name[4] = conemp[0].getFirstName();
				conemp[1] = new contractualEmployee("Naveen", "Kumar",129, 2);
				conemp[1].calculatePay(36);
				salary[5] = conemp[1].getsalary();
				name[5] = conemp[1].getFirstName();
				conemp[2] = new contractualEmployee("Kishore", "Kiran",130, 2);
				conemp[2].calculatePay(45);
				salary[6] = conemp[2].getsalary();
				name[6] = conemp[2].getFirstName();
				commisionEmployee[] comemp =  new commisionEmployee[3];
				comemp[0] = new commisionEmployee("Vetri", "vel",131, 2);
				comemp[0].calculatePay(10);
				salary[7] = comemp[0].getsalary();
				name[7] = comemp[0].getFirstName();
				comemp[1] = new commisionEmployee("Prakash", "padma",132, 2);
				comemp[1].calculatePay(7);
				salary[8] = comemp[1].getsalary();
				name[8] = comemp[1].getFirstName();
				comemp[2] = new commisionEmployee("balaji", "j",133, 2);
				comemp[2].calculatePay(14);
				salary[9] = comemp[2].getsalary();
				name[9] = comemp[2].getFirstName();
				double max =salary[0], min = salary[9];
				String max_name = name[0], min_name=name[9];
				for(int i = 0; i < 10; i++)
				{
					if(max < salary[i])
					{
						max = salary[i];
						max_name = name[i];
					}
					if(min > salary[i])
					{
						min = salary[i];
						min_name = name[i];
					}
				}
				System.out.println("The Name is "+ max_name+ "\n The Maxmimum Salary is "+ max);
				System.out.println("The Name is "+ min_name+ "\n The Minimum Salary is "+ min);
			}
		
}

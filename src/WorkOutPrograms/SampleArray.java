package WorkOutPrograms;

import java.util.Scanner;
public class SampleArray{
	
public static void main(String args[]) {
int SIZE = 10;
Scanner in = new Scanner(System.in);
String cities[] = new String[SIZE];
System.out.println("Enter " + SIZE + " cities:");

for (int i = 0;  i < SIZE; i++) {
    System.out.print("Enter City Name: ");
    cities[i] = in.nextLine();
    }

System.out.print("Enter name of city to search: ");
String city = in.nextLine();

int valueid;
for (valueid = 0;  valueid < SIZE; valueid++) {
    if (city.compareToIgnoreCase(cities[valueid]) == 0) {
        break;
    } 
if (valueid < SIZE) {
    System.out.println("Search Successful");
    System.out.println("City: " + cities[valueid]);
    }
else {
    System.out.println("Search Unsuccessful");
}
}
}
}
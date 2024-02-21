/*
		 Author: Mariangel Albornoz
		 Course: COP2210 RVD 1231
		 Date: 3/14/2023
		 Assignment: 8.3 LAB (LM)
		 Instructor: Dr. Sergio Pisano
		 Description: Car value (classes)
		 */
import java.util.Scanner;

public class CarValue {
	public static void main(String[] args) {  //main 
		Scanner scnr = new Scanner(System.in); 
		
		Car myCar = new Car();
		
		int userYear = scnr.nextInt();      //obtain input from user (year, price, and current year)
		int userPrice= scnr.nextInt();
		int userCurrentYear = scnr.nextInt();
		
		myCar.setModelYear(userYear);
		myCar.setPurchasePrice(userPrice);
		myCar.calcCurrentValue(userCurrentYear);
		
		myCar.printInfo();
	}
}

/*
 sample run: 
2011
18000
2018

Car's information:
  Model year: 2011
  Purchase price: $18000
  Current value: $5770
 */

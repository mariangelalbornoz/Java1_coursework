/*
		 Author: Mariangel Albornoz
		 Course: COP2210 RVD 1231
		 Date: 3/14/2023
		 Assignment: 8.2 LAB (LM)
		 Instructor: Dr. Sergio Pisano
		 Description: Driving cost - methods
		 */

import java.util.Scanner ;

public class LabProgram {
public static double drivingCost(double milesPerGallon, double dollarsPerGallon, double milesDriven) { //method to calculate cost of drive
	return milesDriven * (1.0/milesPerGallon) * dollarsPerGallon;
}
public static void main(String[] args) { 
	Scanner scnr = new Scanner(System.in); //collection of input from user
	double milesGallon = scnr.nextDouble();
	double dollarsGallon = scnr.nextDouble();
	
	System.out.printf("%.2f", drivingCost(milesGallon, dollarsGallon, 10)); //driving cost for 10 miles
	System.out.print(" "); //spaces for formating
	System.out.printf("%.2f", drivingCost(milesGallon, dollarsGallon, 50)); //driving cost for 50 miles
	System.out.print(" ");
	System.out.printf("%.2f\n", drivingCost(milesGallon, dollarsGallon, 400)); //driving cost for 400 miles
}
}
/*
 sample run: inputs = 
 20
 3.5
 
 run = 1.75 8.75 70.00




*/
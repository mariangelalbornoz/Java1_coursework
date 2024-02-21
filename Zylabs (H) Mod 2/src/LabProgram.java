 /*
		 Author: Mariangel Albornoz
		 Course: COP2210 RVD 1231
		 Date: 2/6/2023
		 Assignment: 3.1 LAB (H)
		 Instructor: Dr. Sergio Pisano
		 Description: Expression for calories burned during workout
		 */
		

import java.util.Scanner;

public class LabProgram {
	   public static void main(String[] args) {

	      Scanner scnr = new Scanner(System.in);
	      int age = scnr.nextInt();
	      int weight = scnr.nextInt();
	      int heart = scnr.nextInt();
	      int time = scnr.nextInt();
	      double totalCal;
	      totalCal = ((age * 0.2757) + (weight * 0.03295) + (heart * 1.0781) - 75.4991) * time/8.368;
	      
	      System.out.print("Calories: " );
	      System.out.printf("%.2f", totalCal);
	      System.out.println(" calories");
	      
	   }
	} 
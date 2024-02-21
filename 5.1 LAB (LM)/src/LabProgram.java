/*
		 Author: Mariangel Albornoz
		 Course: COP2210 RVD 1231
		 Date: 2/21/2023
		 Assignment: 5.1 LAB (LM)
		 Instructor: Dr. Sergio Pisano
		 Description: Speed Limits and Tickets
		 */


import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      int speedLimit = scnr.nextInt();
      int drivingSpeed = scnr.nextInt();
      
      if ((speedLimit - drivingSpeed) >= 10 ) {
    	  System.out.println("50");
      }
      else if ((speedLimit - drivingSpeed) <= -6 && (speedLimit - drivingSpeed) >= -20) { //going over 6 to 20 miles inclusive
    	  System.out.println("75");
      
      }
      else if ((speedLimit - drivingSpeed) < -20 && (speedLimit - drivingSpeed) >=  -40) {//20 to 40
    	  System.out.println("150");
      }
      else if ((speedLimit - drivingSpeed) < -40) { //over 40
    	  System.out.println("300");
      }
      else {
    	  System.out.println("0"); //no ticket
      }
      
   }
}
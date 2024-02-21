 /*
		 Author: Mariangel Albornoz
		 Course: COP2210 RVD 1231
		 Date: 2/6/2023
		 Assignment: 2.2 LAB (LM): Input and formatted output
		 Instructor: Dr. Sergio Pisano
		 Description: House real estate summary
		 */
		
import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int currentPrice; 
      int lastMonthsPrice; 

      currentPrice = scnr.nextInt(); 
      lastMonthsPrice = scnr.nextInt();

      System.out.println("This house is $" + currentPrice + ". The change is $" + (currentPrice - lastMonthsPrice) + " since last month." );
      System.out.println("The estimated monthly mortgage is $" + (currentPrice * 0.051) / 12 + "." );
   }
}
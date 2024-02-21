/*
		 Author: Mariangel Albornoz
		 Course: COP2210 RVD 1231
		 Date: 2/21/2023
		 Assignment: 5.2 LAB (LM)
		 Instructor: Dr. Sergio Pisano
		 Description: Interstate highway numbers
		 */
import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      int highwayNumber;
      int primaryNumber;
     
      
      

      highwayNumber = scnr.nextInt();

      if (highwayNumber >= 1 && highwayNumber <= 99) {
    	 if (highwayNumber % 2 == 0) {
    		 System.out.println("I-" + highwayNumber  + " is primary, going east/west."	);
    	 }
    	 else {
    		 System.out.println("I-" + highwayNumber  + " is primary, going north/south."	);
    	 }
      }
      else if (highwayNumber >= 100 && highwayNumber <= 999 && highwayNumber != 200) {
    	  if (highwayNumber % 2 == 0) {
     		 System.out.println("I-" + highwayNumber  + " is auxiliary, serving I-" + highwayNumber % 100 + ", going east/west."	);
     	 }
     	 else {
     		 System.out.println("I-" + highwayNumber  + " is auxiliary, serving I-" + highwayNumber % 100  +", going north/south."	);
      }
   
      }
      else {
    	  System.out.println(highwayNumber + " is not a valid interstate highway number.");
      }
   }
}
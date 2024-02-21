/*
		 Author: Mariangel Albornoz
		 Course: COP2210 RVD 1231
		 Date: 4/4/2023
		 Assignment: 11.2 LAB (LM)
		 Instructor: Dr. Sergio Pisano
		 Description: Brute force equation solver
		 */

import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
	   Scanner scnr = new Scanner(System.in);
      int x1 = scnr.nextInt(); //coefficient of the x of first equation
      int y1 = scnr.nextInt(); //coefficient of y of first equation
      int coefficient1 = scnr.nextInt(); //sole coefficient
      int x2 = scnr.nextInt();  //same for next equations
      int y2 = scnr.nextInt();
      int coefficient2 = scnr.nextInt();
      int finalx = 0; //x solution
      int finaly = 0; //y solution
      
      for (int x= -10; x<=10; ++x) {
    	  
    	  for (int y = -10; y<=10; ++y) { //tests out all the y's with the first x 
    		  if (((x1 * x) + (y1 * y) == coefficient1) && ((x2 * x) + (y2 * y) == coefficient2)) {
    			  finalx = x;
    			  finaly = y;
    			  System.out.println("x = " + finalx + ", y = " + finaly);
    			  break; //if solution is found, breaks out of loop
    		  }else {
    			  continue; //else continue with loop
    		  }
    		  
    	  }
      }
      if (finalx == 0 && finaly == 0) { //if finalx and finaly are the same as initialized, no solution was found
    	  System.out.println("There is no solution");
      }
   }
}

/*sample run:
8 7 38
3 -5 -1

x = 3, y = 2

*/


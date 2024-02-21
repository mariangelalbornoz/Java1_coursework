/*
		 Author: Mariangel Albornoz
		 Course: COP2210 RVD 1231
		 Date: 4/18/2023
		 Assignment: 14.1 LAB (LM)
		 Instructor: Dr. Sergio Pisano
		 Description: ArrayLists - Copying only negative values
		 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      final int NUM_ELEMENTS = 6;
      Scanner scnr = new Scanner(System.in);
      ArrayList<Integer> listInts = new ArrayList<Integer>();
      ArrayList <Integer> listNegInts = new ArrayList<Integer>();// listNegInts declared
      int i;

      // Get input integers
      for (i = 0; i < NUM_ELEMENTS; ++i) {
         listInts.add(scnr.nextInt());
      }

      for(i = 0; i < listInts.size(); ++i) { //for loop that adds numbers to listNegInts if neg
    	  if (listInts.get(i) < 0) {
    		  listNegInts.add(listInts.get(i));
    	  }
      }
      System.out.println(listNegInts.size()); //prints elements of listNegInts
      for(i=0; i < listNegInts.size(); ++i) {
    	  System.out.println(listNegInts.get(i));
    	 
      }
   }
}

/* sample run 
input: 5 -2 0 9 -66 -4
output:
3
-2
-66
-4
*/
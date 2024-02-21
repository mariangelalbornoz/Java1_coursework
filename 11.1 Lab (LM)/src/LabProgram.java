/*
		 Author: Mariangel Albornoz
		 Course: COP2210 RVD 1231
		 Date: 4/4/2023
		 Assignment: 11.1LAB (LM)
		 Instructor: Dr. Sergio Pisano
		 Description: Count characters
		 */

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
	   Scanner scnr = new Scanner(System.in);
	   String letter = scnr.next();  //letter that is going to be counted;   
	   String phrase;
	   int counter = 0; //how mnay of the letters are in the phrase
	   
	   while (scnr.hasNext()) { //if the phrase has more words
		   phrase = scnr.next(); //continue to scan them
		   for(int i = 0; i < phrase.length(); ++i) {  
		    	  if (phrase.charAt(i) == letter.charAt(0)) {   //compare if each letter is equal
		    		  counter += 1;
		    	  }
		      }
		  
		   
	   }
	   if (counter == 1) { //if counter is 1, no need for 's
		   System.out.println(counter + " " + letter);
	   } else {
		   System.out.println(counter + " " + letter + "'s");
	   }
     
   }
}

//for some reason the input that zybooks provides does not work on eclipse, but it works once submitted on zybooks

//sample run "z Today is Monday"
//output: 0 z's
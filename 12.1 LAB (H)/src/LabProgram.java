/*
		 Author: Mariangel Albornoz
		 Course: COP2210 RVD 1231
		 Date: 4/4/2023
		 Assignment: 12.1 LAB (H)
		 Instructor: Dr. Sergio Pisano
		 Description: Rock Paper Scissors
		 */

import java.util.Scanner;
import java.util.Random;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); //provided code
      final int ROCK = 0;
      final int PAPER = 1;
      final int SCISSORS = 2;
      Random rand = new Random();
      int seed = scnr.nextInt();
      rand.setSeed(seed);

      String name1 = scnr.next();  //obtaining names and rounds
      String name2 = scnr.next();
      int rounds = scnr.nextInt();
      int value1 = rand.nextInt(3); //for name1
      int value2 = rand.nextInt(3); //for name2
      
      int name1wins = 0;
      int name2wins = 0;
      
      while (rounds < 0) { //if rounds are less than 0, keep looping response until a proper round is provided
    	  System.out.println("Rounds must be > 0");
    	  rounds = scnr.nextInt();
    	  
      }
      System.out.println(name1 + " vs " + name2 + " for " + rounds + " rounds");
      
      for (int i = 0; i < rounds; ++i) {
 
      while (value1 == value2) {  //keep trying until value is not same
    	  System.out.println("Tie");
    	  value1 = rand.nextInt(3); //for name1
          value2 = rand.nextInt(3);
      }
      
      if (value1 == 2 && value2 == 1) { //where name 1 wins
    	  System.out.println(name1 + " wins with scissors");
    	  name1wins += 1;
      } else if (value1 == 1 && value2 == 0) {
    	  System.out.println(name1 + " wins with paper");
    	  name1wins += 1;
      } else if (value1 == 0 && value2 == 2) {
    	  System.out.println(name1 + " wins with rock"); 
    	  name1wins += 1;
      } else if (value2 == 2 && value1 == 1) {//where name 2 wins
    	  System.out.println(name2 + " wins with scissors");
    	  name2wins += 1;
      }else if (value2 == 1 && value1 == 0) {
    	  System.out.println(name2 + " wins with paper");
    	  name2wins += 1;
      } else if (value2 == 0 && value1 == 2) {
    	  System.out.println(name2 + " wins with rock");
    	  name2wins += 1;
      }
      value1 = rand.nextInt(3); //for name1
      value2 = rand.nextInt(3);
      }
      System.out.println(name1 + " wins " + name1wins + " and " + name2 + " wins " + name2wins);

   }
}
/*sample run 
82 Anna Bert 3

Anna vs Bert for 3 rounds
Anna wins with paper
Anna wins with paper
Tie
Tie
Anna wins with rock
Anna wins 3 and Bert wins 0


*/

/*
		 Author: Mariangel Albornoz
		 Course: COP2210 RVD 1231
		 Date: 4/18/2023
		 Assignment: 15.1 LAB (H)
		 Instructor: Dr. Sergio Pisano
		 Description:  Soccer team roster
		 */

import java.util.ArrayList;
import java.util.Scanner;

public class PlayerRoster {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      ArrayList<Integer> jerseyList = new ArrayList<Integer>(); //list for jersey
      ArrayList<Integer> ratingsList = new ArrayList<Integer>(); //list for ratings
      int jerseyNum = 0;
      int rating = 0;
      char userKey = 'i';
      
      for(int i = 1; i<= 5; ++i) { //creating the lists for jersey num and ratings
    	  System.out.println("Enter player " + i + "'s jersey number:");
    	  jerseyNum = scnr.nextInt();
    	  jerseyList.add(jerseyNum);
    	  System.out.println("Enter player " + i + "'s rating:");
    	  rating = scnr.nextInt();
    	  ratingsList.add(rating);
    	  System.out.println("");
    	 
      }
      System.out.println("ROSTER"); //creating the roster
      for (int i= 1; i<=5; ++i) {
    	  System.out.println("Player " + i + " -- Jersey number: " + jerseyList.get(i-1) + ", Rating: " + ratingsList.get(i-1));
      }
      while(userKey == 'i' || userKey == 'u' || userKey == 'a'|| userKey == 'r'|| userKey == 'o') { //menu will print if any of these keys are used by the user
      System.out.println("");
      System.out.println("MENU");
      System.out.println("u - Update player rating");
      System.out.println("a - Output players above a rating");
      System.out.println("r - Replace player");
      System.out.println("o - Output roster");
      System.out.println("q - Quit");
      System.out.println("");
      System.out.println("Choose an option:");
      
      userKey = scnr.next().charAt(0); //gets user input
      
      if (userKey == 'q') {
    	  System.exit(0);
      }else if (userKey == 'o') {
    	  System.out.println("ROSTER");
          for (int i= 1; i<=5; ++i) {
        	  System.out.println("Player " + i + " -- Jersey number: " + jerseyList.get(i-1) + ", Rating: " + ratingsList.get(i-1));
          }
      } else if (userKey == 'u') {//updating a player
    	  System.out.println("Enter a jersey number:");
    	  jerseyNum = scnr.nextInt();
    	  System.out.println("Enter a new rating for player:");
    	  rating = scnr.nextInt();
    	  ratingsList.add(jerseyList.indexOf(jerseyNum), rating);
    	  ratingsList.remove(jerseyList.indexOf(jerseyNum)+ 1); //plus one due to the shift in the Array
  
      }else if (userKey == 'a') {  //to get players above
    	  System.out.println("Enter a Rating:");
    	  rating = scnr.nextInt();
    	  System.out.println("ABOVE " + rating);
    	   for (int i = 0; i <5; ++i ) {
    		   if (ratingsList.get(i) > rating) { //compared to the desired rating
    			   System.out.println("Player " + (i + 1) + " -- " + "Jersey number: " + jerseyList.get(i) + ", Rating: " + ratingsList.get(i));
    		   }
    	   }
      } else if (userKey == 'r') {//to replace a player 
    	  System.out.println("Enter a jersey number:");
    	  jerseyNum = scnr.nextInt();
    	  if (jerseyList.contains(jerseyNum)) {
    		  System.out.println("Enter a new jersey number:");
    		  int newJerseyNum = scnr.nextInt();
    		  System.out.println("Enter a rating for the new player:");
    		  rating = scnr.nextInt();
    		  
    		  int newIndex = jerseyList.indexOf(jerseyNum); //made a temp variable to store the location of the index, so it won't change
    		 jerseyList.add(newIndex, newJerseyNum);
    		  jerseyList.remove(newIndex + 1);
    		  ratingsList.add(newIndex, rating);
    		  ratingsList.remove(newIndex + 1);
    		 
    	  } 
      }
      }
}
}

/* SAMPLE RUN
input: 84 7
23 4
4 5
30 2
66 9
r
66
15
6
o
q

output: 
Enter player 1's jersey number:
84 7
23 4
4 5
30 2
66 9
r
66
15
6
o
qEnter player 1's rating:

Enter player 2's jersey number:
Enter player 2's rating:

Enter player 3's jersey number:
Enter player 3's rating:

Enter player 4's jersey number:
Enter player 4's rating:

Enter player 5's jersey number:
Enter player 5's rating:

ROSTER
Player 1 -- Jersey number: 84, Rating: 7
Player 2 -- Jersey number: 23, Rating: 4
Player 3 -- Jersey number: 4, Rating: 5
Player 4 -- Jersey number: 30, Rating: 2
Player 5 -- Jersey number: 66, Rating: 9

MENU
u - Update player rating
a - Output players above a rating
r - Replace player
o - Output roster
q - Quit

Choose an option:
Enter a jersey number:
Enter a new jersey number:
Enter a rating for the new player:

MENU
u - Update player rating
a - Output players above a rating
r - Replace player
o - Output roster
q - Quit

Choose an option:
ROSTER
Player 1 -- Jersey number: 84, Rating: 7
Player 2 -- Jersey number: 23, Rating: 4
Player 3 -- Jersey number: 4, Rating: 5
Player 4 -- Jersey number: 30, Rating: 2
Player 5 -- Jersey number: 15, Rating: 6

MENU
u - Update player rating
a - Output players above a rating
r - Replace player
o - Output roster
q - Quit

Choose an option:


*/


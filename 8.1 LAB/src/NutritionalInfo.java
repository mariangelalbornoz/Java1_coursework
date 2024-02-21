/*
		 Author: Mariangel Albornoz
		 Course: COP2210 RVD 1231
		 Date: 3/14/2023
		 Assignment: 8.1 LAB (LM)
		 Instructor: Dr. Sergio Pisano
		 Description: Nutritional information (classes/constructors)
		 */


import java.util.Scanner;

public class NutritionalInfo {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      FoodItem foodItem;
      String nameFood = scnr.next(); //obtains item name from user
      if(nameFood.equals("Water") || nameFood.equals("water")) { //if item user inputed is water, default construction is called
         foodItem = new FoodItem();

         foodItem.printInfo();
         System.out.printf("Number of calories for %.2f serving(s): %.2f\n", 1.0, 
                          foodItem.getCalories(1.0));
      }

      else { //else user input is used to generate nutrition list
      
         double amountFat = scnr.nextDouble();
         double amountCarbs = scnr.nextDouble();
         double amountProtein = scnr.nextDouble();

         foodItem = new FoodItem(nameFood, amountFat, amountCarbs, amountProtein);

         double numServings = scnr.nextDouble();

         foodItem.printInfo();
         System.out.printf("Number of calories for %.2f serving(s): %.2f\n", 1.0,
                             foodItem.getCalories(1.0));

         System.out.printf("Number of calories for %.2f serving(s): %.2f\n", numServings,
                             foodItem.getCalories(numServings));
      }
   }
}
/*sample run :
input : Kombucha
0
10
0
1

Nutritional information per serving of Kombucha:
  Fat: 0.00 g
  Carbohydrates: 10.00 g
  Protein: 0.00 g
Number of calories for 1.00 serving(s): 40.00
Number of calories for 1.00 serving(s): 40.00

 
  */ 

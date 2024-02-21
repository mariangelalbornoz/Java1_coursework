/*
		 Author: Mariangel Albornoz
		 Course: COP2210 RVD 1231
		 Date: 3/14/2023
		 Assignment: 8.1 LAB (LM)
		 Instructor: Dr. Sergio Pisano
		 Description: Nutritional information (classes/constructors)
		 */

      public class FoodItem {
	   private String name;
	   private double fat;
	   private double carbs;
	   private double protein;

	   public FoodItem () { //default constructor for nutritional info  
		   name = "Water";
		   fat = 0;
		   carbs = 0;
		   protein = 0;
		   
	   }

	   public FoodItem(String foodName, double fatGrams, double carbGrams, double proteinGrams) { //construction for 4 user inputted parameters 
		   name = foodName;
		   fat = fatGrams;
		   carbs = carbGrams;
		   protein = proteinGrams;
				   
		   
	   }

	   public String getName() {
	      return name;
	   }

	   public double getFat() {
	      return fat;
	   }

	   public double getCarbs() {
	      return carbs;
	   }

	   public double getProtein() {
	      return protein;
	   }

	   public double getCalories(double numServings) {
	      // Calorie formula
	      double calories = ((fat * 9) + (carbs * 4) + (protein * 4)) * numServings;
	      return calories;
	   }

	   public void printInfo() {
	      System.out.println("Nutritional information per serving of " + name + ":");
	      System.out.printf("  Fat: %.2f g\n", fat);
	      System.out.printf("  Carbohydrates: %.2f g\n", carbs);
	      System.out.printf("  Protein: %.2f g\n", protein);
	   }
	}

/*
		 Author: Warrick Brugal
		 Course: COP2210 RVD 1231
		 Date: 4/18/2023
		 Assignment: Discussion 7
		 Instructor:  Professor isano
		 Description:  Module 6 Discussion
		 */


import java.util.Scanner;

public class InventoryItem {
	private String description;
	private int units;

	public String getDescription() {
		return description;
	}

	public int getUnits() {
		return units;
	}

	InventoryItem(int numUnits) {
		units = numUnits;
	}

	InventoryItem(String description, int units) {
		this.description = description;
		this.units = units;
	}

	public static void setItems(InventoryItem[] array) {
		String description; // Item description
		int units; //num units
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter data for " + array.length + " inventory items.");
		for (int index = 0; index < array.length; index++) {
			// Get item's desc
			System.out.print("Enter the description for item " + (index + 1) + ": ");
			description = keyboard.nextLine();
			// Get the numb units
			System.out.print("Enter the units for item " + (index + 1) + ": ");
			units = keyboard.nextInt();
			// Consume the remaining newline.
			keyboard.nextLine();
			// Create an InventoryItem object initialized with
			// the data and store the object in the array.
			array[index] = new InventoryItem(description, units);
			// Display a blank line before going on.
			System.out.println();
		}
	}

	public static void main(String[] args) {
		final int NUM_ITEMS = 3; // Number of items
		// Create an InventoryItem array.
		InventoryItem inventory[] = new InventoryItem[NUM_ITEMS];
		// Call the setItems method to set data for each element.
		InventoryItem.setItems(inventory);
		System.out.println("You entered the following:");
		// Display 
		for (int index = 0; index < inventory.length; index++) {
			System.out.println("Item " + (index + 1));
			System.out.println("Description: " + inventory[index].getDescription());
			System.out.println("Units: " + inventory[index].getUnits());
			System.out.println();
		}

		InventoryItem myName = inventory[0];
		System.out.println(myName.getDescription());
	}
}

/* 
 *Sample:
 *Enter data for 3 inventory items.
Enter the description for item 1: bananas
Enter the units for item 1: 5

Enter the description for item 2: tomatoes
Enter the units for item 2: 6

Enter the description for item 3: strawberries
Enter the units for item 3: 11

You entered the following:
Item 1
Description: bananas
Units: 5

Item 2
Description: tomatoes
Units: 6

Item 3
Description: strawberries
Units: 11

bananas

 */

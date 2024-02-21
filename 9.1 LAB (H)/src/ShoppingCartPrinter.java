/*
		 Author: Mariangel Albornoz
		 Course: COP2210 RVD 1231
		 Date: 3/14/2023
		 Assignment: 9.1 LAB (H)
		 Instructor: Dr. Sergio Pisano
		 Description: Online Shopping Cart
		 */
import java.util.Scanner;

public class ShoppingCartPrinter {
	public static void main(String [] args) { //main code
		Scanner scnr = new Scanner(System.in);
		
	
		
		System.out.println("Item 1");  //commands for the user
		System.out.println("Enter the item name:");
		System.out.println("Enter the item price:");
		System.out.println("Enter the item quantity:");
		System.out.println("");
		
		String name = scnr.nextLine(); //user input for first item
		int price = scnr.nextInt(); 
		int quantity = scnr.nextInt();
		
		ItemToPurchase item1 = new ItemToPurchase(); //item 1 initiation
		item1.setName(name);  //constructing item1
		item1.setPrice(price);
		item1.setQuantity(quantity);
		
		scnr.nextLine(); //now moving on to item 2
		
		System.out.println("Item 2"); 
		System.out.println("Enter the item name:"); 
		String name2 = scnr.nextLine(); //name  item2
		
		System.out.println("Enter the item price:");
		int price2 = scnr.nextInt(); //price item2
		
		System.out.println("Enter the item quantity:");
		int quantity2 = scnr.nextInt(); //quantity item2
		
		System.out.println(""); //line skip
	
		ItemToPurchase item2 = new ItemToPurchase(); //creation of item 2 
		item2.setName(name2);
		item2.setPrice(price2);
		item2.setQuantity(quantity2);
		
		
		int item1cost = item1.getQuantity() * item1.getPrice(); //total cost of item 1
		int item2cost = item2.getQuantity() * item2.getPrice(); //total cost of item 2
		
		System.out.println("TOTAL COST");
		 System.out.println(item1.getName() + " " + item1.getQuantity() + " @ $" + item1.getPrice() + " = $" + item1cost );
		 System.out.println(item2.getName() + " " + item2.getQuantity() + " @ $" + item2.getPrice() +  " = $" + item2cost );
		 System.out.println("");
		 System.out.println("Total: $" + (item1cost + item2cost)); //total cost of item1 and item 2 together
		 
		 /*
		  sample run : 
		  Item 1
Enter the item name:
Enter the item price:
Enter the item quantity:

chocolate cake
10
2
Item 2
Enter the item name:
sugar
Enter the item price:
3
Enter the item quantity:
5

TOTAL COST
chocolate cake 2 @ $10 = $20
sugar 5 @ $3 = $15

Total: $35
		  */
	
	}
	 
		 
	 
}
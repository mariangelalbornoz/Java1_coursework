/*
		 Author: Mariangel Albornoz
		 Course: COP2210 RVD 1231
		 Date: 3/14/2023
		 Assignment: 9.1 LAB (H)
		 Instructor: Dr. Sergio Pisano
		 Description: Online Shopping Cart
		 */
public class ItemToPurchase {
	private String itemName;
	private int itemPrice;
	private int itemQuantity;
	
 public ItemToPurchase() {  //default constructor 
		itemName = "none";
		itemPrice = 0;
		itemQuantity = 0;
	}
 public void setName(String name) {//setter for name
	 itemName = name;
 }
 
 public String getName() { //getter for item name
	 return itemName;
 }
 
 public void setPrice(int price) { //setter for price
	 itemPrice = price;
 }
 
 public int getPrice() { //getter for price 
	 return itemPrice;
 }
 
 public void setQuantity(int quantity) { //setter for quantity
	 itemQuantity = quantity;
 }
 
 public int getQuantity() {//getter for quantity
	 return itemQuantity;
 }

 

}

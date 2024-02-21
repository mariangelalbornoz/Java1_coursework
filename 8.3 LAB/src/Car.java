
/*
		 Author: Mariangel Albornoz
		 Course: COP2210 RVD 1231
		 Date: 3/14/2023
		 Assignment: 8.3 LAB (LM)
		 Instructor: Dr. Sergio Pisano
		 Description: Car value (classes)
		 */
public class Car {
	private int modelYear;
	private int purchasePrice;
	private int currentValue;
	
	public void setModelYear(int userYear) { //setter for model year
		modelYear = userYear;
	}
	public int getModelYear() { //getter for model year
		return modelYear;
	}
	public void setPurchasePrice(int userPrice) { //setter for purchase price
		purchasePrice = userPrice; 
	}
	public int getPurchasePrice() { //getter for purchase price 
		return purchasePrice;
	}
	public void calcCurrentValue(int currentYear) {
		double depreciationRate = 0.15;
		int carAge = currentYear - modelYear; //parameter minus model year
		
		//car depreciation formula
		currentValue = (int) Math.round(purchasePrice * Math.pow((1-depreciationRate), carAge));
	}
	public void printInfo() {
		System.out.println("Car's information:");
		System.out.println("  Model year: " + getModelYear() );
		System.out.println("  Purchase price: $" + getPurchasePrice());
		System.out.println("  Current value: $" + currentValue);
	}
}

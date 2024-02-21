import java.util.Scanner;
public class MyDriverClass{
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter customer's name: ");
		String myName = in.next();
		System.out.print("Enter car's model year: ");
		int myCarYear = in.nextInt();
		System.out.print("Enter estimated labor cost: ");
		double myLabor = in.nextDouble();
		System.out.print("Enter estimated parts charge: ");
		double myParts = in.nextDouble();
		
		Customer myCustomer = new Customer();
		Car myCar= new Car();
		ServiceQuote myQuote = new ServiceQuote();
		
		myCustomer.setName(myName);
		myCar.setYear(myCarYear);
		myQuote.setCarAgeDiscount(myCar.getYear());
		myQuote.setLaborCharges(myLabor);
		myQuote.setPartsCharges(myParts);
		
		System.out.printf("Dear " + myCustomer.getName() + ", your total quote is: %.2f", myQuote.totalCharges());
		System.out.printf("\nTotal taxes: %.2f ", myQuote.salesTax());
		System.out.printf("\nTotal discount:", (myQuote.getCarAgeDiscount()*100) + "%");
		
	}
}
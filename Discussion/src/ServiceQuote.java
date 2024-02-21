class ServiceQuote{
	private double partsCharges;
	private double laborCharges;
	private double carAgeDiscount;
	
	public void setPartsCharges(double p) {
		this.partsCharges=p;
	}
	public void setLaborCharges(double l) {
		this.laborCharges=l;
	}
	public double salesTax() {
		return (0.07 *(this.partsCharges+this.laborCharges));
	}
	public void setCarAgeDiscount(int carYear) {
		if(carYear < 2005) {this.carAgeDiscount=0.1;} else {
			this.carAgeDiscount=0;}
		}
	public double getCarAgeDiscount() {
		return this.carAgeDiscount;
	}
	public double totalCharges() {
		double subtotal = this.salesTax() + this.partsCharges + this.laborCharges;
		double total = (subtotal - (subtotal * this.carAgeDiscount));
		return total;
	}
}
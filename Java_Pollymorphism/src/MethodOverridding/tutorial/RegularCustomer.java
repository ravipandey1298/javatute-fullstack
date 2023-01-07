package MethodOverridding.tutorial;

class RegularCustomer extends Customer {

	@Override
	public double payBill(double totalPrice) {
		
		double value = super.salary + 100;
		
		System.out.println("Final bill for the regular customer is calculated here");
		double priceAfterDiscount =  super.payBill(totalPrice); /* totalPrice * (1 - (5f / 100)); */
		return priceAfterDiscount;
	}

}

package MethodOverridding.tutorial;

public class Customer {
	public double salary;
	
	public double payBill(double totalPrice) {
		System.out.println("Final bill for the customer is calculated here");
		return totalPrice;
	}
}

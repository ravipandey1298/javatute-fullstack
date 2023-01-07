package MethodOverridding.tutorial;

public class Tester {

	public static void main(String[] args) {

		// Customer customer = new Customer();
		// System.out.println("Final bill amount: "+customer.payBill(40.0));
		// Parent Reference -> Parent Object

		// RegularCustomer regularCustomer = new RegularCustomer();
		// System.out.println("Final bill amount: "+regularCustomer.payBill(40.0));
		// Child Reference -> Child Object

		Customer regCust = new RegularCustomer();
		// Parent Reference -> Child Object
		System.out.println("Final Bill : " + regCust.payBill(40.0)); 
	}
}
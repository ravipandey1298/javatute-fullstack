package ParameterlessConstructor;

public class CustomerDefaultTest {
	public static void main(String[] args) {
		// while creating a object constructor is called.
		Customer c = new Customer();
		
		System.out.println(c.customerName);
		System.out.println(c.address);
		System.out.println(c.contactNumber);
		System.out.println(c.customerId);
		Customer c1 = new Customer();
		
		System.out.println(c1.customerName);
		System.out.println(c1.address);
		System.out.println(c1.contactNumber);
		System.out.println(c1.customerId);
		Customer c2 = new Customer();
		
		System.out.println(c2.customerName);
		System.out.println(c2.address);
		System.out.println(c2.contactNumber);
		System.out.println(c2.customerId);
		Customer c3 = new Customer();
		
		System.out.println(c3.customerName);
		System.out.println(c3.address);
		System.out.println(c3.contactNumber);
		System.out.println(c3.customerId);
	}
	
}

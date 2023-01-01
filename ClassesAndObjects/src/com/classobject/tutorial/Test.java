package com.classobject.tutorial;

public class Test {
	public static void main(String[] args) {
		
		// Object Creation
		Customer customer = new Customer();
		
//		Assigning values to the instance variable.
		customer.customerId = "C101";
		customer.customerName = "Manohar Jha";
		customer.contactNumber = 987654321;
		customer.address = "Delhi India";
	
		customer.displayCustomerDetails();
		
		Customer customer1 = new Customer();
		
		customer1.customerId = "C102";
		customer1.customerName = "Ravi Pandey";
		customer1.contactNumber = 987654332;
		customer1.address = "Mirzapur India";
	            
		customer1.displayCustomerDetails();
		
		
		Customer customer3 = new Customer();
		
		customer3.customerId = "C103";
		customer3.customerName = "John";
		customer3.contactNumber = 987654330;
		customer3.address = "New York";
	            
		customer3.displayCustomerDetails();
		
		
		/*
		 * Once the class is ready, the next step is to create instance of the class which can represent real life entiites.
		 * These instance are called objects of the class.
		 * 
		 * 1. An object is an instance of a class.
		 * 2. An object holds data for every instance variable of a class
		 * 3. It allow us to use the instance variable and methods specified in the class.
		 * 4. Any number of objects can be created for a class.
		 * 
		 * 
		 * In java an object of class is created using the new keyword;
		 */
		
	}
}

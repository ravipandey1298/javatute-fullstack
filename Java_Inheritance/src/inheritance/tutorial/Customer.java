package inheritance.tutorial;

public class Customer {
	public String customerId;
	public String customerName;
	public String contactNumber;
	public Address address;
	
	public Customer() {
		// line 3.
		System.out.println("inside customer");
		//line 4. complete and go back to child const.
	}
	
	public Customer(String customerId, String customerName) {
		super();
		
		System.out.println("inside parameterised const.");
		this.customerId = customerId;
		this.customerName = customerName;
//		this.contactNumber = contactNumber;
//		this.address = address;
	}
	
	public void pay() {
		
	}
		
}

class RegularCustomer extends Customer{
	
	public double discount;
	
	public RegularCustomer(String customerId, String customerName) {
		super(customerId, customerName);
		// line 2. call the parent constructor
		System.out.println("inside reg. customer");
		//line5 finally complete here.
	}
	
	public void display() {
		System.out.println("Customer : " + customerId);
		System.out.println("Customer : " + customerName);
		System.out.println("Customer : " + contactNumber);
		System.out.println("You got discount of 20%");
		pay();
	}
}

class Guest extends Customer{
	
	public double deliveryCharge;
	
	public void display() {
		System.out.println("Customer : " + customerId);
		System.out.println("Customer : " + customerName);
		System.out.println("Customer : " + contactNumber);
		System.out.println("You got have to pay delivery charge...");
	}
}


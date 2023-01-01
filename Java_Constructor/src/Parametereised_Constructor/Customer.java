package Parametereised_Constructor;

public class Customer {
	public String customerId;
	public String customerName;
	public long contactNumber;
	public String address;
	public static int count = 100;
//	// Default Constructor
//		public Customer() {
//			
//		}
	
//    prameterised consturctor..
	public Customer(String customerName, String address, long contactNumber) {
		System.out.println("Parameterised Constructor is called");
		this.customerId = "C" + ++count;
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.address = address;
	}
}

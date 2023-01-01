package ParameterlessConstructor;

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
	
//	Non prameterised consturctor..
	public Customer() {
		System.out.println("Constructor is called");
		this.customerId = "C" + ++count;
		this.customerName = "Unkown";
		this.contactNumber = 0;
		this.address = "Unknown";
	}
}

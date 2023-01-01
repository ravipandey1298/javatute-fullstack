package MultipleConstructors;

public class Customer {
	public String customerId;
	public String customerName;
	public long contactNumber;
	public String address;
	public static int idGen = 100;
	
	public Customer() {
		System.out.println("Prameterless Constructor is called.");
		this.customerId = "C" + ++idGen;
	}
	
	public Customer(String name) {
		this();
		System.out.println("call using this(name)");
		this.customerName = name;
	}
	
	public Customer(String customerName, long contactNumber, String address) {
		this(customerName);
		System.out.println("Prameterized Constructor is called.");
		
//		this.customerId = customerId;
		
//		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.address = address;
		
	}
}

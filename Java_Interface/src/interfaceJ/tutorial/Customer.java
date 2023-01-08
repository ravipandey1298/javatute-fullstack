package interfaceJ.tutorial;

public class Customer {
	private String customerId;
	private String customerName;
	private long contactNumber;
	private Address address;
		
	public Customer(String customerId, String customerName, long contactNumber, Address address) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.address = address;
	}
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public double payBill(double totalPrice) {
		return totalPrice;
	}

	public void displayCustomerDetails() {
		System.out.println("Displaying customer Details");
		System.out.println("****************************");
		System.out.println("Customer Id : " + this.customerId);
		System.out.println("Customer Name : " + this.customerName);
		System.out.println("Contact Number : " + this.contactNumber);
		System.out.println("Address : " + this.address);		
	} 
}

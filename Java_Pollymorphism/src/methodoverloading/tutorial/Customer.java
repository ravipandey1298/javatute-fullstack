package methodoverloading.tutorial;

public class Customer {
	private String customerId;
	private String customerName;
	private long contactNumber;
	private long transId;
	private Address address;
	public void updateDetails(long mobile) {
		System.out.println("Updating customer contact number...");
		this.setContactNumber(mobile);
	}
	public void updateDetails(String customerId, long transId) {
		System.out.println("Updating customer contact number...");
//		this.setContactNumber(mobile);
	}
	public void updateDetails(long mobile, String customerName) {
		System.out.println("Updating customer contact number as well as CustomerName...");
		this.setContactNumber(mobile);
	}
	public void updateDetails(Address address) {
		System.out.println("Updating customer address...");
		this.setAddress(address);
	}
	// Constructors and other methods
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
	
	
}


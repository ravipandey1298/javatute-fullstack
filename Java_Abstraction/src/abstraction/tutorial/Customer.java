package abstraction.tutorial;

public class Customer {
	
	private String customerName;
	private String customerId;
	private String trasactionId;  // T20231000
	private static double totalBalance;
	
	public Customer() {
		this.totalBalance = 0.0;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getTrasactionId() {
		return trasactionId;
	}
	public void setTrasactionId(String trasactionId) {
		this.trasactionId = trasactionId;
	}
	public static double getTotalBalance() {
		return totalBalance;
	}
	public static void setTotalBalance(double totalBalance) {
		Customer.totalBalance = totalBalance;
	}
	
	public void addBalance(double amount) {
		totalBalance += amount;
	}
	
	public void withdrawMoney(double requestAmount) {
		totalBalance -= requestAmount;
	}
	
}

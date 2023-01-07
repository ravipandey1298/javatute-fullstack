package staticJ.tutorial;

public class Tester1 {
	public static void main(String[] args) {
		Customer.getCounter();
		Customer customer1 = new Customer("Sam", 9945000009L, "Carolina Street, Springfield, 62702");
		Customer customer2 = new Customer("John", 9645000009L, "Carolina Street, Springfield, 62708");
		Customer customer3 = new Customer("Alex", 9745000009L, "Carolina Street, Springfield, 62768");
		System.out.println("Customer Id for the first customer is: " + customer1.getCustomerId());
		System.out.println("Customer Id for the second customer is: " + customer2.getCustomerId());
		System.out.println("Customer Id for the third customer is: " + customer3.getCustomerId());
	}
}
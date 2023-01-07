package abstraction.tutorial;

public class Test {
	public static void main(String[] args) {

		Customer customer = new Customer();
		customer.setCustomerId("C101");
		customer.setCustomerName("Vikas");

		System.out.println("User account is opened and with " + customer.getTotalBalance() + " balance");

		customer.addBalance(2000);

		System.out.println(customer.getTotalBalance());

		customer.withdrawMoney(90);

		System.out.println(customer.getTotalBalance());

		Customer customer2 = new Customer();
		System.out.println("User account is opened and with " + customer.getTotalBalance() + " balance");
	}
}

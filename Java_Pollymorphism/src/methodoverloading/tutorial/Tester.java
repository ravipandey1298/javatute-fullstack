package methodoverloading.tutorial;

public class Tester {
	public static void main(String[] args) {
		Customer customer = new Customer();
		
		Address address = new Address();
		address.setCity("Delhi");
		customer.updateDetails(34343434L, "raVI");
	}
}	

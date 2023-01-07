package MultipleConstructors;

public class TestMulitple {
	public static void main(String[] args) {
		
		Customer c = new Customer("Manohar", 34343, "Delhi");
		System.out.println(c.contactNumber);
		System.out.println(c.customerId);
		System.out.println(c.customerName);
		System.out.println(c.address);
		
		Customer c1 = new Customer("Manohar", 34343, "Delhi");
		System.out.println(c1.contactNumber);
		System.out.println(c1.customerId);
		System.out.println(c1.customerName);
		System.out.println(c1.address);
		
		PrivateClass test = new PrivateClass();
		test.name = "Ravi";
	}
}	

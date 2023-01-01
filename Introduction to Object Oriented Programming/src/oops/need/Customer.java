package oops.need;

public class Customer {
	public static void main(String[] args) {
		String customerType = "Regular";
		String orderedFood = "Pizza";
		int quantity = 1;
		int unitPrice = 10;
		int totalCost = 0;
		
		totalCost = unitPrice * quantity;
		
		if(customerType.equals("Regular") && orderedFood.equals("Pizza")) {
			totalCost = totalCost - (totalCost * 5/100);
		}
	}
}	

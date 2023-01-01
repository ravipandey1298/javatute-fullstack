
public class MethodsReturnigType {
	
	public String customerName;
	
	public double payBill(double totalPrice, double discountPercentage) {
		double priceAfterDiscount = totalPrice * (1 - (discountPercentage/100));				
		return priceAfterDiscount;
	}
}

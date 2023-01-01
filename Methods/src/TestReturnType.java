
public class TestReturnType {
	public static void main(String[] args) {
		
		MethodsReturnigType pay = new MethodsReturnigType();
		pay.customerName = "Vikas";
//		double amountToPaid = pay.payBill(34343, 25);
//		
//		System.out.println("Hi " + pay.customerName + ", your final bill amount after discount is : "
//							+ (int)(amountToPaid * 100)/100.0);
		
		System.out.println("Hi " + pay.customerName + ", your final bill amount after discount is : "
				+ (int)(pay.payBill(34343, 25) * 100)/100.0);
		
	}
}

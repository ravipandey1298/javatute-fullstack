
public class MethodsJava {
//	public void payBill(double totalPrice, double discount) {
//		//		method body.	
//	}
//	
	/*
	 *  A Method is a set of statements which represent the behaivor of a class. It is used to implement a specific functionality.
	 *  In java, every method must be a part of some class.
	 * 
	 * 
	 * Return Type : the data type of the value returned by the method or void if nothing is returned.
	 * 
	 * Parameter/Argument : 
	 * 
	 */
	public String customerName;
	
//						formal parameters.
	public void payBill(double totalPrice, double discountPercentage) {
			System.out.println("Calulating final amount to be paid...");
			double priceAfterDiscount = totalPrice * (1 - (discountPercentage/100));	// Local variable			
					System.out.println("Hi " + customerName + ", your final bill amount after discount is : "
							+ (int)(priceAfterDiscount * 100)/100.0);
	}
}

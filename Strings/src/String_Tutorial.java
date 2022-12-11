
public class String_Tutorial {
	/*
	 * 
	 * Sequence of charcater..
	 * String predefined class..
	 * Comes with many methods that help us to perform various operations...
	 * 
	 * 	1. String Literal
	 * 	String name = "Manohar";
	 * 
	 * 	2. using new() keyword;
	 * 
	 */
	
	public static void main(String[] args) {
		//String Literal.
		String value1 = "Manohar";
		String value2 = "Manohar";
		
		System.out.println(value1 == value2);
		
		// using new Keyword....
		
		String valueNew1 = new String("Manohar");
		String valueNew2 = new String("Manohar");
		System.out.println(valueNew1 == valueNew2);
		
		System.out.println(valueNew1.equals(valueNew2));
		
	}
}

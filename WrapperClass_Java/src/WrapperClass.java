
public class WrapperClass {
	/*
	 * 	----------------------------------
	 *  | Primitive 	|  Wrapper Class  |
	 *  -----------------------------------
	 *  | char		 	|  Character      |
	 *  | byte		 	|  Byte 		  |
	 *  | short		 	|  Short		  |
	 *  | long		 	|  Long			  |
	 *  | float		 	|  Float		  |
	 *  | double	 	|  Double		  |
	 *  | boolean	 	|  Boolean		  |
	 *  | int		 	|  Integer		  |
	 *  -----------------------------------
	 */
	
	public static void main(String[] args) {
		
	
	char value = 'a';
	//Autoboxing -   Automatic conversion of primitive type to objects.
	Character wrappedChar = value;
	
	
	//Unboxing - conversion of object to primitive. Opposite of autoboxing.
	char newVal = wrappedChar;
	
	
	String sum = "123"; 
	int mySum = Integer.parseInt(sum);// Here 'mySum' would be holding the integer 123

	
	Integer phoneNo = 44281234; 
	Long phoneNoLong = phoneNo.longValue(); // Converts Integer into a Long value
	
	Character alphaObj = new Character('A');
	Character digitObj = new Character('5');
	
	boolean result1 = Character.isDigit(digitObj); // Output :- true
	System.out.println(result1);
	boolean result2 = Character.isUpperCase(alphaObj); // Output :- true
	System.out.println(result2);
	
	Integer f = 4;
	String val = f.toString(); // val = "A"
	System.out.println(val);
	char beta = alphaObj.charValue(); // beta = 'A'
	System.out.println(val);
	char c = Character.toLowerCase('B'); // c = 'b';
	System.out.println(c);
	int result11 = Character.compare('A', 'b');
	System.out.println(result11); //-33
		    
	Character anotherCharacter = new Character('b');
	int result22 = alphaObj.compareTo(anotherCharacter);
	System.out.println(result22); //-33
	}
}

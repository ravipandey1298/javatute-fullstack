
public class TypeConversion {
	public static void main(String[] args) {
		
		short value = 45;
		
		long valueLong = value; // Implicit conversion
		
		System.out.println(valueLong);
		
		
		long value1 = 5565;
		int vlaueInt = (int)value1; // Explicit Conversion
		
		
		
		
		float valueFloat = 34.0f;
		
		System.out.println(valueFloat + vlaueInt);
		
		
		long salary = 3449;
		
		double calculateSalary = salary + (double)((salary)/100) * 2;
		
		System.out.println(calculateSalary);
		
		
		
		
	}
}

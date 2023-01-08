
public class Recursion {
	public static void main(String[] args) {
		System.out.println("Factorial : " + Recursion.factorial(5));
	}

	public static int factorial(int num) {
		
		// base condition 
		if (num <= 1)
			return 1;
		
		// function call
		else
			return (num * factorial(num - 1));
	}
}

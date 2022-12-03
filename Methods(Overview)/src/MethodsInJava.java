import java.util.Scanner;

public class MethodsInJava {
	
	static void calculateFactorial(int factorialOfNumber) {
		int factorial = 1;
		for(int i = factorialOfNumber; i>0; i--) {
			factorial = factorial * i;
		}
		System.out.println("Factorial of " + factorialOfNumber + " is " + factorial);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int factorialOfNumber1 = sc.nextInt();
		int factorialOfNumber2 = sc.nextInt();
		int factorialOfNumber3 = sc.nextInt();
		int factorialOfNumber4 = sc.nextInt();
		
			
		calculateFactorial(factorialOfNumber1);
		calculateFactorial(factorialOfNumber2);
		calculateFactorial(factorialOfNumber3);
		calculateFactorial(factorialOfNumber4);
		
		
	}
}

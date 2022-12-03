import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = sc.nextInt();
		
		/*
		 * Factorial --- >
		 * 	
		 *  5! = 5 * 4 * 3 * 2 * 1 = 120
		 * 
		 */
		int factorial = 1;
		for(int i = number; i>0; i--) {
//			factorial *= i;
			factorial = factorial * i;
		}
		System.out.println("Factorial of " + number + " is " + factorial);
		
		factorial = 1;
		for(int i = 1; i<=number; i++) {
//			factorial *= i;
			factorial = factorial * i;
		}
		System.out.println("(Secondary way)Factorial of " + number + " is " + factorial);
	}
	
	

}

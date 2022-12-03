import java.util.Scanner;

public class Gcd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 number : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int greatestNumber = num2;
		
		int gcd = 1;
		
		// assigning the greatest value.
		if(num1 > num2)
			greatestNumber = num1;
		
		// start finding GCD form the minimum gcd value : 2
		
		int index = 2;
		
		//keep changing unless the index is larger than greatestNumber and the greatestNumber value is larger than 2
		
		/*
		 *  6 = 2 * 3
		 *  12 = 2 * 2 * 3
		 */
		while(index <= greatestNumber && greatestNumber > 2) {
			if((num1 % index == 0) && (num2 % index == 0))
				gcd = index;
			
			index++;
		}
		System.out.println(gcd);
		
		
		
	}
	
	
	
}

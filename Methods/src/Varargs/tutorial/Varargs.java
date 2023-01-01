package Varargs.tutorial;

public class Varargs {
	/*
	 * 
	 * 	public void pay(int... args){
	 * 
	 * }
	 * 
	 */
	
	public void addMobile(long... mobile) {
		System.out.println("Function called......");
		for(long i : mobile) {
			System.out.println(" " + i);
		}
	}
	
//	 Produce compile time error beacause we don't initialize more than one varargs.
//	public void addNameWithMobile(String...name, long... mobile) {
//		System.out.println("Function called......");
//		for(long i : mobile) {
//			System.out.println(" " + i);
//		}
//	}
	
//	Produce an error beacause we can only initialize varargs as a last parameter not in middle and start
//	public void addNameWithMobile2(long... mobile, String name, String address, int age) {
//		System.out.println("Function called......");
//		for(long i : mobile) {
//			System.out.println(" " + i);
//		}
//	}
	
	public void addNameWithMobile(String name, String address, int age , long... mobile) {
		System.out.println("Function called......");
		for(long i : mobile) {
			System.out.println(" " + i);
		}
	}
	
	public void namesOfStudent(String...names) {
		int count = 0;
		for(String i : names) {
			count++;
			System.out.println("Student " + count + " Name is : " + i);
		}
	}
	
	// Question : findAverage(num1, num2, num3);
//					-> Return the average rounded off to two decimals.
	
//	SampleInput : 12, 8, 15 = 11.67   ||  10, 20, 30 = 20.0
}

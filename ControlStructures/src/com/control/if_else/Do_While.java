package com.control.if_else;

public class Do_While {
	public static void main(String[] args) {
		
		/*
		 * 
		 * do{
		 * 
		 * }while(condition)
		 * 
		 */
		
		// In complete life cycle it was running once at most.
		
		int number = 5;
		int initalValue = 1;
		
		do {
			System.out.println(initalValue);
			initalValue += 10; // initalValue = 11;
		}while(initalValue <= number);
		
	}
}

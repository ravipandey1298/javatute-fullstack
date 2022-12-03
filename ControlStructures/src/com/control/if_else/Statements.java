package com.control.if_else;

public class Statements {
	public static void main(String[] args) {
		/*
		 * break;
		 * break-label;
		 * continue;
		 * return; 
		 */
		
		int number = 10;
		/*
		 * 
		 * example of break;
		for(int i = 1; i<=number; i++) {
			if(i == 4) {
				System.out.println("Print " + i);
				break;
			}
		}
		*/
		
		/*
		 * example of continue;
		for(int i = 1; i<=number; i++) {
			if(i == 5) {
				continue; // Skip the current iteration
			}
			System.out.println("Print " + i);
		}
		*/
		
		
		for(int i = 1; i<=number; i++) {
			if(i == 4) {
				System.out.println("Print Statement inside if " + i);
				return;
			}
			System.out.println("Print statement for outside if " + i);
		}
		
	}
}

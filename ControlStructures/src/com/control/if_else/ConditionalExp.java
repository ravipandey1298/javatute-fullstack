package com.control.if_else;

import java.util.Scanner;

public class ConditionalExp {

	/*
	 * if-else
	 * if-else if-else
	 */
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int age, validAge; //value1, value2, value3;
	
	age = sc.nextInt();
	
	validAge = sc.nextInt();
//	value1 = sc.nextInt();
//	value2 = sc.nextInt();
//	value3 = sc.nextInt();
	System.out.println("age = " + age + " validAge = " + validAge );//+ " value1 = " + value1 + " value2 = "  + value2 + " value3 = " + value3);
	 
	
	// Program to check candidate is eligible..
	
	if(age >= validAge) {
		System.out.println("Is Eligible");
	}else {
		System.out.println("Is not Eligible");
	}
	
	if(age >= validAge) {
		System.out.println("you are eligible");
	}else if (age >= 15 && age < validAge) {
		System.out.println("You can go with some one whose age is more than or equal to " + validAge);
	}else{
		System.out.println("nOt eligible");
	}
	
	
	if(age >= validAge) {
		System.out.println("you are eligible");
	}
	if (age >= 15 && age < validAge) {
		System.out.println("You can go with some one whose age is more than or equal to " + validAge);
	}else{
		System.out.println("nOt eligible");
	}
	
	
	// Nested if-else
		if(true) {
			if(true) {
				if(true) {
					
				}
			}
		}
	
		// eligibility  age 10 - 20 age 40 -45
		
		if((age >=10 && age <= 20) || (age >= 40 && age <= 45)) {
			System.out.println("you are eligible");
		}
		
		
		

		if((age >=10 && age <= 20) || (age >= 40 && age <= 45))
			age++;
		
		// Ternary operator
		
		System.out.println(age > validAge ? "Is Eligible" : "Not Eligible");
		
		int vaule23 = age > validAge ? age++ : age--;
		
		boolean value24 = age > validAge ? true : false;
		
		System.out.println(vaule23 + "" +  value24);
	
	
	}
	
}

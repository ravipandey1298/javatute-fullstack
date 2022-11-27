package com.control.if_else;
import java.util.Scanner;

public class Switchcase {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.nextLine();
		
		/*
		 *  switch (condition){
		 *  	
		 *  case : 
		 *  	statement
		 *  
		 *  case : 
		 *  	statement
		 *  
		 *  default :
		 *  	statement
		 *  
		 *  
		 *  }
		 */
		
		switch(name) {
		case "Ravi":
			System.out.println("We found Ravi...");
			break;
		case "Manohar":
			System.out.println("We found Manohar...");
			break;
		case "Madhur":
			System.out.println("We found Madhur...");
			break;
		case "Vishal":
			System.out.println("We found Vishal...");
			break;
			
		default :
			System.out.println("We found anyone");
		}
		
	}
}

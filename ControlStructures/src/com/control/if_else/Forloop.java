package com.control.if_else;

public class Forloop {
	public static void main(String[] args) {
		
		/*
		 * for(initialization; condition; increement/decrement){
		 * }
		 */
		
		
		/*
		 * 
		 * Infinite loop
		for(; ; ) {
			System.out.println("Print");
		}
		*/
		
//		for(int i = 0; i<10; ) {
//			i++;
//		}
		
//		for(int i = 0; i < 32; i++) {
//			System.out.println("Print " + i);
//		}
//		
		String str = "Manohar";
//		for(int i = 0; i< str.length(); i++) {
//			System.out.println(str.charAt(i));
//		}
		
		for(int i=0, j=3, k=4; i<4 && j < 10 && k< 15; i++, j++, k++) {
			System.out.println("Print " + i +" " +  j + " " +   k);		
		}
		
	}
}

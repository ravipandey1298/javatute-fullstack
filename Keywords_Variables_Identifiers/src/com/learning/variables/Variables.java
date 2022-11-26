package com.learning.variables;

class Variables1 {
	int instanceVariable = 34;	// INSTANCE VARIBAL / DECLARATIVE STATEMENT	/ CLASS LEVEL VARIABLES
}

public class Variables{
	public static void main(String[] args) {
		int variable = 0; // LOCAL VARIABLE, || variable - Mermory address XX334cd;
		
		
		byte valueByte = 23;
		short vauleShort = 21;
		long valueLong = 23L; //use litterals -> L/l
		char valueChar = 'A';
		float valueFloat = 34.23f; //use litterals -> F/f
		
		double valueDouble = 34.99;
		boolean valueBoolean = true; // value of boolean is always true/false
		
		
		
		
		variable = 34; // Re - Initialize
		Variables1 va = new Variables1();
		va.instanceVariable = 23; // update it to 23.
		System.out.println("Instance Variable default value " + va.instanceVariable);
		System.out.println("Variable value " + variable); // Local variable we have to initialize the value always
		
	}
}
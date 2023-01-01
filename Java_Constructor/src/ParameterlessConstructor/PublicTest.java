package ParameterlessConstructor;

import MultipleConstructors.PublicClassToTest;

public class PublicTest {
	public static void main(String[] args) {
		PublicClassToTest test = new PublicClassToTest();
		test.name = "Manohar";
		System.out.println(test.name);
	}
}

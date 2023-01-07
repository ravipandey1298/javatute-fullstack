package ParameterlessConstructor;

import MultipleConstructors.PrivateClass;
import MultipleConstructors.PublicClassToTest;

public class PublicTest {
	public static void main(String[] args) {
		PublicClassToTest test = new PublicClassToTest();
		test.name = "Manohar";
		System.out.println(test.name);
		
		PrivateClass tet =new PrivateClass();
//		System.out.println(tet.name);
		
	}
}

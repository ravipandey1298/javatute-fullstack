package abstractJ.tutorial;

abstract class GrandParent {
	abstract void display();
	
	void pay() {
		System.out.println("pay");
	}
}

abstract class Parent extends GrandParent {	// Can we remove the abstract keyword from here?
	final void displayInParent() {
		System.out.println("In Parent");
	}
}

class Child extends Parent {
	void display() {
		System.out.println("Child completes Parent and GrandParent");
	}
}

final class GrandChild extends Child {
	void display() {
		System.out.println("In GrandChild");
		super.display();
	}
}

//Uncomment the code given below and observe
//class GreatGrandChild extends GrandChild { }		    

public class AbstractTest {
	public static void main(String[] args) {
		new GrandChild().display();
	}
}


class Demo {
	final float PI_VALUE = 3.14f;
	final int num = 10; // final variable

	public final void changeNumber() {
//		num = 20;
		System.out.println("The value of num is " + num);
	}
}

class FinalDemo {

	public static void main(String args[]) {
		Demo demo = new Demo();
		demo.changeNumber();
	}
}

class D1 extends Demo {
	
//	public void changeNumber() {
//		
//	}
	
}
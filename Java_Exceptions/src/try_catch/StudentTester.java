package try_catch;

class Student {
	private String name;
	private int[] marks;
	private float averageMarks;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public float getAverageMarks() {
		return averageMarks;
	}

	public void setAverageMarks(float averageMarks) {
		this.averageMarks = averageMarks;
	}

	public void calculateAverageMarks() {
//		try {
//
//			try {
//				int sum = 0;
//				int totalSubjects = 1;
//				for (int i = 0; i < marks.length; i++) {
//					sum += marks[i];
//				}
//				this.averageMarks = sum / totalSubjects;// Calculating averageMarks
//				System.out.println("Average Marks : " + this.averageMarks);
//			} catch (ArithmeticException e) {
//				System.out.println("Divide by Zero exception occured");
//			} catch (ArrayIndexOutOfBoundsException manohar) {
//				System.out.println("ArrayIndex of bound occurs.");
//			}
//
//		} catch (Exception e) {
//			System.out.println("Some exception occured");
//		}

		try {
			int sum = 0;
			int totalSubjects = 3;
			for (int i = 0; i < marks.length; i++) {
				if(marks[i] < 0)
					throw new Exception("Marks must not be negative");
				sum += marks[i];
			}
			this.averageMarks = sum / totalSubjects;// Calculating averageMarks
			System.out.println("Average Marks : " + this.averageMarks);
		} catch (ArithmeticException e) {
			System.out.println("Divide by Zero exception occured");
		} catch (ArrayIndexOutOfBoundsException manohar) {
			System.out.println("ArrayIndex of bound occurs.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("finally");
		}
	}
}

//Que : checked or unchecked

public class StudentTester {
	public static void main(String[] args) {
		Student student1 = new Student();
		int[] marks = { 96, -65, 76 };
		student1.setMarks(marks);
		student1.calculateAverageMarks();
	}
}

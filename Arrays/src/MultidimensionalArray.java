
public class MultidimensionalArray {
	/*
	 * 
	 * 	Multidimensional array
	 * 
	 * 	Multidimensional arrays are arrays which holdings the reference of other arrays.
	 * 
	 * Syntax:
	 * 
	 * 	dataType[][] arrayName = new dataType[rowsize][columnsize];
	 * 
	 */
	
	public static void main(String[] args) {
		
		int[][] array2D = new int[2][1];
		
		array2D[0][0] = 29;
		array2D[1][0] = 34;
		
		System.out.println("Row 1: " +array2D[0][0]);
		System.out.println("Row 2: " +array2D[1][0]);
		
		System.out.println(array2D.length);
		
		int [][] arrayNew = {{29}, {34}};
		
		
		int [][][] array3D = {{{34}, {45}}};
		
		System.out.println(array3D[0][0][0]);
		System.out.println(array3D[0][1][0]);
		
	}
}

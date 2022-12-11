
public class Arrays {
	/*
	 * one dimensional array : initalizatio === datatype arrayName[] = new
	 * datatype[size]
	 * 
	 * Range of indexes for the elements in an array is from 0 to (sizeOfArray-1)
	 * 
	 */
	
	static void printArray(int arr[]) {
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println("index : " + i + " value : " + arr[i]);
//		}
		
		//foreach
		
		/*
		 * Syntax of foreach :
		 * 
		 * 	for(datatype variable : array){
		 * 		
		 * }
		 * 
		 */
		int count = 0;
		for(int i : arr) {
			System.out.println("At index : " + count++ + " value is : " + i );
		}
	}
	
	public static void main(String[] args) {

		int array[]; // there is no memory allocate to this array. It is only initialized.

		int array1D[] = new int[5]; // when we initialize the array with new keyword -> Memory allocate array1D

		array1D[0] = 1;
		array1D[1] = 2;
		array1D[2] = 3;
		array1D[3] = 4;
		array1D[4] = 5;
//		array1D[5] = 6; this produce array index outof bound exception. 
//		Beacuse the size of element is 5 and we are trying to initialize more than 5
//		System.out.println(array1D.length);
//		printArray(array1D);
		
		int arranotherWay[] = {2, 3, 4, 56, 87}; 
		System.out.println(arranotherWay.length);
		printArray(arranotherWay);
		for(int i =0; i< arranotherWay.length; i++) {
//			System.out.println(arranotherWay[i]);
//			System.out.println(arranotherWay);
		}
		
		long restaurantContact[] = {3323232332423L, 24324234324L, 3424324324234L};
	}
}

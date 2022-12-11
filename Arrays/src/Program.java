
public class Program {
	/*
	 * We are trying to store dayWise Temperature, 1 index takes the highest TEmp, 2 index takes the lowest TEmp.
	 * 
	 */
	
	
	
	public static void main(String[] args) {
		
		int [][] dayWiseTemp = {{24, 16}, {23, 18}, {22, 19}, {25, 14}, {28, 22}, {27, 15}, {30, 23}};
		
		// Displaying 2D array
		int day = 11;
		for(int i=0; i < 7; i++) {
			for(int j = 0; j < 2; j++) {
				if(j == 0) {
					System.out.println("Max Temperature is " + dayWiseTemp[i][j] + " on day " + (day + i));
				}else {
					System.out.println("Min Temperature is " + dayWiseTemp[i][j] + " on day " + (day + i));
				}
			}
		}
		
	}
}

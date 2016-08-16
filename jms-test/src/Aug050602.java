/**
 * Rotate Matrix
 * Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes,
 * write a method to rotate the image by 90 degrees. Can you do this in place?
 */
public class Aug050602 {
	public static void transpose(int[][] input) {
		for (int i = 0, x = 0; i < input.length; i++) {
			for (int j = i; j < input[0].length; j++) {
				x = input[i][j];
				input[i][j] = input[j][i];
				input[j][i] = x;
			}
		}
	}
	
	public static void swapColumn(int input[][]) {
		for (int column = 0, x = 0; column < input[0].length / 2; column++) {
			for (int row = 0; row < input.length; row++) {
				x = input[row][column];
				input[row][column] = input[row][input[0].length - 1 - column];
				input[row][input[0].length - 1 - column] = x;
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[][] input = {
				{ 1, 2, 3, 4 },
				{ 5, 6, 7, 8 },
				{ 9, 10, 11, 12 },
				{ 13, 14, 15, 16 }
		};
		
		transpose(input);
		swapColumn(input);
		
		Aug050603.print(input);
	}
}

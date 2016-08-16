/**
 * Rotate Matrix
 * Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes,
 * write a method to rotate the image by 90 degrees. Can you do this in place?
 */
public class Aug0506021 {
	
	private static void transpose(int[][] m) {
		
		for (int i = 0; i < m.length; i++) {
			for (int j = i; j < m[0].length; j++) {
				int x = m[i][j];
				m[i][j] = m[j][i];
				m[j][i] = x;
			}
		}
	}
	
	public static void rotateByNinetyToLeft(int[][] m) {
		// transpose
		transpose(m);
		
		//  swap rows
		for (int i = 0; i < m.length / 2; i++) {
			for (int j = 0; j < m[0].length; j++) {
				int x = m[i][j];
				m[i][j] = m[m.length - 1 - i][j];
				m[m.length - 1 - i][j] = x;
			}
		}
	}
	
	public static void rotateByNinetyToRight(int[][] m) {
		// transpose
		transpose(m);
		
		// swap columns
		for (int j = 0; j < m[0].length / 2; j++) {
			for (int i = 0; i < m.length; i++) {
				int x = m[i][j];
				m[i][j] = m[i][m[0].length - 1 - j];
				m[i][m[0].length - 1 - j] = x;
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
		
//		rotateByNinetyToLeft(input);
		transpose(input);
		
		Aug050603.print(input);
	}
}

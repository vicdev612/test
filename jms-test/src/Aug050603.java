import java.util.ArrayList;

/**
 * Zero Matrix
 * Write an algorithm such that if an element in an MxN matrix 0, its entire row and column are set to 0.
 */
public class Aug050603 {
	public static void main(String[] args) {
		int[][] input = {
				{ 1, 2, 3, 4 },
				{ 1, 0, 3, 4 },
				{ 1, 2, 3, 4 },
				{ 1, 2, 0, 4 },
				{ 1, 2, 3, 4 },
				{ 1, 2, 3, 4 }
		};
		
		print(input);
		ArrayList<Integer> columns = new ArrayList<Integer>();
		ArrayList<Integer> rows = new ArrayList<Integer>();
		
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[i].length; j++) {
				if (input[i][j] == 0) {
					rows.add(i);
					columns.add(j);
				}
			}
		}
		
		for (int row : rows) {
			for (int column = 0; column < input[0].length; column++) {
				System.out.println(row + "," + column + ", " + input[0].length);
				input[row][column] = 0;
			}
		}
		
		for (int column : columns) {
			for (int row = 0; row < input.length; row++) {
				System.out.println(row + "," + column + ", " + input.length);
				input[row][column] = 0;
			}
		}
		
		print(input);
	}
	
	public static void print(int[][] input) {
		for (int i = 0; i < input.length; i++) {
			System.out.print("{");
			for (int j = 0; j < input[i].length; j++) {
				System.out.print(input[i][j] + ", ");
			}
			System.out.println("}");
		}
	}
	
	public static void main1(String[] args) {
		int[][] input = {
				{ 1, 2, 3, 4 },
				{ 1, 0, 3, 4 },
				{ 1, 2, 3, 4 },
				{ 1, 2, 0, 4 },
				{ 1, 2, 3, 4 },
				{ 1, 2, 3, 4 }
		};
		
		int m = input.length;
		int n = input[0].length;
		int[][] matrix = input;
		
		boolean[] row = new boolean[m];
		boolean[] column = new boolean[n];
		for (int i = 0; i < m; i++)
		{
			for (int j = 0; j < n; j++)
			{
				if (matrix[i][j] == 0)
				{
					row[i] = true;
					column[j] = true;
				}
			}
		}
		for (int i = 0; i < m; i++)
		{
			if (row[i])
			{
				for (int j = 0; j < n; j++)
				{
					matrix[i][j] = 0;
				}
			}
		}
		for (int j = 0; j < n; j++)
		{
			if (column[j])
			{
				for (int i = 0; i < m; i++)
				{
					matrix[i][j] = 0;
				}
			}
		}
		
//		for (int i = 0; i < input.length; i++) {
//			for (int j = 0; j < input[i].length; j++) {
//				input[i][j] = 0;
//			}
//		}
//		
		print(input);
	}
}

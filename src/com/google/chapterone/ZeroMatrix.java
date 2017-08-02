package com.google.chapterone;
// O(mn) - Time complexity
public class ZeroMatrix {

	public static void setZero(int matrix[][]) {
		int[] row = new int[matrix.length];
		int[] col = new int[matrix[0].length];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					row[i] = 1;
					col[j] = 1;
				}
			}
		}
		
		// Set arr[i][j] to 0 if either row i or column j has a 1
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (row[i] == 1 || col[j] == 1)
					matrix[i][j] = 0;
			}
		}
		// Printing the final matrix
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + "  ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		int a[][] = { { 0, 2, 3}, { 4, 5, 0 }, { 7, 1, 9} };
		setZero(a);

	}

}

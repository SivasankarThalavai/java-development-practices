package p_programs.matrix;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String args[]) {

		int row, col, i, j;

		Scanner in = new Scanner(System.in);

		System.out.println("Enter the number of rows");
		row = in.nextInt();

		System.out.println("Enter the number columns");
		col = in.nextInt();

		int originial[][] = new int[row][col];
		int transpose[][] = new int[row][col];

		System.out.println("Enter the elements of matrix1");

		for (i = 0; i < row; i++) {

			for (j = 0; j < col; j++) {
				originial[i][j] = in.nextInt();
			}

			System.out.println();
		}

		display(originial);

		// Transpose the matrix
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				transpose[j][i] = originial[i][j];
			}
		}

		// Display transposed matrix
		display(transpose);

	}

	private static void display(int[][] matrix) {

		System.out.println("The matrix is: ");
		for (int[] row : matrix) {
			for (int column : row) {
				System.out.print(column + "    ");
			}
			System.out.println();
		}
	}
}
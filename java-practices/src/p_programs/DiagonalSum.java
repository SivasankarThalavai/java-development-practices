package p_programs;

public class DiagonalSum {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
		printDiagonalSums(a, 4);
		printDiagonalSums1(a, 4);
	}

	private static void printDiagonalSums1(int[][] mat, int n) {
		int principal = 0, secondary = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					principal += mat[i][j];
				}
				if ((i + j) == (n - 1)) {
					secondary += mat[i][j];
				}
			}
		}

		System.out.println("Principal Diagonal:" + principal);
		System.out.println("Secondary Diagonal:" + secondary);
	}

	private static void printDiagonalSums(int[][] mat, int n) {
		int principal = 0, secondary = 0;
		for (int i = 0; i < n; i++) {
			principal += mat[i][i];
			secondary += mat[i][n - i - 1];
		}
		System.out.println("Principal Diagonal:" + principal);
		System.out.println("Secondary Diagonal:" + secondary);
	}

}

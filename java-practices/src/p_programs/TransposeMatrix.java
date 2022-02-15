package p_programs;

public class TransposeMatrix {

	private static final int N = 4;

	private static void transpose(int original[][], int transpose[][]) {
		int i, j;
		for (i = 0; i < N; i++)
			for (j = 0; j < N; j++)
				transpose[i][j] = original[j][i];
	}

	public static void main(String[] args) {

		int original[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12, 13 }, { 14, 15, 16, 17 } };

		int transpose[][] = new int[N][N], i, j;

		transpose(original, transpose);

		System.out.print("original matrix is \n");
		for (i = 0; i < N; i++) {
			for (j = 0; j < N; j++) {
				System.out.print(original[i][j] + " ");
			}
			System.out.print("\n");
		}

		System.out.print("Result matrix is \n");
		for (i = 0; i < N; i++) {
			for (j = 0; j < N; j++) {
				System.out.print(transpose[i][j] + " ");
			}
			System.out.print("\n");
		}
	}

}

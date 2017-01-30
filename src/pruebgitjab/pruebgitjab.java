package pruebgitjab;

public class pruebgitjab {
	public static int[][] Matrices(int[][] Matrix, int[][] Matrix2) {
		int solucion[][] = new int[Matrix.length][Matrix.length];
		for (int i = 0; i < Matrix.length; ++i) {
			for (int j = 0; j < Matrix.length; ++j) {
				solucion[i][j] = Matrix[i][j] + Matrix2[i][j];
			}
		}
		return solucion;
	}

	public static void main(String[] args) {

		int[][] Matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] Matrix2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int[][] M3;

		M3 = Matrices(Matrix, Matrix2);

		System.out.println(M3[2][2]);

	}
}

package edu.alonso.daw.tema4;

public class Ejercicio10 {

	private static final int TAM = 8;

	public static void main(String[] args) {

		int[][] mat = new int[TAM][TAM];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (i + j < mat.length) {
					mat[i][j] = i + j;
				} else {
					mat[i][j] = (mat.length - 1) * 2 - (i + j);
				}
			}
		}

		mostrarMatriz(mat, "Resultado");

	}

	public static void mostrarMatriz(int[][] arr, String info) {
		System.out.println(info);
		for (int[] fila : arr) {
			for (int col : fila) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}

}

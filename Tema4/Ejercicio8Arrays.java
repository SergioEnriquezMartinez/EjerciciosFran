package edu.alonso.daw.tema4;

import java.util.Random;

public class Ejercicio8 {

	private static final int TAM = 10;
	private static final int LIM = 10;

	public static void main(String[] args) {

		int[][] mat = new int[TAM][TAM];

		/*int mat[][] = { 
				{ 15, 8, 1, 24, 17 }, 
				{ 16, 14, 7, 5, 23 }, 
				{ 22, 20, 13, 6, 4 }, 
				{ 3, 21, 19, 12, 10 },
				{ 9, 2, 25, 18, 11 } 
				};*/

		rellenaMatriz(mat);

		mostrarMatriz(mat, "Matriz original");

		int[] sumaFilas = calculaSumaFilas(mat);
		//mostrarArray(sumaFilas, "Array filas", VERTICAL);

		int[] sumaColumnas = calculaSumaColumnas(mat);
		//mostrarArray(sumaColumnas, "Array columnas", HORIZONTAL);
		
		int diagonalPrincipal = calcularDiagonalPrincipal(mat);
		int diagonalSecundaria = calcularDiagonalSecundaria(mat);
		
		System.out.println(isCuadradoMagico(sumaFilas, sumaColumnas, 
				diagonalPrincipal, diagonalSecundaria)?"Es cuadrado mágico": 
					"NO es cuadrado mágico");

	}

	private static boolean isCuadradoMagico(int[] sumaFilas, int[] sumaColumnas, int diagonalPrincipal,
			int diagonalSecundaria) {
		boolean isMagico = true;
		if(diagonalPrincipal == diagonalSecundaria) {
			for (int i = 0; i < sumaColumnas.length; i++) {
				if(sumaColumnas[i] != diagonalPrincipal || 
						sumaFilas[i] != diagonalPrincipal) {
					isMagico = false;
					break;
				}
			}
		} else {
			isMagico = false;
		}
		
		return isMagico;
	}

	private static int calcularDiagonalPrincipal(int[][] mat) {
		int suma = 0;
		
		for (int i = 0; i < mat.length; i++) {
			suma += mat[i][i];
		}
		
		return suma;
	}
	
	private static int calcularDiagonalSecundaria(int[][] mat) {
		int suma = 0;
		
		int j = mat[0].length -1;
		
		for (int i = 0; i < mat.length; i++) {
			suma += mat[i][j];
			j--;
		}
		
		return suma;
	}

	private static int[] calculaSumaColumnas(int[][] mat) {
		int[] suma = new int[mat[0].length];
		for (int i = 0; i < mat[0].length; i++) {
			for (int j = 0; j < mat.length; j++) {
				suma[i] += mat[j][i];
			}
		}
		return suma;
	}

	private static int[] calculaSumaFilas(int[][] mat) {
		int[] suma = new int[mat.length];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				suma[i] += mat[i][j];
			}
		}
		return suma;
	}

	private static void rellenaMatriz(int[][] mat) {
		Random r = new Random();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				mat[i][j] = r.nextInt(LIM);
			}
		}
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

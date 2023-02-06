package edu.alonso.daw.tema4;

public class Ejercicio9 {

	public static void main(String[] args) {
		int[] a = { 4, 8, 15, 22, 25, 40 }, b = { 3, 6, 18, 21, 25, 47 };
		int[] c = new int[a.length + b.length];
		
		int indexA = 0, indexB = 0;
		
		for (int indexC = 0; indexC < c.length; indexC++) {
			if(indexA == a.length) {
				c[indexC] = b[indexB];
				indexB++;
			} else if(indexB == b.length) {
				c[indexC] = a[indexA];
				indexA++;
			} else if(a[indexA] < b[indexB]) {
				c[indexC] = a[indexA];
				indexA++;
			} else {
				c[indexC] = b[indexB];
				indexB++;
			}
		}
		
		
		mostrarArray(a, "Array A: ");
		mostrarArray(b, "Array B: ");
		mostrarArray(c, "Array C (ordenado): ");
	}

	public static void mostrarArray(int[] arr, String info) {
		System.out.println(info);
		for (int item : arr) {
			System.out.print(item + " ");

		}
		System.out.println();
	}

}

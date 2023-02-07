package edu.alonso.daw.tema4.recursividad;

import java.util.Arrays;

public class Ejercicio3 {

	public static void main(String[] args) {
		Integer[] listado = { 1, 2, 3, 6, 7, 8, 9, 10, 11, 14, 16, 19, 21, 25 };

		int numBuscar = 2;
//		System.out.println("Posición del elemento en la lista: " + busquedaBinaria(listado, 0, listado.length - 1, numBuscar));
		System.out.println("Posición del elemento en la lista: " + busquedaBinariaCollection(listado, numBuscar));
	}

	private static int busquedaBinaria(Integer[] listado, int i_inferior, int i_superior, int numBuscar) {
		if (i_inferior <= i_superior) {
			int i_medio = (i_inferior + i_superior) / 2;
			System.out.println(String.format("Índice inferior %d - Índice superior %d "
					+ "- Índice elemento medio %d - Valor búsqueda %d", i_inferior, i_superior, i_medio, numBuscar));

			if(listado[i_medio] == numBuscar) {
				return i_medio;
			} else if(listado[i_medio] > numBuscar) {
				// El elemento a buscar está en la mitad inferior de la lista.
				return busquedaBinaria(listado, i_inferior, i_medio - 1, numBuscar);
			} else {
				// El elemento a buscar está en la mitad superior de la lista.
				return busquedaBinaria(listado, i_medio + 1, i_superior, numBuscar);
			}
		}

		return -1;
	}
	
	private static int busquedaBinariaCollection(Integer[] listado, int numBuscar) {
		return Arrays.binarySearch(listado, numBuscar);
	}
	

}

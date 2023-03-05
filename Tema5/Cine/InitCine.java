package com.venancio.dam.tema5.fran.ejercicios2.cine;

import java.util.Random;

import com.venancio.dam.tema5.fran.ejercicios2.cola.Cola;

public class InitCine {

	public static void main(String[] args) {

		final double ENTRADA_7_14_ANIOS = 3;
		final double ENTRADA_15_17_ANIOS = 4;
		final double ENTRADA_18_ANIOS = 5;

		Cola<Persona> colaCine = new Cola<>();
		rellenarCola(colaCine);
		
		colaCine.print();

		double cantidadRecaudada = 0;

		Persona p;

		// Recorro la lista
		while (!colaCine.isEmpty()) {
			// Saco la primera persona
			p = colaCine.dequeue();
			System.out.print(p + " - ");

			// Segun la edad de la persona cambiara el precio de la entrada
			if (p.getEdad() >= 7 && p.getEdad() <= 14) {
				cantidadRecaudada += ENTRADA_7_14_ANIOS;
				System.out.print(ENTRADA_7_14_ANIOS + "€");
			} else if (p.getEdad() >= 11 && p.getEdad() <= 17) {
				cantidadRecaudada += ENTRADA_15_17_ANIOS;
				System.out.print(ENTRADA_15_17_ANIOS + "€");
			} else {
				cantidadRecaudada += ENTRADA_18_ANIOS;
				System.out.print(ENTRADA_18_ANIOS + "€");
			}
			System.out.println();
		}

		System.out.println("Se ha recaudado " + cantidadRecaudada + " euros");

	}

	// Metodo que nos permite rellenar la cola dinamica
	public static void rellenarCola(Cola<Persona> cola) {

		// Genero el numero de personas (de 1 a 100).
		Random rand = new Random();
		int numPersonas = rand.nextInt(100) + 1;
//		int numPersonas = rand.nextInt(6) + 1;

		System.out.println("Se van a generar " + numPersonas + " personas");

		Persona p;
		for (int i = 0; i < numPersonas; i++) {

			// Genero la edad de la persona (de 7 a 80 años)
			//edad = rand.nextInt(73) + 7;

			p = new Persona();

			System.out.println("Se ha generado una persona con " + p.getEdad() + " años");

			// Se añade añade a la cola
			cola.enqueue(p);

		}

	}

}

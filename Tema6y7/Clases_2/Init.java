package edu.alonso.daw.tema67.figuras;

import java.util.ArrayList;
import java.util.List;

public class Init {

	public static void main(String[] args) {

		// Crear varias instancias de distintas figuras y almacenarlas en una lista
		List<Figura> listado = new ArrayList<>();

		Figura circulo = new Circulo("rojo", 10);
		listado.add(circulo);

		Figura cuadrado = new Cuadrado("verde", 3);
		listado.add(cuadrado);

		Figura triangulo = new Triangulo("azul", 3.0, 4.0);

		listado.add(triangulo);

		// Mostrar todas las figuras, con sus áreas y perímetros en el mismo for.

		/*
		 * for (Figura figura : listado) { System.out.println("Info figura: " + figura);
		 * // Invoco al método toString System.out.println("Área: " + figura.getArea());
		 * System.out.println("Perímetro: " + figura.getArea()); // Por cada figura
		 * concreta, mostrar un mensaje distinto dentro del mismo for // En el caso
		 * concreto del Cuadrado, imprimir con asteriscos la figura, dentro del mismo
		 * for.
		 * 
		 * if(figura instanceof Circulo) { System.out.println("Es un círculo"); } else
		 * if (figura instanceof Triangulo) { System.out.println("Es un triángulo"); }
		 * else if (figura instanceof Cuadrado) { System.out.println("Es un cuadrado");
		 * }
		 * 
		 * 
		 * System.out.println(); }
		 */

		for (int i = 0; i < listado.size(); i++) {
			System.out.println("Info figura: " + listado.get(i)); // Invoco al método toString
			System.out.println("Área: " + listado.get(i).getArea());
			System.out.println("Perímetro: " + listado.get(i).getArea());
			// Por cada figura concreta, mostrar un mensaje distinto dentro del mismo for
			// En el caso concreto del Cuadrado, imprimir con asteriscos la figura, dentro
			// del mismo for.

			if (listado.get(i) instanceof Circulo) {
				System.out.println("Es un círculo");
			} else if (listado.get(i) instanceof Triangulo) {
				System.out.println("Es un triángulo");
			} else if (listado.get(i) instanceof Cuadrado) {
				System.out.println("Es un cuadrado");
				((Cuadrado) listado.get(i)).imprimir();
			}

			System.out.println();

		}

	}

}

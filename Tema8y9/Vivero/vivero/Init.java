package edu.alonso.daw.tema8.ejercicios2.vivero;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Init {

	private static final String RUTA = "Ficheros";

	public static void main(String[] args) {

		imprimirContenidoFichero2();
	}

	private static void imprimirContenidoFichero() {
		Path fichero = Paths.get(RUTA + "/plantas.bin");

		List<Planta> listadoPlantas = new ArrayList<>();

		try (InputStream is = Files.newInputStream(fichero); ObjectInputStream ois = new ObjectInputStream(is)) {

			System.out.println("Empezamos la lectura del fichero.");

			// while(true) {
			for (;;) {
				Planta planta;
				try {
					planta = (Planta) ois.readObject();
					listadoPlantas.add(planta);
				} catch (EOFException e) {
					System.out.println("EOF.");
					break;
				} catch (ClassNotFoundException e) {
					System.err.println("Error al almacenar las plantas");
					e.printStackTrace();
				}
			}
			System.out.println("Fin de la lectura del fichero.");
		} catch (IOException e) {
			System.err.println("Error al escribir el fichero");
			e.printStackTrace();
		}

		listadoPlantas.forEach(x -> System.out.println(x));
	}

	private static void imprimirContenidoFichero2() {
		Path fichero = Paths.get(RUTA + "/plantas.bin");

		List<Planta> listadoPlantas = new ArrayList<>();
		InputStream is = null;
		ObjectInputStream ois = null;
		try {

			is = Files.newInputStream(fichero);
			ois = new ObjectInputStream(is);

			System.out.println("Empezamos la lectura del fichero.");

			// while(true) {
			for (;;) {
				Planta planta;
				try {
					planta = (Planta) ois.readObject();
					listadoPlantas.add(planta);
				} catch (EOFException e) {
					System.out.println("EOF.");
					break;
				} catch (ClassNotFoundException e) {
					System.err.println("Error al almacenar las plantas");
					e.printStackTrace();
				}
			}
			System.out.println("Fin de la lectura del fichero.");
		} catch (IOException e) {
			System.err.println("Error al escribir el fichero");
			e.printStackTrace();
		} finally {
			if (is != null) {
				try {
					ois.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		listadoPlantas.forEach(x -> System.out.println(x));
	}

}

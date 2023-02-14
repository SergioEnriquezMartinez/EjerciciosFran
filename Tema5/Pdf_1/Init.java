package edu.alonso.daw.tema5.videoclub;

import java.util.Scanner;

public class Init {

	public static void main(String[] args) {
		VideoClub vc = new VideoClub();
		
		Scanner sc = new Scanner(System.in);
		char opt;
		
		vc.aniadirCliente(new Cliente(12345, "Fran"));
		vc.aniadirCliente(new Cliente(12346, "Madera"));
		
		vc.aniadirPelicula(new Pelicula("1", "Moonligth"));
		vc.aniadirPelicula(new Pelicula("2", "Es por tu bien"));
		vc.aniadirPelicula(new Pelicula("3", "La la land"));
		vc.aniadirPelicula(new Pelicula("4", "El guardián invisible"));
		
		do {
			System.out.println("----MENÚ----");
			System.out.println("1-Préstamo");
			System.out.println("2-Devolución");
			System.out.println("3-Lista de Morosos");
			System.out.println("4-Lista de Préstamos");
			System.out.println("5-Lista de Películas");
			System.out.println("6-Salir");
			
			
			do {
				System.out.print("Introduzca la opción deseada: ");
				opt = sc.nextLine().charAt(0);
			} while(opt < '1' || opt > '6');
			
			
			String codPelicula;
			switch (opt) {
			case '1':
				System.out.println("NUEVO PRÉSTAMO");
				System.out.println("Introduzca el código de la película: ");
				
				codPelicula = sc.nextLine();
				
				Pelicula p = vc.buscarPelicula(codPelicula);
				
				if(p != null) {
					// Puedo realizar el préstamo, de momento...
					if(!vc.isPrestada(codPelicula)) {
						// Pido el carnet al cliente
						System.out.print("Introduzca el número de carnet: ");
						int numCarnet = Integer.valueOf(sc.nextLine());
						
						Cliente c = vc.buscarCliente(numCarnet);
						if(c != null) {
							if(vc.aniadirPrestamo(new Prestamo(c, p))) {
								System.out.println("Préstamo realizado con éxito.");
							} else {
								System.err.println("Error al realizar el préstamo.");
							}
						} else {
							System.out.println("Aun no eres socio del videoclub.");
						}
						
					} else {
						System.out.println("La película ya está prestada.");
					}
				} else {
					System.out.println("No disponemos de esa película en el videoclub");
				}
				
				
				break;

			default:
				break;
			}
			
		} while(opt != '6');
			
		
		
		
		System.out.println("CATÁLOGO DE PELÍCULAS:");
		vc.mostrarPeliculas();
		
	}
}

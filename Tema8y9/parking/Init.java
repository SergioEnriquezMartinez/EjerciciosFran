package edu.alonso.daw.tema8.ejercicios1.parking;

import java.util.List;
import java.util.Scanner;

public class Init {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char opt;
		
		Parking parking = new Parking(2);
		
		do {
			
			System.out.println("----MENÚ----");
			System.out.println("\t1 - ENTRAR PARKING");
			System.out.println("\t2 - PAGAR Y SALIR PARKING");
			System.out.println("\t3 - MOSTRAR CANTIDAD COCHES PARKING");
			System.out.println("\t4 - CANTIDAD PLAZAS LIBRES");
			System.out.println("\t5 - SALIR");
			
			do {
				System.out.println("Introduzca la opción deseada: ");
				opt = sc.nextLine().charAt(0);
			} while(opt < '1' || opt > '5');
			
			String matricula;
			
			switch (opt) {
			case '1':
				System.out.println("-------------ENTRAR EN EL PARKING-------------");
				System.out.println("Introduzca su matrícula: ");
				matricula = sc.nextLine();
				
				if(matricula != null && matricula.length() > 0) {
					Ticket t = new Ticket(matricula);
					
					try {
						parking.add(t);
						System.out.println("Vehículo aceptado: " + t);
					} catch (TicketException e) {
						System.err.println("Operación no válida: " + e.getMessage());
					}
				} else {
					System.err.println("Matrícula no válida");
				}
				
				break;
			case '2':
				System.out.println("-------------PAGAR Y SALIR DEL PARKING-------------");
				System.out.println("Introduzca su matrícula: ");
				matricula = sc.nextLine();
				if(matricula != null && matricula.length() > 0) {
					Ticket t = parking.getTicket(matricula);
					if(t != null) {
						try {
							System.out.println("Debe pagar: " + t.getPrecio() + "€");
							System.out.println("Desea pagarlo?(s/n): ");
							
							boolean pagar = sc.nextLine().equalsIgnoreCase("s");
							if(pagar) {
								t.setPagado(true);
								parking.remove(matricula);
								System.out.println("Salida aceptada: " + t);
							} else {
								System.out.println("No puedes sacar el coche sin pagar.");
							}
						} catch (TicketException e) {
							System.err.println("Operación no válida: " + e.getMessage());
						}
						
					} else {
						System.err.println("Matrícula no encontrada");
					}
				} else {
					System.err.println("Matrícula no válida");
				}
				break;
			case '3':
				System.out.println("-------------MOSTRAR COCHES DEL PARKING-------------");
				
				List<Ticket> tickets = parking.getTickets();
				
				for (Ticket ticket : tickets) {
					// Para comprobar que funciona
					//System.out.println(ticket);
					
					// Para la lógica que me pide el ejercicio
					System.out.println("Coche con matrícula: " + ticket.getMatricula());
				}
				
				break;
				
			case '4':
				System.out.println("-------------CANTIDAD PLAZAS LIBRES-------------");
				
				System.out.println("Plazas libres: " + parking.getPlazasLibres());
							
				break;

			}
			
		} while(opt != '5');
		
		System.out.println("Vuelva pronto!");
		
		sc.close();
		
	}

}

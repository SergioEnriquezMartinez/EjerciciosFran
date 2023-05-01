package edu.alonso.daw.tema8.ejercicios1.parking;

import java.util.Scanner;

public class Init {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char opt;
		
		Parking p = new Parking(2);
		
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
						p.add(t);
						System.out.println("Vehículo aceptado: " + t);
					} catch (TicketException e) {
						System.err.println("Operación no válida: " + e.getMessage());
					}
				} else {
					System.err.println("Matrícula no válida");
				}
				
				break;

			default:
				break;
			}
			
		} while(opt != '5');
		
		sc.close();
		
	}

}

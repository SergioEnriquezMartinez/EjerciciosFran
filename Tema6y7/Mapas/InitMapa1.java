package edu.alonso.daw.tema5.mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class InitMapa1 {

	
	public static void main(String[] args) {
		ejercicio();
	}

	private static void ejercicio() {
		// Si estuviera bien hecho, se haría con un String como clave
		// para evitar que se pueda comer el primer cerro (en el caso de Ávila)
		// Lo hago para usar Integer con autoboxing y unboxing
		Map<Integer, String> provincias = new HashMap<>();
		
		// Válidas las dos opciones
		provincias.put(Integer.valueOf("05001"), "Ávila");
		provincias.put(37001, "Salamanca");
		provincias.put(47001, "Valladolid");
		provincias.put(40001, "Segovia");
		provincias.put(49001, "Zamora");
		provincias.put(42001, "Soria");
		
		provincias.put(10001, "Cáceres");
		provincias.put(6001, "Badajoz");
		
		provincias.put(45001, "Toledo");
		provincias.put(16001, "Cuenca");
		provincias.put(2001, "Albacete");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un código postal: ");
		int codPostal = sc.nextInt();
		sc.close();
		
		if(provincias.containsKey(codPostal)) {
			System.out.println("Provincia de: " + provincias.get(codPostal));
		} else {
			System.out.println("No existe esa provincia");
		}
		
		System.out.println("Borramos del mapa: Valladolid, Badajoz");
		provincias.remove(47001);
		provincias.remove(06001);
		
		System.out.println("\nListado completo 1: ");
		provincias.forEach((k, v) -> System.out.println("Clave: " + k + " - Valor: " + v));

		/*Iterator<Integer> clavesIterator = provincias.keySet().iterator();
		while(clavesIterator.hasNext()) {
			Integer codigo = clavesIterator.next();
			if(provincias.get(codigo).equalsIgnoreCase("Albacete")) {
				provincias.remove(codigo);
				break;
			}
		}*/
		
		for (Integer clave : provincias.keySet()) {
			if(provincias.get(clave).equalsIgnoreCase("Albacete")) {
				provincias.remove(clave);
				break;
			}
		}
		
		// Para imprimir:
		System.out.println("\nOtra forma de imprimir");
		Set<Integer> conjuntoClaves = provincias.keySet();
		for (Integer clave : conjuntoClaves) {
			System.out.println("Clave: " + clave + " - Valor: " + provincias.get(clave));
		}
		
		
		//System.out.println("\n\nListado completo 2: ");
		//provincias.forEach((k, v) -> System.out.println("Clave: " + k + " - Valor: " + v));
		
		System.out.println(provincias);
		
		
	}
}

package edu.alonso.daw.tema5.mapas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class InitMapa2 {

	public static void main(String[] args) {

		Map<Integer, Alumno> alumnos = new HashMap<>();

		rellenaAlumnos(alumnos);
		
		rellenaGustos(alumnos);
		
		muestraAlumnosClaveValor(alumnos);
		
		// Pide un alumno por expediente
		/*Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un número de expediente: ");
		int numExpediente = sc.nextInt();
		sc.close();*/
		
		/*if(alumnos.containsKey(numExpediente)) {
			Alumno al = alumnos.get(numExpediente);
			System.out.println("El alumno " + al.getNombre() + " " + al.getApellido1() +  " " + al.getApellido2());
			System.out.println("Tiene el DNI: " + al.getDni());
		} else {
			System.err.println("Ese alumno no existe");
		}*/
		
		
		// Borrado de alumnos por expediente
		/*if(alumnos.containsKey(numExpediente)) {
			alumnos.remove(numExpediente);
			System.out.println("Alumno eliminado correctamente!");
		} else {
			System.err.println("Ese alumno no existe");
		}
		
		System.out.println("Listado después del borrado: ");
		muestraAlumnosClaveValor(alumnos);*/
		
		System.out.println("Alumnos a los que le gustan el cine: " + cantidadAlumnoPorGusto2(alumnos, "Cine"));
		
		
		
	}

	private static int cantidadAlumnoPorGusto(Map<Integer, Alumno> alumnos, String gusto) {
		int cantidad = 0;
		
		for (Alumno al : alumnos.values()) {
			if(al.getGustos().contains(gusto.toLowerCase())) {
				cantidad++;
			}
		}
		
		return cantidad;
	}
	
	private static int cantidadAlumnoPorGusto2(Map<Integer, Alumno> alumnos, String gusto) {
		int cantidad = 0;
		
		for (Alumno al : alumnos.values()) {
			if(al.getGustos() != null && al.getGustos().stream().anyMatch(gusto::equalsIgnoreCase)) {
				cantidad++;
			}
		}
		
		return cantidad;
	}

	private static void rellenaAlumnos(Map<Integer, Alumno> alumnos) {
		alumnos.put(111, new Alumno("Fran", "Pérez", "Arribas", "70707070N", 33, "1DAW"));
		alumnos.put(112, new Alumno("Alexa", "Hernández", "Sánchez", "70707080P", 29, "1ASIR"));
		alumnos.put(113, new Alumno("Sergio", "López", "Gutierrez", "70707010N", 42, "1SMR"));
		alumnos.put(114, new Alumno("Manu", "González", "Gómez", "70707020N", 19, "1DAM"));
		alumnos.put(115, new Alumno("Miguel", "Sánchez", "Herráez", "70707030N", 50, "2DAW"));
	}
	
	private static void rellenaGustos(Map<Integer, Alumno> alumnos) {
		final String[] GUSTOS_GENERALES = {"futbol" , "cine", "cocina", "baile", "surf", "baloncesto", "beerpong"};
		
		Random r = new Random();		
		
		for (Alumno al : alumnos.values()) {
			List<String> gustos = new ArrayList<>();
			int numGustos = r.nextInt(GUSTOS_GENERALES.length) + 1;
			
			/*for (int i = 0; i < numGustos; i++) {
				String gustoConcreto = GUSTOS_GENERALES[r.nextInt(GUSTOS_GENERALES.length)];
				if(!gustos.contains(gustoConcreto)) {
					gustos.add(gustoConcreto);
				} else {
					i--;
				}
			}*/
			
			int i = 0;
			while(i < numGustos) {				
				String gustoConcreto = GUSTOS_GENERALES[r.nextInt(GUSTOS_GENERALES.length)];
				if(!gustos.contains(gustoConcreto)) {
					gustos.add(gustoConcreto);
					i++;
				}
			}
			
			al.setGustos(gustos);
		}
		
	}

	private static void muestraAlumnosClaveValor(Map<Integer, Alumno> alumnos) {
		alumnos.forEach((key, val) -> System.out.println(key + " - " + val));
	}
	
	private static void muestraAlumnosClaveValor2(Map<Integer, Alumno> alumnos) {
		
		for (Integer key : alumnos.keySet()) {
			System.out.println(key + " - " + alumnos.get(key));
		}
	}
	
	private static void muestraAlumnosValor(Map<Integer, Alumno> alumnos) {
		
		for (Alumno a : alumnos.values()) {
			System.out.println(a);
		}
	}

}

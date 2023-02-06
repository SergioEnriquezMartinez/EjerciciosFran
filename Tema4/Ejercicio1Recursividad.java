package edu.alonso.daw.tema4.recursividad;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		
		int limite = 10;
		
		for (int i = 0; i < limite; i++) {			
			System.out.println(fibonacci(i));
		}
	}
	
	public static int fibonacci(int n) {
		if(n == 0) { // Caso base: si posicion es 0
			return 0;
		} else if(n == 1) { // Caso base 2: si posicion es 1
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

}

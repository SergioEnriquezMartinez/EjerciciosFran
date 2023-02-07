package edu.alonso.daw.tema4.recursividad;

public class Ejercicio2 {

	public static void main(String[] args) {
		int num = 120;
		System.out.println("Factorial de " + num + "! es igual a: " + factorial(num));
	}

	public static int factorial(int n) {
		if (n == 0) { // Caso base: num es 0
			return 1;
		} else {
			return n * factorial(--n);
		}
	}

}

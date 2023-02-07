package edu.alonso.daw.tema4.recursividad;

public class Ejercicio4B {

	public static void main(String[] args) {
		int num = 90001;
		System.out.println("Resultado: " + sumaRecursiva(num));
	}

	public static int sumaRecursiva(int n) {
		if (n < 10) { // Caso base: un solo dígito
			System.out.println(n);
			return n;
		} else {
			int sum = sumaRecursiva(n/10);
			System.out.println(n%10);
			return n%10 + sum;
		}
	}

}

package edu.alonso.daw.tema4.recursividad;

import java.math.BigInteger;

public class Ejercicio2B {

	public static void main(String[] args) {
		BigInteger num = new BigInteger("50");
		System.out.println("Factorial de " + num + "! es igual a: " + factorial(num));
	}

	public static BigInteger factorial(BigInteger n) {
		if(n == null || n.signum() == -1) {
			return null;
		} else if (n.equals(BigInteger.ZERO)) { // Caso base: num es 0
			return BigInteger.ONE;
		} else {
			return n.multiply(factorial(n.subtract(BigInteger.ONE)));
		}
	}

}

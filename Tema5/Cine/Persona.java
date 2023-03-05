package com.venancio.dam.tema5.fran.ejercicios2.cine;

import java.util.Random;

public class Persona implements Comparable<Persona> {

	private int edad;
	
	
	public Persona() {
		Random rand = new Random();
		this.edad = rand.nextInt(73) + 7;
	}

	public Persona(int edad) {
		this.edad = edad;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public int compareTo(Persona otra) {
		return this.edad > otra.getEdad() ? 1 : this.edad < otra.getEdad() ? -1 : 0;
	}

	@Override
	public String toString() {
		return "Persona con edad: " + edad;
	}
}
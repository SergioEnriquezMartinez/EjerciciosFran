package edu.alonso.daw.tema67.programacionextrema;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Ramo extends Producto {
	
	public static final String ROSA = "Rosa";
	public static final String CLAVEL = "Clavel";
	public static final String TULIPAN = "Tulipan";
	public static final String ORQUIDEA = "Orquidea";
	public static final String LIRIO = "Lirio";
	
	private String[] floresPosibles = {"Rosa", "Clavel", "Tulipan", "Orquidea", "Lirio"};
	
	private int numFlores;
	private String[] flores;
	
	public Ramo(double precioUnitario, int numUnidades, double tamanio, double peso, String nombreArticulo, int numFlores) {
		super(precioUnitario, numUnidades, tamanio, peso, nombreArticulo);
		this.numFlores = numFlores;
		Random r = new Random();
		this.flores = new String[numFlores];
		
		for (int i = 0; i < flores.length; i++) {
			flores[i] = floresPosibles[r.nextInt(5)];
		}
		
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Arrays.hashCode(flores);
		result = prime * result + Objects.hash(numFlores);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ramo other = (Ramo) obj;
		return Arrays.equals(flores, other.flores) && numFlores == other.numFlores;
	}
	public int getNumFlores() {
		return numFlores;
	}


	public void setNumFlores(int numFlores) {
		this.numFlores = numFlores;
	}


	public String[] getFlores() {
		return flores;
	}


	public void setFlores(String[] flores) {
		this.flores = flores;
	}


	@Override
	public String toString() {
		return "Ramo [numFlores=" + numFlores + ", flores=" + Arrays.toString(flores) + "]";
	}
}


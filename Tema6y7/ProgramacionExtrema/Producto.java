package edu.alonso.daw.tema67.programacionextrema;

import java.util.Objects;

public class Producto {
	
	private double precioUnitario;
	private int numUnidades;
	private double tamanio;
	private double peso;
	private String nombreArticulo;
	
	public Producto(double precioUnitario, int numUnidades, double tamanio, double peso, String nombreArticulo) {
		this.precioUnitario = precioUnitario;
		this.numUnidades = numUnidades;
		this.tamanio = tamanio;
		this.peso = peso;
		this.nombreArticulo = nombreArticulo;
	}
	

	public double getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public int getNumUnidades() {
		return numUnidades;
	}
	public void setNumUnidades(int numUnidades) {
		this.numUnidades = numUnidades;
	}
	public double getTamanio() {
		return tamanio;
	}
	public void setTamanio(double tamanio) {
		this.tamanio = tamanio;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getNombreArticulo() {
		return nombreArticulo;
	}
	public void setNombreArticulo(String nombreArticulo) {
		this.nombreArticulo = nombreArticulo;
	}
	@Override
	public String toString() {
		return "Producto [precioUnitario=" + precioUnitario + ", numUnidades=" + numUnidades + ", tamanio=" + tamanio
				+ ", peso=" + peso + ", nombreArticulo=" + nombreArticulo + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(nombreArticulo, numUnidades, peso, precioUnitario, tamanio);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(nombreArticulo, other.nombreArticulo) && numUnidades == other.numUnidades
				&& Double.doubleToLongBits(peso) == Double.doubleToLongBits(other.peso)
				&& Double.doubleToLongBits(precioUnitario) == Double.doubleToLongBits(other.precioUnitario)
				&& Double.doubleToLongBits(tamanio) == Double.doubleToLongBits(other.tamanio);
	}

}

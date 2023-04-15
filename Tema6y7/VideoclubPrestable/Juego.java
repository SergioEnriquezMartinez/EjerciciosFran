package edu.alonso.daw.tema67.videoclubprestable;

import java.util.Objects;

public class Juego extends Producto {

	private final int HORAS_DEFECTO = 90;
	
	private int horasEstimadas;
	private String productora;
	
	public Juego() {
		super("", "");
		this.horasEstimadas = HORAS_DEFECTO;
		this.productora = "";
	}
	
	public Juego(String titulo, String genero, String productora) {
		super(titulo, genero);
		this.horasEstimadas = HORAS_DEFECTO;
		this.productora = productora;
	}
	
	public Juego(String titulo, String genero, int horasEstimadas, String productora) {
		super(titulo, genero);
		this.horasEstimadas = horasEstimadas;
		this.productora = productora;
	}
	
	public int getHorasEstimadas() {
		return horasEstimadas;
	}
	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}
	public String getProductora() {
		return productora;
	}
	public void setProductora(String productora) {
		this.productora = productora;
	}
	@Override
	public String toString() {
		return "Juego [horasEstimadas=" + horasEstimadas + ", productora=" + productora + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(horasEstimadas, productora);
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
		Juego other = (Juego) obj;
		return horasEstimadas == other.horasEstimadas && Objects.equals(productora, other.productora);
	}

	@Override
	public int compareTo(Producto o) {
		int comparacion = MENOR;
		
		Juego otro = (Juego)o;
		
		if(this.horasEstimadas > otro.getHorasEstimadas()) {
			comparacion = MAYOR;
		} else if(this.horasEstimadas == otro.getHorasEstimadas()) {
			comparacion = IGUAL;
		}
		
		return comparacion;
	}
	
}

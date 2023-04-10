package edu.alonso.daw.tema67.programacionextrema;

import java.util.Objects;

public class Planta extends Producto{
	
	public static final String INVIERNO = "Invierno";
	public static final String OTONIO = "Otoño";
	public static final String PRIMAVERA = "Primavera";
	public static final String VERANO = "Verano";
	public static final String NAVIDAD = "Navidad";
	
	private boolean interior;
	private String temporada;
	

	public Planta(double precioUnitario, int numUnidades, double tamanio, double peso, String nombreArticulo, boolean interior, String temporada) {
		super(precioUnitario, numUnidades, tamanio, peso, nombreArticulo);
		this.interior = interior;
		this.temporada = temporada;
		
	}
	public boolean isInterior() {
		return interior;
	}
	public void setInterior(boolean interior) {
		this.interior = interior;
	}
	public String getTemporada() {
		return temporada;
	}
	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}
	@Override
	public String toString() {
		return "Planta [interior=" + interior + ", temporada=" + temporada + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(interior, temporada);
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
		Planta other = (Planta) obj;
		return interior == other.interior && Objects.equals(temporada, other.temporada);
	}

	
}

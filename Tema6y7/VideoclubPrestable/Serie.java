package edu.alonso.daw.tema67.videoclubprestable;

import java.util.Objects;

public class Serie extends Producto {
	
	private final int NUM_TEMPORADAS_DEFECTO = 2;
	
	private int numTemporadas;
	private String director;
	
	public Serie() {
		super("", "");
		this.numTemporadas = NUM_TEMPORADAS_DEFECTO;
		this.director = "";
	}
	
	public Serie(String titulo, String genero, String director) {
		super(titulo, genero);
		this.numTemporadas = NUM_TEMPORADAS_DEFECTO;
		this.director = director;
	}
	
	public Serie(String titulo, String genero, int numTemporadas, String director) {
		super(titulo, genero);
		this.numTemporadas = numTemporadas;
		this.director = director;
	}
	public int getNumTemporadas() {
		return numTemporadas;
	}
	public void setNumTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	@Override
	public String toString() {
		return "Serie numTemporadas=" + numTemporadas + ", director=" + director + super.toString();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(director, numTemporadas);
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
		Serie other = (Serie) obj;
		return Objects.equals(director, other.director) && numTemporadas == other.numTemporadas;
	}
	
	@Override
	public int compareTo(Producto o) {
		int comparacion = MENOR;
		
		Serie otro = (Serie)o;
		
		if(this.numTemporadas > otro.getNumTemporadas()) {
			comparacion = MAYOR;
		} else if(this.numTemporadas == otro.getNumTemporadas()) {
			comparacion = IGUAL;
		}
		
		return comparacion;
	}
	
}

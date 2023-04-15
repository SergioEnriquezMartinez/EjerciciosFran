package edu.alonso.daw.tema67.videoclubprestable;

import java.util.Objects;

public abstract class Producto implements Prestable {
	
	private final boolean ENTREGADO_DEFECTO = false;
	
	protected final int MAYOR = 1;
	protected final int MENOR = -1;
	protected final int IGUAL = 0;
	
	private String titulo;
	private String genero;
	private boolean entregado;
	
	public Producto(String titulo, String genero) {
		this.titulo = titulo;
		this.genero = genero;
		this.entregado = ENTREGADO_DEFECTO;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public boolean isEntregado() {
		return entregado;
	}
	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}
	@Override
	public String toString() {
		return " titulo=" + titulo + ", genero=" + genero + ", entregado=" + entregado;
	}
	@Override
	public int hashCode() {
		return Objects.hash(entregado, genero, titulo);
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
		return entregado == other.entregado && Objects.equals(genero, other.genero)
				&& Objects.equals(titulo, other.titulo);
	}

	@Override
	public void entregar() {
		setEntregado(true);
		
	}

	@Override
	public void devolver() {
		setEntregado(false);
		
	}	


}

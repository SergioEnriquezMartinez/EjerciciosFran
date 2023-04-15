package edu.alonso.daw.tema67.videoclubprestable;

public interface Prestable extends Comparable<Producto>{
	
	public void entregar();
	public void devolver();
	public boolean isEntregado();

}

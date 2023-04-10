package edu.alonso.daw.tema67.programacionextrema;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pedido {
	
	private int numReferencia;
	private String nombreCompletoPersona;
	private LocalDateTime fecha;
	private String direccion;
	
	private List<Producto> productos;
	
	public Pedido(int numReferencia, String nombreCompletoPersona, String direccion) {
		this.numReferencia = numReferencia;
		this.nombreCompletoPersona = nombreCompletoPersona;
		this.fecha = LocalDateTime.now();
		this.direccion = direccion;
		this.productos = new ArrayList<>();
	}
	
	
	public void add(Producto p) {
		this.productos.add(p);
	}
	
	public boolean remove(String nombreProducto) {
		for (Producto p : productos) {
			if(p.getNombreArticulo().equalsIgnoreCase(nombreProducto)) {
				productos.remove(p);
				return true;
			}
		}
		return false;
	}
	
	public double calculaCosteTotal() {
		double coste = 0;
		
		for (Producto p : productos) {
			double precioRamo = p.getPrecioUnitario() * p.getNumUnidades();
			if(p instanceof Ramo) {
				if(((Ramo)p).getNumFlores() >= 5 && ((Ramo)p).getNumFlores() <= 10) {
					precioRamo *= 1.1;
				} else if(((Ramo)p).getNumFlores() > 10) {
					precioRamo *= 1.25;
				}
			}
			coste += precioRamo;
		}
		
		return coste;
	}
	



	public int getNumReferencia() {
		return numReferencia;
	}


	public void setNumReferencia(int numReferencia) {
		this.numReferencia = numReferencia;
	}


	public String getNombreCompletoPersona() {
		return nombreCompletoPersona;
	}


	public void setNombreCompletoPersona(String nombreCompletoPersona) {
		this.nombreCompletoPersona = nombreCompletoPersona;
	}


	public LocalDateTime getFecha() {
		return fecha;
	}


	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public List<Producto> getProductos() {
		return productos;
	}


	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}


	@Override
	public String toString() {
		return "Pedido [numReferencia=" + numReferencia + ", nombreCompletoPersona=" + nombreCompletoPersona
				+ ", fecha=" + fecha + ", direccion=" + direccion + ", productos=" + productos + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(direccion, fecha, nombreCompletoPersona, numReferencia, productos);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		return Objects.equals(direccion, other.direccion) && Objects.equals(fecha, other.fecha)
				&& Objects.equals(nombreCompletoPersona, other.nombreCompletoPersona)
				&& numReferencia == other.numReferencia && Objects.equals(productos, other.productos);
	}

	

}
 
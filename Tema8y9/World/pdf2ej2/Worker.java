package pdf2ej2;

import java.util.Objects;

public class Worker {
	private String nombre;
	private int peonadas;

	public Worker(String nombre) {
		this.nombre = nombre;
		peonadas = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPeonadas() {
		return peonadas;
	}

	public void setPeonadas() {
		this.peonadas++;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre, peonadas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Worker other = (Worker) obj;
		return Objects.equals(nombre, other.nombre) && peonadas == other.peonadas;
	}

	@Override
	public String toString() {
		return nombre + " " + peonadas;
	}

}

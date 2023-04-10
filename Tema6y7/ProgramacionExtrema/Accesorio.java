package edu.alonso.daw.tema67.programacionextrema;

import java.util.Objects;

public class Accesorio extends Producto {
	
	private boolean pilas;
	private int itemsPack;

	public Accesorio(double precioUnitario, int numUnidades, double tamanio, double peso, String nombreArticulo, boolean pilas, int itemsPack) {
		super(precioUnitario, numUnidades, tamanio, peso, nombreArticulo);
		this.pilas = pilas;
		this.itemsPack = itemsPack;
	}
	
	public boolean isPilas() {
		return pilas;
	}

	public void setPilas(boolean pilas) {
		this.pilas = pilas;
	}

	public int getItemsPack() {
		return itemsPack;
	}

	public void setItemsPack(int itemsPack) {
		this.itemsPack = itemsPack;
	}

	@Override
	public String toString() {
		return "Accesorio [pilas=" + pilas + ", itemsPack=" + itemsPack + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(itemsPack, pilas);
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
		Accesorio other = (Accesorio) obj;
		return itemsPack == other.itemsPack && pilas == other.pilas;
	}


	
	
	

}

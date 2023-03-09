package edu.alonso.daw.tema67.figuras;

public abstract class Figura {
	
	private String color;
	
	public Figura(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "color=" + color;
	}
	
	
	public abstract double getPerimetro();
	
	public abstract double getArea();
	

}

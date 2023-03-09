package edu.alonso.daw.tema67.figuras;

public class Cuadrado extends Figura {

	private int lado;

	public Cuadrado(String color, int lado) {
		super(color);
		this.lado = lado;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "Cuadrado -> lado=" + lado + ", " + super.toString();
	}

	@Override
	public double getPerimetro() {
		return lado * 4;
	}

	@Override
	public double getArea() {
		return lado * lado;
	}
	
	public void imprimir() {
		for (int i = 0; i < lado; i++) {
			for (int j = 0; j < lado; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

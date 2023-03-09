package edu.alonso.daw.tema67.figuras;

public class Circulo extends Figura {
	
	private double radio;
	
	public Circulo(String color, double radio) {
		super(color);
		this.radio = radio;
	}

	@Override
	public double getArea() {
		return Math.PI * Math.pow(radio, 2);
	}

	@Override
	public double getPerimetro() {
		return 2 * Math.PI * radio;
	}
	
	@Override
	public String toString() {
		return "Circulo -> radio=" + radio + ", " + super.toString();
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}



}

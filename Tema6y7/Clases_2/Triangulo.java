package edu.alonso.daw.tema67.figuras;

public class Triangulo extends Figura {
	
	private double base;
	private double altura;
	
	public Triangulo(String color, double base, double altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	@Override
	public String toString() {
		return "Triangulo -> base=" + base + ", altura=" + altura + ", " + super.toString();
	}
	
	@Override
	public double getPerimetro() {
		// Suponemos que es un triángulo rectángulo
		double hipotenusa = Math.sqrt(Math.pow(altura, 2) + Math.pow(base, 2));
		return altura + base + hipotenusa;
	}
	@Override
	public double getArea() {
		return (base * altura)/2;
	}

	
	
	


}

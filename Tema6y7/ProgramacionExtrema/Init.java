package edu.alonso.daw.tema67.programacionextrema;

public class Init {
	
	public static void main(String[] args) {
		
		Pedido p = new Pedido(1, "Fran Pérez", "C/Primera, nº1");
		p.add(new Ramo(60.0, 1, 0.50, 1.5, "Ramo algo", 12));
		p.add(new Planta(10.0, 1, 0.50, 1.5, "Planta de pascua", true, Planta.INVIERNO));
		
		Historico cajon = new Historico();
		cajon.addPedido(p);
		
		System.out.println("Precio pedido: " + p.calculaCosteTotal());
		
		cajon.mostrarPedidos();
		
	}

}

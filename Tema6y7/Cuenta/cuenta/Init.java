package edu.alonso.daw.tema8.ejercicios1.cuenta;

public class Init {
	
	public static void main(String[] args) {
		Cliente cli = new Cliente("Fran", "70707070N");
		
		CuentaCorriente cc = new CuentaCorriente("ES91 9078 0987 28 1234123409", cli);
				
		// Hacemos un ingreso
		cc.ingreso(100);
		
		System.out.println(cc);
		try {
			cc.reintegro(120);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}
		
		System.out.println(cc);
		System.out.println(cc);
		System.out.println(cc);
		
	}

}

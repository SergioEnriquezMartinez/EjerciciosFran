package edu.alonso.daw.tema67.programacionextrema;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;

public class Historico {

	private Map<Integer, Pedido> pedidos;
	
	public Historico() {
		this.pedidos = new HashMap<>();
	}

	public void addPedido(Pedido p) {
		this.pedidos.put(p.getNumReferencia(), p);
	}

	public Pedido getPedido(int numReferencia) {
		return this.pedidos.get(numReferencia);
	}

	public void mostrarPedidos() {
		this.pedidos.forEach((k, v) -> System.out.println(k + " - " + v));
	}

	public void mostrarPedidos(int mes, int anio) {
		for (Pedido p : this.pedidos.values()) {
			if (p.getFecha().isAfter(LocalDateTime.of(anio, mes, 0, 0, 0))
					&& p.getFecha().isBefore(LocalDateTime.of(anio, mes, getDiasMes(mes, anio), 0, 0))) {
				System.out.println(p);
			}
		}
	}
	
	public void mostrarPedidos(LocalDate inicio, LocalDate fin) {
		for (Pedido p : this.pedidos.values()) {
			if (p.getFecha().isAfter(inicio.atStartOfDay())
					&& p.getFecha().isBefore(fin.atStartOfDay())) {
				System.out.println(p);
			}
		}
	}

	private int getDiasMes(int mes, int year) {

		switch (mes) {

		case 2:
			return LocalDate.of(year, Month.FEBRUARY, 1).getDayOfMonth();
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;

		default:
			return 31;
		}
	}

}

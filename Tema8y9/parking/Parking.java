package edu.alonso.daw.tema8.ejercicios1.parking;

import java.util.ArrayList;
import java.util.List;

public class Parking {
	
	private int capacidad;
	private List<Ticket> tickets;
	
	public Parking(int capacidad) {
		this.capacidad = capacidad;
		this.tickets= new ArrayList<>();
	}
	
	public void add(Ticket t) throws TicketException {
		if(tickets.size() >= capacidad) {
			throw new TicketException("Lo siento, el parking está lleno");
		}
		
		if(t.getMatricula() != null) {
			if(getTicket(t.getMatricula()) != null) {
				throw new TicketException("El conche con la matricula indicada, ya está dentro del parking");
			} else {
				// Guardo el ticket
				tickets.add(t);				
			}
		} else {
			throw new TicketException("Matrícula no reconocida");
		}
	}
	
	private Ticket getTicket(String matricula) {
		if(matricula != null) {
			for (Ticket ticket : tickets) {
				if(ticket.getMatricula().equalsIgnoreCase(matricula)) {
					return ticket;
				}
			}
		}
		return null;
	}
	
	public Ticket remove(String matricula) throws TicketException {
		Ticket t = getTicket(matricula);
		
		if(t != null) {
			if(!t.isPagado()) {
				throw new TicketException("Abone el dinero antes de retirar el coche, por favor.");
			} else {
				tickets.remove(t);
			}
		} else {
			throw new TicketException("Matrícula no encontrada");
		}
		
		return t;
	}
	
	public int getPlazasLibres() {
		return capacidad - tickets.size();
	}

}

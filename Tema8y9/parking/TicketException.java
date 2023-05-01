package edu.alonso.daw.tema8.ejercicios1.parking;

public class TicketException extends Exception {
	
	private static final long serialVersionUID = 1456516000253034251L;

	public TicketException() {
		super();
	}

	public TicketException(String msg) {
		super(msg);
	}

	public TicketException(String msg, Throwable e) {
		super(msg, e);
	}

}

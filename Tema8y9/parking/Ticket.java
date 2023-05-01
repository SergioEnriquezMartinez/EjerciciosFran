package edu.alonso.daw.tema8.ejercicios1.parking;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Objects;

public class Ticket {
	
	private final double PRECIO_MINUTO = 0.03;
	private final double PRECIO_HORA = 1.7;
	private final double PRECIO_DIA = 17.0;
	
	private String matricula;
	private LocalDateTime hora;
	private boolean pagado;
	
	public Ticket(String matricula) {
		this.matricula = matricula;
		this.hora = LocalDateTime.now();
		this.pagado = false;
	}
	
	public double getPrecio() throws TicketException {
		
		Duration dur = Duration.between(this.hora, LocalDateTime.now());
		//Duration dur = Duration.between(this.hora.minusDays(2), LocalDateTime.now());
		
		if(dur.isNegative()) {
			throw new TicketException("La hora del ticket no es correcta");
		}
		
		double precio = 0.0;
		
		// Versión clásica
		/*long diferencia = dur.toSeconds();
		
		precio += diferencia / 86400 * PRECIO_DIA;
		diferencia %= 86400;
		
		precio += diferencia / 3600 * PRECIO_HORA;
		diferencia %= 3600;
		
		precio += diferencia / 60 * PRECIO_MINUTO;*/
		
		// Versión guay
		precio += dur.toDaysPart() * PRECIO_DIA;
		precio += dur.toHoursPart() * PRECIO_HORA;
		precio += dur.toMinutesPart() * PRECIO_MINUTO;
		
		return precio;
	}
	
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public LocalDateTime getHora() {
		return hora;
	}
	public void setHora(LocalDateTime hora) {
		this.hora = hora;
	}
	public boolean isPagado() {
		return pagado;
	}
	public void setPagado(boolean pagado) {
		this.pagado = pagado;
	}
	@Override
	public String toString() {
		return "Ticket [matricula=" + matricula + ", hora=" + hora + ", pagado=" + pagado + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(hora, matricula, pagado);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ticket other = (Ticket) obj;
		return Objects.equals(hora, other.hora) && Objects.equals(matricula, other.matricula) && pagado == other.pagado;
	}

}

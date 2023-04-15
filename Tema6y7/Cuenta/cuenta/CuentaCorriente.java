package edu.alonso.daw.tema8.ejercicios1.cuenta;

import java.util.Objects;

public class CuentaCorriente {
	
	private String iban;
	private Cliente titular;
	private double saldo;
	
	public CuentaCorriente(String iban, Cliente titular) {
		this.iban = iban;
		this.titular = titular;
	}
	
	public CuentaCorriente(String iban, Cliente titular, double saldo) {
		this.iban = iban;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	
	public void ingreso(double cantidad) {
		this.saldo += cantidad;
	}
	
	public void reintegro(double cantidad) throws SaldoInsuficienteException {
		
		if(this.saldo >= cantidad) {
			this.saldo -= cantidad;
		} else {
			throw new SaldoInsuficienteException("No puedes sacar más dinero del que tienes");
		}
	}
	
	
	public String getIban() {
		return iban;
	}
	public void setIban(String iban) {
		this.iban = iban;
	}
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "CuentaCorriente [iban=" + iban + ", titular=" + titular + ", saldo=" + saldo + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(iban, saldo, titular);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CuentaCorriente other = (CuentaCorriente) obj;
		return Objects.equals(iban, other.iban)
				&& Double.doubleToLongBits(saldo) == Double.doubleToLongBits(other.saldo)
				&& Objects.equals(titular, other.titular);
	}
}

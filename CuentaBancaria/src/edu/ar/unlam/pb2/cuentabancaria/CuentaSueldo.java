package edu.ar.unlam.pb2.cuentabancaria;

public class CuentaSueldo extends CuentaBancaria {

	private Double saldo = 0.0;

	public void depositar(Double saldo) {
		this.saldo += saldo;
	}

	public Double getSaldo() {
		return this.saldo;
	}

	public void extraer(Double dineroAExtraer) {
		if(this.puedeExtraer(dineroAExtraer)){
			this.saldo -= dineroAExtraer; 
		} 
	}

	private Boolean puedeExtraer(Double saldoAExtraer) {
		if(saldoAExtraer <= this.saldo){
			return Boolean.TRUE;
		} else {
			return Boolean.FALSE;
		}
		
	}

}

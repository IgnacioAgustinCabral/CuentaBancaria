package edu.ar.unlam.pb2.cuentabancaria;

public class CajaAhorro {
	private Double saldo = 0.0;

	public void depositar (Double saldo) {
		this.saldo += saldo;
	}
	public Double getSaldo() {
		// TODO Auto-generated method stub
		return this.saldo;
	}

	public void extraer(Double extraccion) {
		if(this.puedoExtraer(extraccion)) {
			this.saldo -= extraccion;
		} else {
			return Boolean.FALSE;
		}
		
		
	}
	private Boolean puedoExtraer(Double extraccion) {
		if(extraccion <= this.saldo) {
			return Boolean.TRUE;
		} else {
			return Boolean.FALSE;
		}
	}
}

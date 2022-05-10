package edu.ar.unlam.pb2.cuentabancaria;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CajaAhorroTest {

	private static final Double SALDO = 3500.00;
	private static final Double SALDO_RESTANTE = 1960.77;
	@Test
	public void creoUnaCuentaAhorroDeposito3500_00YVerificoSaldo() {
		CajaAhorro cuenta = new CajaAhorro();
		cuenta.depositar(3500.00);
		entoncesElSaldoEsDe3500_00(cuenta);
	}

	private void entoncesElSaldoEsDe3500_00(CajaAhorro cuenta) {
		Assert.assertEquals(SALDO, cuenta.getSaldo());
	}
	
	@Test
	public void extraigo1539_23DeLaCajaAhorro(){
		CajaAhorro cuenta = new CajaAhorro();
		cuenta.depositar(3500.00);
		cuenta.extraer(1539.23);
		entoncesElSaldoRestanteDeLaCuentaEs1460_77(cuenta);
	}

	private void entoncesElSaldoRestanteDeLaCuentaEs1460_77(CajaAhorro cuenta) {
		Assert.assertEquals(SALDO_RESTANTE, cuenta.getSaldo(),0.01);
	}
	
	@Test
	public void intentoExtraerMasDineroDelQueTengo() {
		CajaAhorro cuenta = new CajaAhorro();
		cuenta.depositar(2300.34);
		entoncesNoPuedoExtraerMasDineroDelQueTengo(cuenta);
	}
	
	
	
	
	
}

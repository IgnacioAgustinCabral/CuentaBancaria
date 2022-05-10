package edu.ar.unlam.pb2.cuentabancaria;

import org.junit.Assert;
import org.junit.Test;

public class CuentaSueldoTest {

	private static final Double SALDO = 4000.00;
	private static final Double SALDO_DESPUES_DE_EXTRACCION = 499.57;
	private static final Double SALDO_A_EXTRAER = 4500.13;
	
//////////////////////////TEST 1//////////////////////////////////////////
	@Test
	public void seCreaUnaCuentaYSePuedeDepositar4000Pesos() {
		CuentaSueldo cuenta = creoUnaCuenta();
		cuenta.depositar(4000.00);
		entoncesElSaldoDeLaCuentaEs4000(cuenta);
	}

//////////////////////////METODOS TEST 1//////////////////////////////////////////
	private void entoncesElSaldoDeLaCuentaEs4000(CuentaSueldo cuenta) {
		Assert.assertEquals(SALDO, cuenta.getSaldo());
	}

	private CuentaSueldo creoUnaCuenta() {
		return new CuentaSueldo();
	}
//////////////////////////METODOS TEST 1//////////////////////////////////////////
	
//////////////////////////TEST 2//////////////////////////////////////////
	@Test
	public void extraigo3500_43PesosDeMiCuentaSueldoYElSaldoRestanteEs499_57(){
	CuentaSueldo cuenta = creoUnaCuenta();
	cuenta.depositar(4000.00);
	cuenta.extraer(3500.43);
	entoncesMiSaldoRestanteEsDe499_57(cuenta);
	}

//////////////////////////METODOS TEST 2//////////////////////////////////////////

	private void entoncesMiSaldoRestanteEsDe499_57(CuentaSueldo cuenta) {
		Assert.assertEquals(SALDO_DESPUES_DE_EXTRACCION, cuenta.getSaldo(),0.01); //el 0.01 recorta la precision.
	}
	
//////////////////////////METODOS TEST 2//////////////////////////////////////////

//////////////////////////TEST 3//////////////////////////////////////////
	@Test
	public void extraigoMasSaldoDelQueTengoEnMiCuenta(){
		CuentaSueldo cuenta = creoUnaCuenta();
		cuenta.depositar(4000.00);
		entoncesNoDeberiaDejarmeExtraerMasDineroDelSaldoQueTengo(cuenta);
	}

//////////////////////////METODOS TEST 3//////////////////////////////////////////
	private void entoncesNoDeberiaDejarmeExtraerMasDineroDelSaldoQueTengo(CuentaSueldo cuenta) {
		Assert.assertFalse(cuenta.puedeExtraer(SALDO_A_EXTRAER));
	}
//////////////////////////METODOS TEST 3//////////////////////////////////////////
}

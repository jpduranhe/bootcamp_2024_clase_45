package waller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import wallet.Cuenta;

class CuentaTest {

	@Test
	void testGetSaldo() {
		Cuenta cuenta= new Cuenta(5000);
		assertEquals(5000,cuenta.getSaldo(),0.1);
	}
	
	@Test
	void testDepositar(){
		Cuenta cuenta= new Cuenta(0);
		boolean resultado= cuenta.depositar(100);
		assertTrue(resultado);		
		
	}
	@Test
	void testDepositarModifiqueELsalfo(){
		Cuenta cuenta= new Cuenta(0);
		 cuenta.depositar(100);		 
		 assertEquals(100, cuenta.getSaldo(),0.1);
		
	}
	@Test
	void testRetiro(){
		Cuenta cuenta= new Cuenta(200);
		boolean resultado= cuenta.retirar(100);
		assertTrue(resultado);
		
	}
	@Test
	void testRetiroMasDelSaldo(){
		Cuenta cuenta= new Cuenta(200);
		boolean resultado= cuenta.retirar(300);
		assertFalse(resultado);
		
	}
	@Test
	void testRetiroModificaElSaldo(){
		Cuenta cuenta= new Cuenta(200);
		cuenta.retirar(100);
		assertEquals(100, cuenta.getSaldo(),0.1);
		
	}

}

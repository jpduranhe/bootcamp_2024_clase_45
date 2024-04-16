package clase_45;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidarCodigoTest {

	@Test
	void testCuandoCodigoEsValido() {
		ValidarCodigo validaCodigo= new ValidarCodigo();
		
		boolean resultadoValidacion= validaCodigo.validar("000");
		
		assertEquals(true,resultadoValidacion);
	}

	@Test
	void testCuandoCodigoEsInvalido() {
		ValidarCodigo validaCodigo= new ValidarCodigo();
		
		boolean resultadoValidacion= validaCodigo.validar("00");
		
		assertEquals(false,resultadoValidacion);
	}
}

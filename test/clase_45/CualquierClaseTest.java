package clase_45;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CualquierClaseTest {

	@Test
	void test() {
		CualquierClase objCualquierClase= new CualquierClase();
		
		String resultod=objCualquierClase.cualquierMetodo();
		
		assertEquals("cualquier resultado esperado",resultod);
	}

}

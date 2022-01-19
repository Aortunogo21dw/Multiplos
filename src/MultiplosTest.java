package JUNIT_3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class MultiplosTest {

	@Test
	void testLeerN() {
		int resultado = Multiplos.leerN();
		assertEquals(resultado, 10);
	}

	@Test
	void testLeerM() {
		int resultado = Multiplos.leerM(2);
		assertEquals(resultado, 11);
	}

	@Test
	void testSiguienteMultiplo() {
		int resultado = Multiplos.siguienteMultiplo(5, 20);
		assertEquals(resultado, 25);
	}

}

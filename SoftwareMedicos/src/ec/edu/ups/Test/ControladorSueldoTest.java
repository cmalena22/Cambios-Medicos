package ec.edu.ups.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ec.edu.ups.Controlador.ControladorSueldo;

class ControladorSueldoTest {
	private ControladorSueldo controladorSueldo;

	@BeforeEach
	void setUp() throws Exception {
		controladorSueldo = new ControladorSueldo();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testDescontarDeCaja() {
		double cantidad= 7433.54;
		double resultadoEsperado = 938348.09;
		double resultadoObtenido = controladorSueldo.descontarDeCaja(cantidad);
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}

}

package ec.edu.ups.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ec.edu.ups.Controlador.ControladorComprobanteDeVenta;
import ec.edu.ups.Modelo.ComprobanteDeVenta;

class ControladorComprobanteDeVentaTest {
	private ComprobanteDeVenta comprobanteDeVenta;
	private ControladorComprobanteDeVenta controladorcv;

	@BeforeEach
	void setUp() throws Exception {
		this.comprobanteDeVenta = new ComprobanteDeVenta("factura", "20/12/2020", 1);
		controladorcv = new ControladorComprobanteDeVenta();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGuardar() {
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = controladorcv.guardar(comprobanteDeVenta);
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}

}

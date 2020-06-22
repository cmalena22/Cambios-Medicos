package ec.edu.ups.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ec.edu.ups.Controlador.ControloadorListaComprobantes;
import ec.edu.ups.Modelo.ComprobanteDeVenta;

public class ControladorListComporbantesTest {
	
	private List<ComprobanteDeVenta> listaComrpobanteDeVenta;
	private ControloadorListaComprobantes controladorListaComprobantes;
	@BeforeEach
	void setUp() throws Exception {
		this.listaComrpobanteDeVenta = new ArrayList<ComprobanteDeVenta>();
		controladorListaComprobantes = new ControloadorListaComprobantes();
	}
	
	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void testImprimirComprobantes() {
		ComprobanteDeVenta compVenta = new ComprobanteDeVenta("tipo","12/06/2020", 4);
		listaComrpobanteDeVenta.add(compVenta);
		List<ComprobanteDeVenta> resultadoEsperado = listaComrpobanteDeVenta;
		List<ComprobanteDeVenta> resultadoObtenido = controladorListaComprobantes.imprimirComprobantes(compVenta);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
}

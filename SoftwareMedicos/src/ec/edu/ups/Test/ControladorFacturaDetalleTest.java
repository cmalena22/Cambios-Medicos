package ec.edu.ups.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ec.edu.ups.Controlador.ControladorFactutaDetalle;
import ec.edu.ups.Modelo.Medicina;



public class ControladorFacturaDetalleTest {
	
	private ControladorFactutaDetalle controladorFacturaDetalle;
	private Medicina medicina;
	
	@BeforeEach
	void setUp() throws Exception {
		controladorFacturaDetalle = new ControladorFactutaDetalle();
		medicina = new Medicina();
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void testCalcularTotalPagarEnMedicina() {
		boolean resultadoEsperado = false;
		double precio = 18.25;
		medicina.setIdMedicina("0");
		medicina.setNombre("paracetamol");
		medicina.setAgentePrincipal("moleculas");
		boolean resultadoObtenido = controladorFacturaDetalle.calcularTotalPagarEnMedicina(medicina, precio);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testVerificarIVA() {
		boolean resultadoEsperado = false;
		double iva = 0.15;
		boolean resultadoObtenido = controladorFacturaDetalle.verificarIVA(iva);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testConsultarMetodoPago() {
		boolean resultadoEsperado = false;
		boolean resultadoObtenido = controladorFacturaDetalle.consultarMetodoPago("Contado");
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	
	
	

}

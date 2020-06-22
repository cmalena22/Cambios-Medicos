package ec.edu.ups.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ec.edu.ups.Controlador.ControladorMedicina;
import ec.edu.ups.Modelo.Medicina;



public class ControladorMedicinaTest {
	
	private ControladorMedicina controladorMedicina;
	private Medicina medicina;
	
	@BeforeEach
	void setUp() throws Exception {
		controladorMedicina = new ControladorMedicina();
		medicina = new Medicina();
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void testConsultarDisponibilidad() {
		boolean resultadoEsperado = false;
		int id = 100;
		boolean resultadoObtenido = controladorMedicina.consultarDisponibilidad(id);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void ConsultarTotalEnMedicinas() {
		boolean resultadoEsperado = false;
		double precio = 15.20;
		medicina.setIdMedicina("0");
		medicina.setNombre("ritalin");
		boolean resultadoObtenido = controladorMedicina.CalcularTotalEnMedicinas(medicina,precio);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}


}

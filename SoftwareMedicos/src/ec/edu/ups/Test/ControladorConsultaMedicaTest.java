package ec.edu.ups.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ec.edu.ups.Controlador.ControladorConsultaMedica;
import ec.edu.ups.Modelo.Factura;
import ec.edu.ups.Modelo.Paciente;

public class ControladorConsultaMedicaTest {
	
	private ControladorConsultaMedica controladorConsultaMedica;
	private Paciente paciente;
	private Factura factura;
	
	@BeforeEach
	void setUp() throws Exception {
		controladorConsultaMedica = new ControladorConsultaMedica();
		paciente = new Paciente();
		factura = new Factura();
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void testNotificarMedico() {
		boolean resultadoEsperado = false;
		boolean resultadoObtenido = controladorConsultaMedica.notificarMedico();
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testNotificarPaciente() {
		boolean resultadoEsperado = true;
		paciente.setNombre("Andres");
		paciente.setApellido("Guevara");
		paciente.setCedula("01066917354");
		paciente.setEdad(35);
		boolean resultadoObtenido = controladorConsultaMedica.notificarPaciente(paciente);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testSolicitarDatosExtras() {
		boolean resultadoEsperado = false;
		String descripcion = "dolores estomacales en la noche";
		boolean resultadoObtenido = controladorConsultaMedica.solicitarDatosExtas(descripcion);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testRegistrarAusenciaPaciente() {
		boolean resultadoEsperado = false;
		boolean resultadoObtenido = controladorConsultaMedica.registrarAusenciaPaciente();
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testGenerarFactura() {
		boolean resultadoEsperado = false;
		factura.setIdFactura("0");
		factura.setFechaFactura("13/01/2020");
		boolean resultadoObtenido = controladorConsultaMedica.generarFactura(factura,paciente);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testAgendarRevision() {
		boolean resultadoEsperado = false;
		boolean resultadoObtenido = controladorConsultaMedica.agendarRevision();
		assertEquals(resultadoEsperado, resultadoObtenido);
	}

}

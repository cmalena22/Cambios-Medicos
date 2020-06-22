package ec.edu.ups.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ec.edu.ups.Controlador.ControladorPaciente;
import ec.edu.ups.Modelo.Paciente;

public class ControladorPacienteTest {
	
	private Paciente paciente= new Paciente();
	
	private ControladorPaciente controladorPaciente;
	@BeforeEach
	void setUp() throws Exception {
		controladorPaciente = new ControladorPaciente();
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void testValidarCedula() {
		boolean resultadoEsperado = false;
		String cedula = "1400919302";
		boolean resultadoObtenido = controladorPaciente.validarCedula(cedula);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testObtenerHistoriaclinica() {
		boolean resultadoEsperado= false;
		boolean resultadoObtenido = controladorPaciente.obtenerHistorialMedico("140555820");
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testAgendarcita() {
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = controladorPaciente.agendarCita();
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testAgregarPaciente() {
		boolean resultadoEsperado = false;
		boolean resultadoObtenido = controladorPaciente.agregarPaciente("alex", "reinoso", 22, "masculino", "09985522", "101101555", "prueba123@gmail.com", "123");
		assertEquals(resultadoEsperado, resultadoObtenido);
	}

}

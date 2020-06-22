package ec.edu.ups.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ec.edu.ups.Controlador.ControladorFactura;
import ec.edu.ups.Modelo.Factura;

public class ControladorFacturaTest {
	
	private ControladorFactura controladorFactura;
	private Factura factura;
	
	@BeforeEach
	void setUp() throws Exception {
		controladorFactura = new ControladorFactura();
		factura = new Factura("0", "12/03/1996");
	}
	

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void testEnviarFacturaEmail() {
		boolean resultadoEsperado = false;
		boolean resultadoObtenido = controladorFactura.enviarFacturaEmail(factura);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testRegistrarPaciente() {
		boolean resultadoEsperado = false;
		String idPaciente = "25552255555";
		String correo = "paciente@gmail.com";
		String contrasenia = "1213";
		boolean resultadoObtenido = controladorFactura.registrarPaciente(idPaciente,correo,contrasenia);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testRegistrarFacturaMedico() {
		boolean resultadoEsperado = false;
		String idMedico = "140502555202";
		boolean resultadoObtenido = controladorFactura.registrarFacturaMedico(idMedico);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testConsultarDatosFacturacion() {
		boolean resultadoEsperado = false;
		String total = "100000";
		String nombre = "Alex";
		String apellido = "Reinoso";
		boolean resultadoObtenido = controladorFactura.consultarDatosFacturacion(total,nombre ,apellido );
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	
}

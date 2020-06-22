package ec.edu.ups.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ec.edu.ups.Controlador.ControladorCitas;
import ec.edu.ups.Modelo.Cita;
import ec.edu.ups.Modelo.Medico;
import ec.edu.ups.Modelo.Reporte;

public class ControladorCitaTest {
	
	private ControladorCitas controladorCitas2; 
	private Medico medico;
	private Reporte reporte;
	private List<Reporte> listaReportes;
	private Cita cita;
	
	@BeforeEach
	void setUp() throws Exception {
		this.controladorCitas2 = new ControladorCitas();
		medico = new Medico();
		reporte = new Reporte();
		listaReportes= new ArrayList<Reporte>();
		cita = new Cita();
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void testVerificarEstadoCita() {
		boolean resultadoEsperado = false;
		boolean resultadoObtenido = controladorCitas2.verificarEstadoCita("1");
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testSeleccionarMedico() {
		boolean resultadoEsperado = false;
		boolean resultadoObtenido = controladorCitas2.seleccionarMedico();
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testEnviarMensajeConfirmacion() {
		boolean resultadoEsperado = false;
		boolean resultadoObtenido = controladorCitas2.enviarMensajeConfirmacion();
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testNotificarMedico() {
		boolean resultadoEsperado = false;
		medico.setMed_id(0);
		medico.setEspecialidad("Oncologo");
		reporte.setBalances(717);
		listaReportes.add(reporte);
		medico.setListReporte(listaReportes);
		boolean resultadoObtenido = controladorCitas2.notificarMedico(medico);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testConsultarAgendaMedico() {
		boolean resultadoEsperado = false;
		medico.setMed_id(0);
		medico.setEspecialidad("Ginecologo");
		reporte.setBalances(716);
		listaReportes.add(reporte);
		medico.setListReporte(listaReportes);
		cita.setIdCita("0");
		cita.setEstadoCita("aceptado");
		boolean resultadoObtenido = controladorCitas2.consultarAgendaMedico(medico, cita);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}

}

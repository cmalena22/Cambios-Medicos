package ec.edu.ups.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ec.edu.ups.Controlador.ControladorReporte;
import ec.edu.ups.Modelo.LibroDiario;
import ec.edu.ups.Modelo.Reporte;

public class ControladorReporteTest {
	
	private List<Reporte> listareporte;
	private LibroDiario libroDiario;
	private ControladorReporte controladorReporte;
	
	@BeforeEach
	void setUp() throws Exception {
		this.listareporte = new ArrayList<Reporte>();
		this.libroDiario = libroDiario;
		controladorReporte = new ControladorReporte();
	}
	
	@AfterEach
	void tearDown() throws Exception {
	}
	
	
	
	@Test
	void testBuscar() {
		Reporte reporte = new Reporte();
		listareporte.add(reporte);
		List<Reporte> resultadoEsperado = listareporte;
		List<Reporte> resultadoObtenido = controladorReporte.cargarReporte(reporte);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
}

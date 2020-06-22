package ec.edu.ups.Test;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import ec.edu.ups.Controlador.ControladorHistoriasClinicas;
import ec.edu.ups.Modelo.HistoriasClinicas;

public class ControladorHistoriasClinicasTest {

	private List<HistoriasClinicas> listaHistoriasClinicas;
	private ControladorHistoriasClinicas HistoriasClinicas;
	private HistoriasClinicas historiasClinicas;
	
	@BeforeEach
	void setUp() throws Exception {
		listaHistoriasClinicas = new ArrayList<HistoriasClinicas>();
		HistoriasClinicas = new ControladorHistoriasClinicas();
		this.listaHistoriasClinicas = new ArrayList<HistoriasClinicas>();
		historiasClinicas = new HistoriasClinicas();
	}
	
	@AfterEach
	void tearDown() throws Exception {
	}
	
	
	
	@Test
	void testBuscar() {
		HistoriasClinicas histClinicas = new HistoriasClinicas();
		listaHistoriasClinicas.add(histClinicas);
		List<HistoriasClinicas> resultadoEsperado = listaHistoriasClinicas;
		List<HistoriasClinicas> resultadoObtenido = HistoriasClinicas.buscar(histClinicas);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
}

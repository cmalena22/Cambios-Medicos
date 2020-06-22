package ec.edu.ups.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ec.edu.ups.Controlador.ControladorLibroDiario;
import ec.edu.ups.Modelo.LibroDiario;

public class ControladorLibroDiarioTest {

	private List<LibroDiario> listLibroDiario;
	private ControladorLibroDiario controladorLibroDiario;
	private LibroDiario libroDiario;
	
	@BeforeEach
	void setUp() throws Exception {
		this.listLibroDiario = new ArrayList<LibroDiario>();
		this.controladorLibroDiario = new ControladorLibroDiario();
		this.libroDiario = new LibroDiario();
	}
	
	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void testCrearLibroDiario() {
		libroDiario.setLibroD_id(0);
		libroDiario.setFecha("12/06/2020");
		libroDiario.setHaber("445");
		libroDiario.setDebe("7457");
		
		String resultadoEsperado = "0, 445, 7457, 12/06/2020";
		String resultadoObtenido = controladorLibroDiario.crearLibroDiario(libroDiario).toString();
		assertEquals(resultadoEsperado, resultadoObtenido);	
	}
	
	@Test
	void testCargarLibroDiario() {
		LibroDiario libroDiario = new LibroDiario();
		listLibroDiario.add(libroDiario);
		List<LibroDiario> resultadoEsperado = listLibroDiario;
		List<LibroDiario> resultadoObtenido = controladorLibroDiario.cargarLibroDiario(libroDiario);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
}

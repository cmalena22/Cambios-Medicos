package ec.edu.ups.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ec.edu.ups.Controlador.ControladorColaborador;
import ec.edu.ups.Modelo.Colaboradores;

class ControladorColaboradorTest {
	
	private ControladorColaborador controladorColaborador;

	@BeforeEach
	void setUp() throws Exception {
		controladorColaborador = new ControladorColaborador();
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCalcularSueldo() {
		String cargo  = "contador";
		int id = 0;
		double resultadoEsperado = 837.98;
		double resultadoObtenido = controladorColaborador.CalcularSueldo(cargo, id);
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}

	@Test
	void testVerificarCargo() {
		String cargo  = "secretaria";
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = controladorColaborador.verificarCargo(cargo);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}


}

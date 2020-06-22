package ec.edu.ups.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ec.edu.ups.Controlador.ControladorDiario;
import ec.edu.ups.Modelo.Caja;
import ec.edu.ups.Modelo.ComprobanteDeVenta;
import ec.edu.ups.Modelo.Sueldo;

class ControladorDiarioTest {
	private List<Caja> caja;
	private List<ComprobanteDeVenta> comprobanteDeVenta;
	private List<Sueldo> sueldo;
	private ControladorDiario controladorDiario;
	@BeforeEach
	void setUp() throws Exception {
		caja = new ArrayList<Caja>();
		comprobanteDeVenta = new ArrayList<ComprobanteDeVenta>();
		sueldo = new ArrayList<Sueldo>();
		controladorDiario = new ControladorDiario();
		this.caja = new ArrayList<Caja>();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testImprimirRegistros() {
		Caja cajaO = new Caja(comprobanteDeVenta, sueldo,7373.84);
		caja.add(cajaO);
		List<Caja> resultadoEsperado = caja;
		List<Caja> resultadoObtenido = controladorDiario.imprimirRegistros(cajaO);
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}

	@Test
	void testImprimirSaldoActual() {
		Caja cajaO = new Caja(comprobanteDeVenta, sueldo,7373.84);
		double resultadoEsperado = 11183.09;
		double resultadoObtenido = controladorDiario.imprimirSaldoActual(cajaO);
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}

}

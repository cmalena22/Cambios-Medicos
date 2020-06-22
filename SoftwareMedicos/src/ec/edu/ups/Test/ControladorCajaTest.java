package ec.edu.ups.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ec.edu.ups.Controlador.ControladorCaja;
import ec.edu.ups.Controlador.ControladorSueldo;
import ec.edu.ups.Modelo.Colaboradores;
import ec.edu.ups.Modelo.ComprobanteDeVenta;
import ec.edu.ups.Modelo.Sueldo;

class ControladorCajaTest {
	private ControladorCaja controladorCaja;
	private Colaboradores colaborador;
	private List<ComprobanteDeVenta> comprobante;
	
	@BeforeEach
	void setUp() throws Exception {
		this.colaborador = new Colaboradores();
		this.comprobante = new ArrayList<ComprobanteDeVenta>();
		this.controladorCaja = new ControladorCaja();
		
	}
	

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCrearTransaccionSueldo() {
		double p1 = 1000.98;
		String cargo = "conserje";
		int id = 8;
		double resultadoEsperado = 386.98;
		double resultadoObtenido = controladorCaja.crearTransaccionSueldo(p1, cargo, id);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}

	@Test
	void testCalcularDebe() {
		double ganancia = 384.34;
		double resultdoEsperado = 1100.23;
		double resultadoObtenido = controladorCaja.calcularDebe(ganancia);
		assertEquals(resultdoEsperado, resultadoObtenido);
	}

	@Test
	void testHaber() {
		double deuda = 10394.80;
		double resultdoEsperado = 10384.80;
		double resultadoObtenido = controladorCaja.calcularDebe(deuda);
		assertEquals(resultdoEsperado, resultadoObtenido);
	}

	@Test
	void testGuardarTransaccion() {
		boolean resultadoEsperado = true;
		boolean resultadoObtenido = controladorCaja.guardarTransaccion();
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}

	@Test
	void testRegistrarComprobante() {
		String tipo = "factura";
		String fecha = "01/12/2020";
		int id = 2323;
		ComprobanteDeVenta com = new ComprobanteDeVenta(tipo, fecha, id);
		comprobante.add(com);
		List<ComprobanteDeVenta> resultadoEsperado = comprobante;
		List<ComprobanteDeVenta> resultadoObtenido = controladorCaja.registrarComprobante(com);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}

	@Test
	void testActualizarSaldo() {
		double debe = 1212.34;
		double haber = 2922.09;
		double resultdoEsperado = 11283.019;
		double resultadoObtenido = controladorCaja.actualizarSaldo(debe,haber);
		assertEquals(resultdoEsperado, resultadoObtenido);
	}

}

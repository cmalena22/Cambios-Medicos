package ec.edu.ups.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ec.edu.ups.Controlador.ControladorInformacion;
import ec.edu.ups.Modelo.Colaboradores;
import ec.edu.ups.Modelo.Medico;


class ControladorInformacionTest {
	private List<Medico> medicos;
	private List<Colaboradores> colaboradores;
	private ControladorInformacion controladorInformacion;
	@BeforeEach
	void setUp() throws Exception {
		this.medicos = new ArrayList<Medico>();
		this.colaboradores = new ArrayList<Colaboradores>();
		controladorInformacion = new ControladorInformacion();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testImprimirColaboradores() {
		Colaboradores colaborador = new Colaboradores("conserje", 4);
		colaboradores.add(colaborador);
		List<Colaboradores> resultadoEsperado = colaboradores;
		List<Colaboradores> resultadoObtenido = controladorInformacion.imprimirColaboradores(colaborador);
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}

	@Test
	void testImprimirMedicos() {
		Medico medico = new Medico();
		medico.setEspecialidad("Cardiologo");
		medico.setMed_id(0);
		medicos.add(medico);
		List<Medico> resultadoEsperado =  medicos;
		List<Medico> resultadoObtenido = controladorInformacion.imprimirMedicos(medico);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	

	

}

package ec.edu.ups.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ec.edu.ups.Controlador.ControladorCertificadoMedico;
import ec.edu.ups.Modelo.Paciente;



public class ControladorCertificadoMedicoTest {
	
	private ControladorCertificadoMedico controladorCertificadoMedico;
	private Paciente paciente;
	
	@BeforeEach
	void setUp() throws Exception {
		paciente = new Paciente();
		controladorCertificadoMedico = new ControladorCertificadoMedico();
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void testSolicitarConfirmacionEnvio() {
		boolean resultadoEsperado = false;
		String estado = "NegarConfirmacion";
		paciente.setCedula("0106683474");
		paciente.setNombre("Andrea");
		paciente.setApellido("Lopez");
		boolean resultadoObtenido = controladorCertificadoMedico.SolicitarConfirmacionEnvio(paciente, estado);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testEnviarCertificadoEmail() {
		boolean resultadoEsperado = false;
		String correoElectronico = "prosebascalle@hotmail.com";
		boolean resultadoObtenido = controladorCertificadoMedico.EnviarCertificadoEmail(correoElectronico);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testRegistrarCertificadoPaciente() {
		boolean resultadoEsperado = false;
		String certificado = "CertificadoParaPaciente";
		boolean resultadoObtenido = controladorCertificadoMedico.RegistrarCertificadoMedico(certificado);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testRegistrarCertificadoMedico() {
		boolean resultadoEsperado = false;
		String certificado = "CertificadoParaPaciente";
		boolean resultadoObtenido = controladorCertificadoMedico.RegistrarCertificadoMedico(certificado);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	
	
	

}

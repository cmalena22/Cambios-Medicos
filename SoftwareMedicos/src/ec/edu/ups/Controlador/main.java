package ec.edu.ups.Controlador;

import ec.edu.ups.Modelo.Paciente;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Paciente pacientes= new Paciente();
		ControladorPaciente paciente = new ControladorPaciente();
	System.out.println(paciente.agregarPaciente("Cinthia", "Izza", 21, "Femenino", "099836763", "175482411", "ciza@sd", "123"));
	/*
	 * Mdoficar Datos Paciente
	 */
	//Agregando nuevvos Datos al paciente
	paciente.validarCedula("1724934110");
		pacientes.setApellido("Cajia");
		pacientes.setCedula("123");
		pacientes.setEdad(22);
		pacientes.setNombre("Juan");
	System.out.println(paciente.modificarPaciente(pacientes));
	}

}

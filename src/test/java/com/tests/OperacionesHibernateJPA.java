package com.tests;

import com.entity.daos.PersonaDAO;
import com.entity.domain.Persona;

public class OperacionesHibernateJPA {

	public static void main(String[] args) {
		PersonaDAO personaDAO = new PersonaDAO();
		
		System.out.println("BEFORE");
		personaDAO.listar();
		
//		Insertar persona
//		Persona p = new Persona();
//		p.setNombrePersona("Fernando");
//		p.setApellido("Dacal");
//		p.setTelefonoPersona("1125463025");
//		personaDAO.insertar(p);
//		
//		personaDAO.listar();
		
		//Modificar Persona
//		Persona p = new Persona();
//		p.setIdPersona(4);
//		p = personaDAO.buscarPersonaPorId(p);
//		System.out.println("\nPersona encontrada: " + p);
//		p.setNombrePersona("Mauricio");
//		p.setApellido("Diaz");
//		p.setTelefonoPersona("1152480246");
//		p.setEmailPersona("mdiaz@gmail.com");
//		personaDAO.modificar(p);
//		
//		System.out.println("\nAFTER");
//		personaDAO.listar();
		
		
		//Eliminar Persona
//		Persona p = new Persona();
//		p.setIdPersona(6);
//		p = personaDAO.buscarPersonaPorId(p);
//		System.out.println("\nPersona encontrada: " + p);
//		personaDAO.eliminar(p);
//		System.out.println("\nPersona eliminada: " + p);
//		
//		System.out.println("\nAFTER");
//		personaDAO.listar();
	}
	
	

}

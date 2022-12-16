package com.tests;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.entity.domain.Persona;

public class TestPersonas {

	@SuppressWarnings({ "unchecked" })
	public static void main(String[] args) {

		String hql = "FROM Persona";
		EntityManager manager;
		EntityManagerFactory emf;

		emf = Persistence.createEntityManagerFactory("aplicacion");
		manager = emf.createEntityManager();

		List<Persona> personas = manager.createQuery(hql).getResultList();
		if (personas.size() == 1) {
			System.out.println("En la base hay: " + personas.size() + " persona");
		} else {
			System.out.println("En la base hay: " + personas.size() + " personas");
		}
		for (Persona p : personas) {
			System.out.println("Persona n°: " + p.getIdPersona());
			System.out.println("Nombre: " + p.getNombrePersona());
			System.out.println("Apellido: " + p.getApellido());
			System.out.println("Telefono: " + p.getTelefonoPersona() + "\n");
		}
	}

}

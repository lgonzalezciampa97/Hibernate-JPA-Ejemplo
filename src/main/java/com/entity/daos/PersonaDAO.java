package com.entity.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.entity.domain.Persona;

public class PersonaDAO {

	private EntityManagerFactory emf;
	private EntityManager em;

	public PersonaDAO() {
		emf = Persistence.createEntityManagerFactory("aplicacion");
		em = emf.createEntityManager();
	}

	@SuppressWarnings("unchecked")
	public void listar() {
		String hql = "SELECT p from Persona p";
		Query query = em.createQuery(hql);
		List<Persona> listaPersonas = (List<Persona>) query.getResultList();
		for (Persona p : listaPersonas) {
			System.out.println(p);
		}
	}

	public void insertar(Persona persona) {
		try {
			em.getTransaction().begin();
			em.persist(persona);
			em.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace(System.out);
			em.getTransaction().rollback();
		}
	}

	public void modificar(Persona persona) {
		try {
			em.getTransaction().begin();
			em.merge(persona);
			em.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace(System.out);
			em.getTransaction().rollback();
		}
	}

	public Persona buscarPersonaPorId(Persona persona) {
		return em.find(Persona.class, persona.getIdPersona());
	}

	public void eliminar(Persona persona) {
		try {
			em.getTransaction().begin();
			em.remove(em.merge(persona));
			em.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace(System.out);
			em.getTransaction().rollback();
		}
	}
}

package com.entity.domain;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="persona")
public class Persona implements Serializable{
	

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPersona",unique=true, nullable = false)
	private Integer idPersona;
	
	private String apellidoPersona;
	
	private String nombrePersona;
	
	private String telefonoPersona;
	
	private String emailPersona;

	public Persona(Integer idPersona, String apellido, String nombrePersona, String telefonoPersona,
			String emailPersona) {
		this.idPersona = idPersona;
		this.apellidoPersona = apellido;
		this.nombrePersona = nombrePersona;
		this.telefonoPersona = telefonoPersona;
		this.emailPersona = emailPersona;
	}

	public Persona() {
	}

	public Integer getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	public String getApellido() {
		return apellidoPersona;
	}

	public void setApellido(String apellido) {
		this.apellidoPersona = apellido;
	}

	public String getNombrePersona() {
		return nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	public String getTelefonoPersona() {
		return telefonoPersona;
	}

	public void setTelefonoPersona(String telefonoPersona) {
		this.telefonoPersona = telefonoPersona;
	}

	public String getEmailPersona() {
		return emailPersona;
	}

	public void setEmailPersona(String emailPersona) {
		this.emailPersona = emailPersona;
	}

	@Override
	public String toString() {
		return "ID: " + idPersona + " | Nombre: " + nombrePersona + " | Apellido: " + apellidoPersona
				+ " | Telefono: " + telefonoPersona + " | Email: " + emailPersona;
	}

}

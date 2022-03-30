package com.everis.nttdatacenter_hibernate_t1_agg;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENTE")
public class Cliente {
    
	private long idCliente;
	
	private String nombreCliente;
	
	private String primerApellidoCliente;
	
	private String segundoApellidoCliente;
	
	private String docIdentidad;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	@Column(name = "NOMBRE_CLIENTE")
	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	
	@Column(name = "PRIMER_APELLIDO_CLIENTE")
	public String getPrimerApellidoCliente() {
		return primerApellidoCliente;
	}

	public void setPrimerApellidoCliente(String primerApellidoCliente) {
		this.primerApellidoCliente = primerApellidoCliente;
	}

	@Column(name = "SEGUNDO_APELLIDO_CLIENTE")
	public String getSegundoApellidoCliente() {
		return segundoApellidoCliente;
	}

	public void setSegundoApellidoCliente(String segundoApellidoCliente) {
		this.segundoApellidoCliente = segundoApellidoCliente;
	}

	@Column(name = "DOC_IDENTIDAD", unique = true, nullable = false, length = 9)
	public String getDocIdentidad() {
		return docIdentidad;
	}

	public void setDocIdentidad(String docIdentidad) {
		this.docIdentidad = docIdentidad;
	}

	
    
}

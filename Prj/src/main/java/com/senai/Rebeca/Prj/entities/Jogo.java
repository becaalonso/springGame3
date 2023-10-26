package com.senai.Rebeca.Prj.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbJogo")
public class Jogo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "NJogo")
	private String NJogo;

	@Column(name = "Plataform")
	private String Plataform;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNJogo() {
		return NJogo;
	}

	public void setNJogo(String nJogo) {
		NJogo = nJogo;
	}

	public String getPlataform() {
		return Plataform;
	}

	public void setPlataform(String plataform) {
		Plataform = plataform;
	}

	

}

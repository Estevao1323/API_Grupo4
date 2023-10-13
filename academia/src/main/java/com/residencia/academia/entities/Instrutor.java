package com.residencia.academia.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@JsonIdentityInfo(
		generator = ObjectIdGenerators.PropertyGenerator.class,
		property = "codigoInstrutor",
		scope = Instrutor.class
)
@Entity
@Table(name = "instrutor")
public class Instrutor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigoinstrutor")
	private Integer codigoInstrutor;
	
	@Column(name = "rginstrutor", unique = true)
	private Long rgInstrutor;
	
	@Column(name = "nomeinstrutor")
	private String nomeInstrutor;
	
	@OneToMany(mappedBy = "instrutor")
	private List<Turma> turmas;
	
	@OneToOne(mappedBy = "instrutor")
    private Telefone telefone;
	
	public Integer getCodigoInstrutor() {
		return codigoInstrutor;
	}

	public void setCodigoInstrutor(Integer codigoInstrutor) {
		this.codigoInstrutor = codigoInstrutor;
	}

	public Long getRgInstrutor() {
		return rgInstrutor;
	}

	public void setRgInstrutor(Long rgInstrutor) {
		this.rgInstrutor = rgInstrutor;
	}

	public String getNomeInstrutor() {
		return nomeInstrutor;
	}

	public void setNomeInstrutor(String nomeInstrutor) {
		this.nomeInstrutor = nomeInstrutor;
	}

	public List<Turma> getTurmas() {
		return turmas;
	}

	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	
	
}

package com.residencia.academia.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//id (serial)
//nome_disciplina (varchar)
//dia_semana (varchar)
//id_instrutor (int4)

@Entity
@Table(name = "turma")
public class Turma {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigoturma")
	private Integer codigoTurma;
	
	@Column(name = "nome_disciplina")
	private String nomeDisciplina;
	
	@Column(name = "dia_semana")
	private String diaSemana;
	
	@Column(name = "id_instrutor")
	private Integer idInstrutor;

	public Integer getCodigoTurma() {
		return codigoTurma;
	}

	public void setCodigoTurma(Integer codigoTurma) {
		this.codigoTurma = codigoTurma;
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public String getDiaSemana() {
		return diaSemana;
	}

	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}

	public Integer getIdInstrutor() {
		return idInstrutor;
	}

	public void setIdInstrutor(Integer idInstrutor) {
		this.idInstrutor = idInstrutor;
	}
	
	
}

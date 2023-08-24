package com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322;

import com.fie.cercamento.cercamentoLF.interfaceEsq.IFieEsq;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity
public class FieEsq24342 {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
	
	private String numEsq24342;
	
	@Transient
	private String esqParam; // o nome na view tem que ser o mesmo para passar como parametro.

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumEsq24342() {
		return numEsq24342;
	}

	public void setNumEsq24342(String numEsq24342) {
		this.numEsq24342 = numEsq24342;
	}

	public String getEsqParam() {
		return esqParam;
	}

	public void setEsqParam(String esqParam) {
		this.esqParam = esqParam;
	}
	
	
}

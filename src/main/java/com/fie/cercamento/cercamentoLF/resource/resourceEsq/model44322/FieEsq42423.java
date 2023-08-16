package com.fie.cercamento.cercamentoLF.resource.resourceEsq.model44322;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity
public class FieEsq42423 {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
	
	private String numEsq42423;
	
	@Transient
	private String esqParam; // o nome na view tem que ser o mesmo para passar como parametro.

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumEsq42423() {
		return numEsq42423;
	}

	public void setNumEsq42423(String numEsq42423) {
		this.numEsq42423 = numEsq42423;
	}

	public String getEsqParam() {
		return esqParam;
	}

	public void setEsqParam(String esqParam) {
		this.esqParam = esqParam;
	}

}

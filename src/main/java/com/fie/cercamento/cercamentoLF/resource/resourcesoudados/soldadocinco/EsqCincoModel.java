package com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadocinco;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "EsqCincoModel")
public class EsqCincoModel {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
	private String numEsqCinco;

	@Transient
	private String esqParam;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumEsqCinco() {
		return numEsqCinco;
	}
	public void setNumEsqCinco(String numEsqCinco) {
		this.numEsqCinco = numEsqCinco;
	}
	public String getEsqParam() {
		return esqParam;
	}
	public void setEsqParam(String esqParam) {
		this.esqParam = esqParam;
	}

	@Override
	public String toString() {
		return ""+numEsqCinco+"";
	}
}

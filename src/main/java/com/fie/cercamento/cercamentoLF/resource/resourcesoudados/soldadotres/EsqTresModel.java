package com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadotres;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "EsqTresModel")
public class EsqTresModel {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

	private String numEsqTres;

	@Transient
	private String esqParam;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumEsqTres() {
		return numEsqTres;
	}
	public void setNumEsqTres(String numEsqTres) {
		this.numEsqTres = numEsqTres;
	}
	public String getEsqParam() {
		return esqParam;
	}
	public void setEsqParam(String esqParam) {
		this.esqParam = esqParam;
	}
	@Override
	public String toString() {
		return ""+numEsqTres+"-";
	}
	
}

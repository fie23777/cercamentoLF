package com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadoum;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "EsqUmModel")
public class EsqUmModel {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

	private String numEsqUm;
	@Transient
	private String esqParam;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumEsqUm() {
		return numEsqUm;
	}
	public void setNumEsqUm(String numEsqUm) {
		this.numEsqUm = numEsqUm;
	}
	public String getEsqParam() {
		return esqParam;
	}
	public void setEsqParam(String esqParam) {
		this.esqParam = esqParam;
	}
	@Override
	public String toString() {
		return ""+numEsqUm+"-";
	}
	
}

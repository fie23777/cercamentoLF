package com.fie.cercamento.cercamentoLF.resource.resourcesoudados.soldadodois;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "EsqDoisModel")
public class EsqDoisModel {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
	
	private String numEsqDois;

	@Transient
	private String esqParam;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumEsqDois() {
		return numEsqDois;
	}
	public void setNumEsqDois(String numEsqDois) {
		this.numEsqDois = numEsqDois;
	}
	public String getEsqParam() {
		return esqParam;
	}
	public void setEsqParam(String esqParam) {
		this.esqParam = esqParam;
	}
	@Override
	public String toString() {
		return "" + numEsqDois + "-";
	}
	
	

}

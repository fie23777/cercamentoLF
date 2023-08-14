package com.fie.cercamento.cercamentoLF.soldados;
import java.beans.Transient;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class EsqUm {

	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
	private String numEsqUm;
	//@Transient
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

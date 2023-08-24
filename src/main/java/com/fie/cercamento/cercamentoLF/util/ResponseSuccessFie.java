package com.fie.cercamento.cercamentoLF.util;

public class ResponseSuccessFie {
	
	private String message;
	private String squema;
	
	
	public ResponseSuccessFie(String message, String squema) {
		this.message = message;
		this.squema = squema;
	}
	

	public String getStatus() {
		return message;
	}
	public void setStatus(String message) {
		this.message = message;
	}
	public String getSquema() {
		return squema;
	}
	public void setSquema(String squema) {
		this.squema = squema;
	}
	

}

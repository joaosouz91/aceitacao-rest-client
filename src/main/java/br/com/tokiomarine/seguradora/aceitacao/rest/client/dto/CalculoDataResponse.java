package br.com.tokiomarine.seguradora.aceitacao.rest.client.dto;

import java.io.Serializable;

public class CalculoDataResponse implements Serializable{

	private static final long serialVersionUID = 1L;

	private String returnFunction;

	public String getReturnFunction() {
		return returnFunction;
	}

	public void setReturnFunction(String returnFunction) {
		this.returnFunction = returnFunction;
	}	
}
package br.com.tokiomarine.seguradora.aceitacao.rest.client.dto;

import java.io.Serializable;
import java.util.Calendar;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CancelaTituloSSVResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7226356882942943485L;
	
	private String returnFunction;
	private Calendar ddtcancel;
	private String cretcode;
	private String cdescerro;

		  
	public String getReturnFunction() {
		return returnFunction;
	}
	public void setReturnFunction(String returnFunction) {
		this.returnFunction = returnFunction;
	}
	public Calendar getDdtcancel() {
		return ddtcancel;
	}
	public void setDdtcancel(Calendar ddtcancel) {
		this.ddtcancel = ddtcancel;
	}
	public String getCretcode() {
		return cretcode;
	}
	public void setCretcode(String cretcode) {
		this.cretcode = cretcode;
	}
	public String getCdescerro() {
		return cdescerro;
	}
	public void setCdescerro(String cdescerro) {
		this.cdescerro = cdescerro;
	}

}
package br.com.tokiomarine.seguradora.aceitacao.rest.client.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonAutoDetect
@JsonIgnoreProperties(ignoreUnknown=true)
public class DevolverFUpTituloResponse implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4761677445536322722L;
	
	private String cdescretcode;
	
	private String descricaoCodigoRetorno;
	
	private String cretcode;
	

	public String getCdescretcode() {
		return cdescretcode;
	}

	public void setCdescretcode(String cdescretcode) {
		this.cdescretcode = cdescretcode;
	}

	
	public String getDescricaoCodigoRetorno() {
		return descricaoCodigoRetorno;
	}

	public void setDescricaoCodigoRetorno(String descricaoCodigoRetorno) {
		this.descricaoCodigoRetorno = descricaoCodigoRetorno;
	}

	public String getCretcode() {
		return cretcode;
	}

	public void setCretcode(String cretcode) {
		this.cretcode = cretcode;
	}
	
	
}

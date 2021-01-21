package br.com.tokiomarine.seguradora.aceitacao.rest.client.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect
@JsonIgnoreProperties(ignoreUnknown=true)	
public class BuCorretorOpcaoChequeResponse implements Serializable{

	private static final long serialVersionUID = 4916320202720880716L;

	@JsonProperty("CD_CRTOR")
	private String cdCrtor;
	
	@JsonProperty("NM_RAZAO_SOCAL")
	private String nmRazaoSocal;
	
	@JsonProperty("IC_CLIEN_DOC")
	private String icClienDoc;

	public String getCdCrtor() {
		return cdCrtor;
	}

	public void setCdCrtor(String cdCrtor) {
		this.cdCrtor = cdCrtor;
	}

	public String getNmRazaoSocal() {
		return nmRazaoSocal;
	}

	public void setNmRazaoSocal(String nmRazaoSocal) {
		this.nmRazaoSocal = nmRazaoSocal;
	}

	public String getIcClienDoc() {
		return icClienDoc;
	}

	public void setIcClienDoc(String icClienDoc) {
		this.icClienDoc = icClienDoc;
	}

}

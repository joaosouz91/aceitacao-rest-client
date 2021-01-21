package br.com.tokiomarine.seguradora.aceitacao.rest.client.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect
public class CalcularValorCorrecaoServiceRequest  implements Serializable {

	private static final long serialVersionUID = 1L;

	private String ccodcia;

	private String ddatainicorr;

	private BigDecimal nvalordevorig;

	private String ctipopagto;

	private String formaPagamento;

	public String getCcodcia() {
		return ccodcia;
	}

	public void setCcodcia(String ccodcia) {
		this.ccodcia = ccodcia;
	}

	public String getDdatainicorr() {
		return ddatainicorr;
	}

	public void setDdatainicorr(String ddatainicorr) {
		this.ddatainicorr = ddatainicorr;
	}

	public BigDecimal getNvalordevorig() {
		return nvalordevorig;
	}

	public void setNvalordevorig(BigDecimal nvalordevorig) {
		this.nvalordevorig = nvalordevorig;
	}

	public String getCtipopagto() {
		return ctipopagto;
	}

	public void setCtipopagto(String ctipopagto) {
		this.ctipopagto = ctipopagto;
	}

	@JsonProperty("cforma_pagto")
	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}


}

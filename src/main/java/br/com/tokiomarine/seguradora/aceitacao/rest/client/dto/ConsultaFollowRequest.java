package br.com.tokiomarine.seguradora.aceitacao.rest.client.dto;

import java.io.Serializable;

public class ConsultaFollowRequest implements Serializable {

	private static final long serialVersionUID = 188999086724621722L;
	private String ccodcia;
	private String cnumtitulossv;
	private String ccodentfinan;

	public String getCcodcia() {
		return ccodcia;
	}
	public void setCcodcia(String ccodCia) {
		this.ccodcia = ccodCia;
	}
	public String getCnumtitulossv() {
		return cnumtitulossv;
	}
	public void setCnumtitulossv(String cnumtitulossv) {
		this.cnumtitulossv = cnumtitulossv;
	}
	public String getCcodentfinan() {
		return ccodentfinan;
	}
	public void setCcodentfinan(String ccodentfinan) {
		this.ccodentfinan = ccodentfinan;
	}



}

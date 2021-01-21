package br.com.tokiomarine.seguradora.aceitacao.rest.client.dto;

import java.io.Serializable;
import java.util.Calendar;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ConsultaFollowResponse implements Serializable{

	private static final long serialVersionUID = 4022361572586996585L;

	private String cnumtituloacx;
	private Calendar ddatapagto;
	private String ccodmotivo;
	private String cdescmotivo;
	private String cretcode;
	private String cmensagem;
	private Double nvalorpago;

	public String getCnumtituloacx() {
		return cnumtituloacx;
	}

	public void setCnumtituloacx(String cnumtituloacx) {
		this.cnumtituloacx = cnumtituloacx;
	}

	public Calendar getDdatapagto() {
		return ddatapagto;
	}

	public void setDdatapagto(Calendar ddatapagto) {
		this.ddatapagto = ddatapagto;
	}

	public String getCcodmotivo() {
		return ccodmotivo;
	}

	public void setCcodmotivo(String ccodmotivo) {
		this.ccodmotivo = ccodmotivo;
	}

	public String getCdescmotivo() {
		return cdescmotivo;
	}

	public void setCdescmotivo(String cdescmotivo) {
		this.cdescmotivo = cdescmotivo;
	}

	public String getCretcode() {
		return cretcode;
	}

	public void setCretcode(String cretcode) {
		this.cretcode = cretcode;
	}

	public String getCmensagem() {
		return cmensagem;
	}

	public void setCmensagem(String cmensagem) {
		this.cmensagem = cmensagem;
	}

	public Double getNvalorpago() {
		return nvalorpago;
	}

	public void setNvalorpago(Double nvalorpago) {
		this.nvalorpago = nvalorpago;
	}


}
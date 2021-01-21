package br.com.tokiomarine.seguradora.aceitacao.rest.client.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class CalcularValorCorrecaoServiceResponse implements Serializable{

	private static final long serialVersionUID = 1L;

	private String codigoRetorno;
	
	private String descricaoCodigoRetorno;
	
	private String cmsgerro;
	
	private BigDecimal nvalorcorrecao;

	private Date ddatafimcorr;

	private String cretcode;

	public String getCodigoRetorno() {
		return codigoRetorno;
	}

	public void setCodigoRetorno(String codigoRetorno) {
		this.codigoRetorno = codigoRetorno;
	}

	public String getDescricaoCodigoRetorno() {
		return descricaoCodigoRetorno;
	}

	public void setDescricaoCodigoRetorno(String descricaoCodigoRetorno) {
		this.descricaoCodigoRetorno = descricaoCodigoRetorno;
	}

	public String getCmsgerro() {
		return cmsgerro;
	}

	public void setCmsgerro(String cmsgerro) {
		this.cmsgerro = cmsgerro;
	}

	public BigDecimal getNvalorcorrecao() {
		return nvalorcorrecao;
	}

	public void setNvalorcorrecao(BigDecimal nvalorcorrecao) {
		this.nvalorcorrecao = nvalorcorrecao;
	}

	public Date getDdatafimcorr() {
		return ddatafimcorr;
	}

	public void setDdatafimcorr(Date ddatafimcorr) {
		this.ddatafimcorr = ddatafimcorr;
	}

	public String getCretcode() {
		return cretcode;
	}

	public void setCretcode(String cretcode) {
		this.cretcode = cretcode;
	}

}

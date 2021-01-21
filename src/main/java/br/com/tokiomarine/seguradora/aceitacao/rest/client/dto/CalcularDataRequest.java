package br.com.tokiomarine.seguradora.aceitacao.rest.client.dto;

import java.io.Serializable;

public class CalcularDataRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private String codCidade;
	private String codEstado;
	private String codPais;
	private String diaFechamento;
	private Long   qtdDias;
	private String retDiaUtil;
	private Long tipoCalc;
	private String tipoDias;
	
	
	public CalcularDataRequest(String codCidade, String codEstado, String codPais, String diaFechamento, Long qtdDias,
			String retDiaUtil, Long tipoCalc, String tipoDias) {
		super();
		this.codCidade = codCidade;
		this.codEstado = codEstado;
		this.codPais = codPais;
		this.diaFechamento = diaFechamento;
		this.qtdDias = qtdDias;
		this.retDiaUtil = retDiaUtil;
		this.tipoCalc = tipoCalc;
		this.tipoDias = tipoDias;
	}
	
	
	
	public CalcularDataRequest() {
		super();
	}



	public String getCodCidade() {
		return codCidade;
	}
	public void setCodCidade(String codCidade) {
		this.codCidade = codCidade;
	}
	public String getCodEstado() {
		return codEstado;
	}
	public void setCodEstado(String codEstado) {
		this.codEstado = codEstado;
	}
	public String getCodPais() {
		return codPais;
	}
	public void setCodPais(String codPais) {
		this.codPais = codPais;
	}
	public String getDiaFechamento() {
		return diaFechamento;
	}
	public void setDiaFechamento(String diaFechamento) {
		this.diaFechamento = diaFechamento;
	}
	public Long getQtdDias() {
		return qtdDias;
	}
	public void setQtdDias(Long qtdDias) {
		this.qtdDias = qtdDias;
	}
	public String getRetDiaUtil() {
		return retDiaUtil;
	}
	public void setRetDiaUtil(String retDiaUtil) {
		this.retDiaUtil = retDiaUtil;
	}
	public Long getTipoCalc() {
		return tipoCalc;
	}
	public void setTipoCalc(Long tipoCalc) {
		this.tipoCalc = tipoCalc;
	}
	public String getTipoDias() {
		return tipoDias;
	}
	public void setTipoDias(String tipoDias) {
		this.tipoDias = tipoDias;
	}
	
	
	
	
	
	
}

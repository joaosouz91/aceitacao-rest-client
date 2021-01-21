package br.com.tokiomarine.seguradora.aceitacao.rest.client.dto;

import java.io.Serializable;
import java.util.Date;

public class CalcularDataResponse implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long codigo;
    private String descricao;
    private String dataCalculada;
    private String diaUtil;
    private String tipoDia;
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDataCalculada() {
		return dataCalculada;
	}
	public void setDataCalculada(String dataCalculada) {
		this.dataCalculada = dataCalculada;
	}
	public String getDiaUtil() {
		return diaUtil;
	}
	public void setDiaUtil(String diaUtil) {
		this.diaUtil = diaUtil;
	}
	public String getTipoDia() {
		return tipoDia;
	}
	public void setTipoDia(String tipoDia) {
		this.tipoDia = tipoDia;
	}
    
    
}

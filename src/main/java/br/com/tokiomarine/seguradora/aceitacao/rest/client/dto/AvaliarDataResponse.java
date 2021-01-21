package br.com.tokiomarine.seguradora.aceitacao.rest.client.dto;

import java.io.Serializable;

public class AvaliarDataResponse implements Serializable {
	
	private static final long serialVersionUID = 3942801538957525387L;
	
	private String codigo;
	private String descricao;
	private String dataCalculada;
	private String diaUtil;
	private String tipoDia;
	
	public AvaliarDataResponse(){
		
	}
	
	public AvaliarDataResponse(String codigo, String descricao, String dataCalculada, String diaUtil, String tipoDia) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.dataCalculada = dataCalculada;
		this.diaUtil = diaUtil;
		this.tipoDia = tipoDia;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((dataCalculada == null) ? 0 : dataCalculada.hashCode());
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((diaUtil == null) ? 0 : diaUtil.hashCode());
		result = prime * result + ((tipoDia == null) ? 0 : tipoDia.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AvaliarDataResponse other = (AvaliarDataResponse) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (dataCalculada == null) {
			if (other.dataCalculada != null)
				return false;
		} else if (!dataCalculada.equals(other.dataCalculada))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (diaUtil == null) {
			if (other.diaUtil != null)
				return false;
		} else if (!diaUtil.equals(other.diaUtil))
			return false;
		if (tipoDia == null) {
			if (other.tipoDia != null)
				return false;
		} else if (!tipoDia.equals(other.tipoDia))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AvaliarDataResponse [codigo=" + codigo + ", descricao=" + descricao + ", dataCalculada=" + dataCalculada
				+ ", diaUtil=" + diaUtil + ", tipoDia=" + tipoDia + "]";
	}	
}
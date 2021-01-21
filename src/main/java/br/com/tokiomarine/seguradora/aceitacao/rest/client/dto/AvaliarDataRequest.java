package br.com.tokiomarine.seguradora.aceitacao.rest.client.dto;

import java.io.Serializable;

public class AvaliarDataRequest implements Serializable {
	
	private static final long serialVersionUID = -4658386564678697206L;

	private String codCidade;
	private String codEstado;
	private String codPais;
	private String diaFechamento;
	private Long qtdDias;
	private String retDiaUtil;
	private Long tipoCalc;
	private String tipoDias;
	
	public AvaliarDataRequest(){
		
	}
	
	public AvaliarDataRequest(String codCidade, String codEstado, String codPais, String diaFechamento, Long qtdDias,
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codCidade == null) ? 0 : codCidade.hashCode());
		result = prime * result + ((codEstado == null) ? 0 : codEstado.hashCode());
		result = prime * result + ((codPais == null) ? 0 : codPais.hashCode());
		result = prime * result + ((diaFechamento == null) ? 0 : diaFechamento.hashCode());
		result = prime * result + ((qtdDias == null) ? 0 : qtdDias.hashCode());
		result = prime * result + ((retDiaUtil == null) ? 0 : retDiaUtil.hashCode());
		result = prime * result + ((tipoCalc == null) ? 0 : tipoCalc.hashCode());
		result = prime * result + ((tipoDias == null) ? 0 : tipoDias.hashCode());
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
		AvaliarDataRequest other = (AvaliarDataRequest) obj;
		if (codCidade == null) {
			if (other.codCidade != null)
				return false;
		} else if (!codCidade.equals(other.codCidade))
			return false;
		if (codEstado == null) {
			if (other.codEstado != null)
				return false;
		} else if (!codEstado.equals(other.codEstado))
			return false;
		if (codPais == null) {
			if (other.codPais != null)
				return false;
		} else if (!codPais.equals(other.codPais))
			return false;
		if (diaFechamento == null) {
			if (other.diaFechamento != null)
				return false;
		} else if (!diaFechamento.equals(other.diaFechamento))
			return false;
		if (qtdDias == null) {
			if (other.qtdDias != null)
				return false;
		} else if (!qtdDias.equals(other.qtdDias))
			return false;
		if (retDiaUtil == null) {
			if (other.retDiaUtil != null)
				return false;
		} else if (!retDiaUtil.equals(other.retDiaUtil))
			return false;
		if (tipoCalc == null) {
			if (other.tipoCalc != null)
				return false;
		} else if (!tipoCalc.equals(other.tipoCalc))
			return false;
		if (tipoDias == null) {
			if (other.tipoDias != null)
				return false;
		} else if (!tipoDias.equals(other.tipoDias))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AvaliarData [codCidade=" + codCidade + ", codEstado=" + codEstado + ", codPais=" + codPais
				+ ", diaFechamento=" + diaFechamento + ", qtdDias=" + qtdDias + ", retDiaUtil=" + retDiaUtil
				+ ", tipoCalc=" + tipoCalc + ", tipoDias=" + tipoDias + "]";
	}	
}

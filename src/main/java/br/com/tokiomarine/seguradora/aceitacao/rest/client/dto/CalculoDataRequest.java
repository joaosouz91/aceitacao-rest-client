package br.com.tokiomarine.seguradora.aceitacao.rest.client.dto;

import java.io.Serializable;

public class CalculoDataRequest implements Serializable {

	  /**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private String ccodpais;
	private String ccodestado;
	private String cretdiautil;
	private Long ntipocalculo;
	private String ctipodias;
	private Long nqtddias;
	private String dfec;
	private String ccodciudad;

	public String getCcodpais() {
		return ccodpais;
	}
	public void setCcodpais(String ccodpais) {
		this.ccodpais = ccodpais;
	}
	public String getCcodestado() {
		return ccodestado;
	}
	public void setCcodestado(String ccodestado) {
		this.ccodestado = ccodestado;
	}
	public String getCretdiautil() {
		return cretdiautil;
	}
	public void setCretdiautil(String cretdiautil) {
		this.cretdiautil = cretdiautil;
	}
	public Long getNtipocalculo() {
		return ntipocalculo;
	}
	public void setNtipocalculo(Long ntipocalculo) {
		this.ntipocalculo = ntipocalculo;
	}
	public String getCtipodias() {
		return ctipodias;
	}
	public void setCtipodias(String ctipodias) {
		this.ctipodias = ctipodias;
	}
	public Long getNqtddias() {
		return nqtddias;
	}
	public void setNqtddias(Long nqtddias) {
		this.nqtddias = nqtddias;
	}
	public String getDfec() {
		return dfec;
	}
	public void setDfec(String dfec) {
		this.dfec = dfec;
	}
	public String getCcodciudad() {
		return ccodciudad;
	}
	public void setCcodciudad(String ccodciudad) {
		this.ccodciudad = ccodciudad;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}

package br.com.tokiomarine.seguradora.aceitacao.rest.client.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY)
public class CancelaTituloSSVRequest implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private String ctipocan;
	
	@JsonProperty(value="p_origem")
	private String pOrigem;
	
	private Long ncodneg;
	
	private String cnumtitulossv;
	
	private String ccoduser;
	
	private String ccodentfinan;

	public String getCtipocan() {
		return ctipocan;
	}
	public void setCtipocan(String ctipocan) {
		this.ctipocan = ctipocan;
	}
	public String getpOrigem() {
		return pOrigem;
	}
	public void setpOrigem(String pOrigem) {
		this.pOrigem = pOrigem;
	}

	public Long getNcodneg() {
		return ncodneg;
	}
	public void setNcodneg(Long ncodneg) {
		this.ncodneg = ncodneg;
	}
	public String getCnumtitulossv() {
		return cnumtitulossv;
	}
	public void setCnumtitulossv(String cnumtitulossv) {
		this.cnumtitulossv = cnumtitulossv;
	}
	public String getCcoduser() {
		return ccoduser;
	}
	public void setCcoduser(String ccoduser) {
		this.ccoduser = ccoduser;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getCcodentfinan() {
		return ccodentfinan;
	}
	public void setCcodentfinan(String ccodentfinan) {
		this.ccodentfinan = ccodentfinan;
	}

}

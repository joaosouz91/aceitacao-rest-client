package br.com.tokiomarine.seguradora.aceitacao.rest.client.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect
@JsonIgnoreProperties(ignoreUnknown=true)	
public class BuAssessoriaResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1090647385349704685L;

	@JsonProperty("CODIGO_PN")
	private String codigoPn;
	
	@JsonProperty("BAIRR")
	private String bairr;
	
	@JsonProperty("CEP")
	private String cep;
	
	@JsonProperty("CIDAD")
	private String cidad;
	
	@JsonProperty("CMPLO_ENDER")
	private String cmploEnder;
	
	@JsonProperty("CONTT")
	private String contt;
	
	@JsonProperty("CPF_CNPJ")
	private String cpfCnpj;
	
	@JsonProperty("DT_ALTER")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	private Date dtAlter;
	
	@JsonProperty("DT_INCLS")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	private Date dtIncls;
	
	@JsonProperty("EMAIL")
	private String email;
	
	@JsonProperty("ENDER")
	private String ender;
	
	@JsonProperty("ESTAD")
	private String estad;
	
	@JsonProperty("IC_LOCAL_DOMCL")
	private String icLocalDomcl;
	
	@JsonProperty("ID_PN")
	private Long idPn;
	
	@JsonProperty("ID_TIPO_PN")
	private Integer idTipoPn;
	
	@JsonProperty("NM_FANTS")
	private String nmFants;
	
	@JsonProperty("NM_RAZAO_SOCAL")
	private String nmRazaoSocal;
	
	@JsonProperty("ST")
	private String st;
	
	@JsonProperty("TP_PESOA")
	private String tpPesoa;
	
	@JsonProperty("USURO_INCLS")
	private String usuroIncls;
	
	@JsonProperty("DS_TIPO_PN")
	private String dsTipoPn;

	public String getCodigoPn() {
		return codigoPn;
	}

	public void setCodigoPn(String codigoPn) {
		this.codigoPn = codigoPn;
	}

	public String getBairr() {
		return bairr;
	}

	public void setBairr(String bairr) {
		this.bairr = bairr;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidad() {
		return cidad;
	}

	public void setCidad(String cidad) {
		this.cidad = cidad;
	}

	public String getCmploEnder() {
		return cmploEnder;
	}

	public void setCmploEnder(String cmploEnder) {
		this.cmploEnder = cmploEnder;
	}

	public String getContt() {
		return contt;
	}

	public void setContt(String contt) {
		this.contt = contt;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public Date getDtAlter() {
		return dtAlter;
	}

	public void setDtAlter(Date dtAlter) {
		this.dtAlter = dtAlter;
	}

	public Date getDtIncls() {
		return dtIncls;
	}

	public void setDtIncls(Date dtIncls) {
		this.dtIncls = dtIncls;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEnder() {
		return ender;
	}

	public void setEnder(String ender) {
		this.ender = ender;
	}

	public String getEstad() {
		return estad;
	}

	public void setEstad(String estad) {
		this.estad = estad;
	}

	public String getIcLocalDomcl() {
		return icLocalDomcl;
	}

	public void setIcLocalDomcl(String icLocalDomcl) {
		this.icLocalDomcl = icLocalDomcl;
	}

	public Long getIdPn() {
		return idPn;
	}

	public void setIdPn(Long idPn) {
		this.idPn = idPn;
	}

	public Integer getIdTipoPn() {
		return idTipoPn;
	}

	public void setIdTipoPn(Integer idTipoPn) {
		this.idTipoPn = idTipoPn;
	}

	public String getNmFants() {
		return nmFants;
	}

	public void setNmFants(String nmFants) {
		this.nmFants = nmFants;
	}

	public String getNmRazaoSocal() {
		return nmRazaoSocal;
	}

	public void setNmRazaoSocal(String nmRazaoSocal) {
		this.nmRazaoSocal = nmRazaoSocal;
	}

	public String getSt() {
		return st;
	}

	public void setSt(String st) {
		this.st = st;
	}

	public String getTpPesoa() {
		return tpPesoa;
	}

	public void setTpPesoa(String tpPesoa) {
		this.tpPesoa = tpPesoa;
	}

	public String getUsuroIncls() {
		return usuroIncls;
	}

	public void setUsuroIncls(String usuroIncls) {
		this.usuroIncls = usuroIncls;
	}

	public String getDsTipoPn() {
		return dsTipoPn;
	}

	public void setDsTipoPn(String dsTipoPn) {
		this.dsTipoPn = dsTipoPn;
	}
	

}

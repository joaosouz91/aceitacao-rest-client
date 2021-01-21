package br.com.tokiomarine.seguradora.aceitacao.rest.client.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import br.com.tokiomarine.seguradora.aceitacao.rest.client.util.JsonConverterDate;

@JsonAutoDetect
@JsonIgnoreProperties(ignoreUnknown=true)
public class DevolverFUpTituloRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 372361789781367202L;

	private String ccodusuario;
	
	private String cnumtitulo;
	
	@JsonSerialize(using = JsonConverterDate.class)
	private Date ddtrecusa;
	
	private String cindoperacao;
	
	private Long nidformapago;
	
	private String cformapago;

	public String getCcodusuario() {
		return ccodusuario;
	}

	public void setCcodusuario(String ccodusuario) {
		this.ccodusuario = ccodusuario;
	}

	public String getCnumtitulo() {
		return cnumtitulo;
	}

	public void setCnumtitulo(String cnumtitulo) {
		this.cnumtitulo = cnumtitulo;
	}

	public Date getDdtrecusa() {
		return ddtrecusa;
	}

	public void setDdtrecusa(Date ddtrecusa) {
		this.ddtrecusa = ddtrecusa;
	}

	public String getCindoperacao() {
		return cindoperacao;
	}

	public void setCindoperacao(String cindoperacao) {
		this.cindoperacao = cindoperacao;
	}

	public Long getNidformapago() {
		return nidformapago;
	}

	public void setNidformapago(Long nidformapago) {
		this.nidformapago = nidformapago;
	}

	public String getCformapago() {
		return cformapago;
	}

	public void setCformapago(String cformapago) {
		this.cformapago = cformapago;
	}
}

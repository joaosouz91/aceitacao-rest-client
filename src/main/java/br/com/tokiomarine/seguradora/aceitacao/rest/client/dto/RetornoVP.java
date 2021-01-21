package br.com.tokiomarine.seguradora.aceitacao.rest.client.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class RetornoVP implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7264180968782851427L;
	
	private String obrigatoriaVP; 
	private String permiteAgendamento; 
	private Long codRetorno; 
	private Long numCalculo; 
	private Long idVP; 
	private String icPiloto; 
	private String mensagem; 
	private String codigoVoucher; 
	private String[] mensagensTela; 
	private String[] mensagensPDF; 

	public String getObrigatoriaVP() { 
		return obrigatoriaVP;
	}
	public String getPermiteAgendamento() { 
		return permiteAgendamento;
	}
	public Long getCodRetorno() { 
		return codRetorno;
	}
	public Long getNumCalculo() { 
		return numCalculo;
	}
	public Long getIdVP() { 
		return idVP;
	}
	public String getIcPiloto() { 
		return icPiloto;
	}
	public String getMensagem() { 
		return mensagem;
	}
	public String getCodigoVoucher() { 
		return codigoVoucher;
	}
	public String[] getMensagensTela() { 
		return mensagensTela;
	}
	public String[] getMensagensPDF() { 
		return mensagensPDF;
	}

	public void setObrigatoriaVP( String obrigatoriaVP ) { 
		this.obrigatoriaVP = obrigatoriaVP;
	}
	public void setPermiteAgendamento( String permiteAgendamento ) { 
		this.permiteAgendamento = permiteAgendamento;
	}
	public void setCodRetorno( Long codRetorno ) { 
		this.codRetorno = codRetorno;
	}
	public void setNumCalculo( Long numCalculo ) { 
		this.numCalculo = numCalculo;
	}
	public void setIdVP( Long idVP ) { 
		this.idVP = idVP;
	}
	public void setIcPiloto( String icPiloto ) { 
		this.icPiloto = icPiloto;
	}
	public void setMensagem( String mensagem ) { 
		this.mensagem = mensagem;
	}
	public void setCodigoVoucher( String codigoVoucher ) { 
		this.codigoVoucher = codigoVoucher;
	}
	public void setMensagensTela( String[] mensagensTela ) { 
		this.mensagensTela = mensagensTela;
	}
	public void setMensagensPDF( String[] mensagensPDF ) { 
		this.mensagensPDF = mensagensPDF;
	}

}


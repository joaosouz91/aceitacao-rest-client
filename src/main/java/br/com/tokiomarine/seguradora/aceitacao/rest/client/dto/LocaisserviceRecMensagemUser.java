package br.com.tokiomarine.seguradora.aceitacao.rest.client.dto;
import java.math.BigDecimal;

public class LocaisserviceRecMensagemUser {
	private String chaveNext; 
	private String mensagemRetorno; 
	private BigDecimal qtdeOcorrencias; 
	private BigDecimal statusRetorno; 

	public String getChaveNext() { 
		return chaveNext;
	}
	public String getMensagemRetorno() { 
		return mensagemRetorno;
	}
	public BigDecimal getQtdeOcorrencias() { 
		return qtdeOcorrencias;
	}
	public BigDecimal getStatusRetorno() { 
		return statusRetorno;
	}

	public void setChaveNext( String chaveNext ) { 
		this.chaveNext = chaveNext;
	}
	public void setMensagemRetorno( String mensagemRetorno ) { 
		this.mensagemRetorno = mensagemRetorno;
	}
	public void setQtdeOcorrencias( BigDecimal qtdeOcorrencias ) { 
		this.qtdeOcorrencias = qtdeOcorrencias;
	}
	public void setStatusRetorno( BigDecimal statusRetorno ) { 
		this.statusRetorno = statusRetorno;
	}

}


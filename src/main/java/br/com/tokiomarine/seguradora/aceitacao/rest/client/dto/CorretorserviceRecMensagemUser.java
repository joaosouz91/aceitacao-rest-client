package br.com.tokiomarine.seguradora.aceitacao.rest.client.dto;
import java.math.BigDecimal;

public class CorretorserviceRecMensagemUser {
	private String mensagemRetorno; 
	private String proximaChave; 
	private BigDecimal qtdeOcorrencias; 
	private BigDecimal statusRetorno; 

	public String getMensagemRetorno() { 
		return mensagemRetorno;
	}
	public String getProximaChave() { 
		return proximaChave;
	}
	public BigDecimal getQtdeOcorrencias() { 
		return qtdeOcorrencias;
	}
	public BigDecimal getStatusRetorno() { 
		return statusRetorno;
	}

	public void setMensagemRetorno( String mensagemRetorno ) { 
		this.mensagemRetorno = mensagemRetorno;
	}
	public void setProximaChave( String proximaChave ) { 
		this.proximaChave = proximaChave;
	}
	public void setQtdeOcorrencias( BigDecimal qtdeOcorrencias ) { 
		this.qtdeOcorrencias = qtdeOcorrencias;
	}
	public void setStatusRetorno( BigDecimal statusRetorno ) { 
		this.statusRetorno = statusRetorno;
	}

}


package br.com.tokiomarine.seguradora.aceitacao.rest.client.dto;

import br.com.tokiomarine.seguradora.aceitacao.rest.client.util.ModelResponse;

public class LocaisServiceUser_pGetLocais_Out implements ModelResponse{
	
	private static final long serialVersionUID = 8010566235224629370L;
	
	private Acxcdpa0020001RecLocaisUser[] polocaisOut; 
	private LocaisserviceRecMensagemUser pomensagemOut; 

	public Acxcdpa0020001RecLocaisUser[] getPolocaisOut() { 
		return polocaisOut;
	}
	public LocaisserviceRecMensagemUser getPomensagemOut() { 
		return pomensagemOut;
	}

	public void setPolocaisOut( Acxcdpa0020001RecLocaisUser[] polocaisOut ) { 
		this.polocaisOut = polocaisOut;
	}
	public void setPomensagemOut( LocaisserviceRecMensagemUser pomensagemOut ) { 
		this.pomensagemOut = pomensagemOut;
	}

}


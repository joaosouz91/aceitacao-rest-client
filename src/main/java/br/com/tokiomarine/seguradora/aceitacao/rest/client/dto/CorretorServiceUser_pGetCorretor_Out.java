package br.com.tokiomarine.seguradora.aceitacao.rest.client.dto;

import br.com.tokiomarine.seguradora.aceitacao.rest.client.util.ModelResponse;

public class CorretorServiceUser_pGetCorretor_Out implements ModelResponse{
	
	private static final long serialVersionUID = 316483545891595193L;
	
	private CorretorserviceRecMensagemUser pomensagemOut; 
	private Corretor[] poregOut; 

	public CorretorserviceRecMensagemUser getPomensagemOut() { 
		return pomensagemOut;
	}
	public Corretor[] getPoregOut() { 
		return poregOut;
	}

	public void setPomensagemOut( CorretorserviceRecMensagemUser pomensagemOut ) { 
		this.pomensagemOut = pomensagemOut;
	}
	public void setPoregOut( Corretor[] poregOut ) { 
		this.poregOut = poregOut;
	}
}


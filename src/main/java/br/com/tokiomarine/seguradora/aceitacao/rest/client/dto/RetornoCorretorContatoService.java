package br.com.tokiomarine.seguradora.aceitacao.rest.client.dto;

import br.com.tokiomarine.seguradora.aceitacao.rest.client.util.ModelResponse;

public class RetornoCorretorContatoService implements ModelResponse{
		
	private static final long serialVersionUID = 8222183649381835443L;
	
	private CorretorContato[] corretor; 
	private MensagemCorretorService mensagem; 

	public CorretorContato[] getCorretor() { 
		return corretor;
	}
	public MensagemCorretorService getMensagem() { 
		return mensagem;
	}

	public void setCorretor( CorretorContato[] corretor ) { 
		this.corretor = corretor;
	}
	public void setMensagem( MensagemCorretorService mensagem ) { 
		this.mensagem = mensagem;
	}

}


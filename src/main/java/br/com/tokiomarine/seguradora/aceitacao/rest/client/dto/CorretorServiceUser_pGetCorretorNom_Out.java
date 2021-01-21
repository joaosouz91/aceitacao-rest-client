package br.com.tokiomarine.seguradora.aceitacao.rest.client.dto;

import java.io.Serializable;

public class CorretorServiceUser_pGetCorretorNom_Out implements Serializable {
	
	  private static final long serialVersionUID = 1L;
	  private CorretorserviceRecMensagemUser pomensagemOut;
	  private Corretor[] poregOut;

	  public CorretorserviceRecMensagemUser getPomensagemOut()
	  {
	    return this.pomensagemOut;
	  }

	  public Corretor[] getPoregOut()
	  {
	    return this.poregOut;
	  }

	  public void setPomensagemOut(CorretorserviceRecMensagemUser pomensagemOut)
	  {
	    this.pomensagemOut = pomensagemOut;
	  }

	  public void setPoregOut(Corretor[] poregOut)
	  {
	    this.poregOut = poregOut;
	  }

}

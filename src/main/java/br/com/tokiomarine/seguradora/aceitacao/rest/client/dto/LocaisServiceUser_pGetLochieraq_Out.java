package br.com.tokiomarine.seguradora.aceitacao.rest.client.dto;

import java.io.Serializable;

public class LocaisServiceUser_pGetLochieraq_Out implements Serializable {
  		  
	private static final long serialVersionUID = -8748166219325321845L;

	private Acxcdpa0020001RecLocHieraUser[] polochierarqOut;
	private LocaisserviceRecMensagemUser pomensagemOut;

	public Acxcdpa0020001RecLocHieraUser[] getPolochierarqOut() {
		return this.polochierarqOut;
	}

	public LocaisserviceRecMensagemUser getPomensagemOut() {
		return this.pomensagemOut;
	}

	public void setPolochierarqOut(Acxcdpa0020001RecLocHieraUser[] polochierarqOut) {
		this.polochierarqOut = polochierarqOut;
	}

	public void setPomensagemOut(LocaisserviceRecMensagemUser pomensagemOut) {
		this.pomensagemOut = pomensagemOut;
	}
}
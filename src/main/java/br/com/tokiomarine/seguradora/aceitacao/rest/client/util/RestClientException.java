
package br.com.tokiomarine.seguradora.aceitacao.rest.client.util;

import org.springframework.stereotype.Component;

@Component
public class RestClientException extends Exception{
	
	private static final long serialVersionUID = 668760324371246575L;

	public RestClientException() {
		super();
	}

	public RestClientException(String message,Throwable cause) {
		super(message,cause);
	}

	public RestClientException(String message) {
		super(message);
	}

	public RestClientException(Throwable cause) {
		super(cause);
	}

}
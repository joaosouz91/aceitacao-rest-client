
package br.com.tokiomarine.seguradora.aceitacao.rest.client.util;

import java.util.LinkedList;

public class RestClientParameter {
	
	private LinkedList<Object> parameters;
	
	public RestClientParameter() {
		parameters = new LinkedList<Object>();
	}

	public void add(Object value){
		parameters.add(value);
	}
	
	public LinkedList<Object> getParameters() {
		return parameters;
	}
}
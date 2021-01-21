package br.com.tokiomarine.seguradora.aceitacao.rest.client.ejb;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import br.com.tokiomarine.seguradora.aceitacao.rest.client.dto.ParametroRegrasVP;
import br.com.tokiomarine.seguradora.aceitacao.rest.client.dto.RetornoVP;
import br.com.tokiomarine.seguradora.aceitacao.rest.client.util.RestClientException;
import br.com.tokiomarine.seguradora.aceitacao.rest.client.util.RestClientFactory;
import br.com.tokiomarine.seguradora.aceitacao.rest.client.util.RestClientParameter;


@Lazy
@Component
public class VPRestEJBClient {
	
	@Value("${url.rest.ejb}")
	private String url;
	

	public RetornoVP verificarVP ( ParametroRegrasVP param0) throws RestClientException {

		RestClientFactory<RetornoVP> restClientFactory = new RestClientFactory<RetornoVP> (url, "br.com.tokiomarine.seguradora.ssv.regras.vistoriaprevia.bean.RegrasVPComponent", "verificarVP");

		RestClientParameter parameter = new RestClientParameter();

		parameter.add(param0);

		restClientFactory.send(parameter);

		return restClientFactory.getFromJson(RetornoVP.class);

	}

	
}
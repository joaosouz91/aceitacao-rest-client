package br.com.tokiomarine.seguradora.aceitacao.rest.client.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import br.com.tokiomarine.seguradora.aceitacao.rest.client.util.RestClientException;
import br.com.tokiomarine.seguradora.aceitacao.rest.client.util.RestClientFactory;
import br.com.tokiomarine.seguradora.aceitacao.rest.client.util.RestClientParameter;


@Lazy
@Service
public class CorretorServiceRestEJBClient{
	
	@Value("${url.rest.ejb}")
	private String url;
	
	public RetornoCorretorContatoService consultaCorretorContato (String param0, String param1) throws RestClientException {

		RestClientFactory<RetornoCorretorContatoService> restClientFactory = new RestClientFactory<RetornoCorretorContatoService> (url, "br.com.tokiomarine.seguradora.ssv.acselx.bean.CorretorService", "consultaCorretorContato");

		RestClientParameter parameter = new RestClientParameter();

		parameter.add(param0);
		parameter.add(param1);


		restClientFactory.send(parameter);

		return restClientFactory.getFromJson(RetornoCorretorContatoService.class);

	}
}
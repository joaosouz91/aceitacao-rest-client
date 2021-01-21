package br.com.tokiomarine.seguradora.aceitacao.rest.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.tokiomarine.seguradora.aceitacao.rest.client.service.ParametrosService;
import br.com.tokiomarine.seguradora.aceitacao.rest.client.util.RestClientException;

@Lazy
@Service
public class AjusteRestClient {
	
	@Autowired
	private  ParametrosService parametrosService;
	
	@Autowired
	private RestTemplate restTemplate;
	
    public void executarAjuste(Long numeroItem, Long codigoEndosso) throws RestClientException {
    	
    	String urlRestAjuste = null;
    	
    	try {
    	   urlRestAjuste = parametrosService.buscarParametroAceitacao("URL_GERA_RESTRICAO_AJUSTE");
    	   urlRestAjuste += "/" +  numeroItem;
    	   
    	   if(codigoEndosso != null){
    		   urlRestAjuste += "/" + codigoEndosso;
    	   }
	
	       ObjectMapper objectMapper = new ObjectMapper();
	       objectMapper.configure(Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
	       
	       restTemplate.getForObject(urlRestAjuste, String.class);
       
    	} catch (HttpServerErrorException ex) {
    		 throw new RestClientException("Erro executar ajuste, URL:" + urlRestAjuste + " - StatusCode:" + ex.getStatusCode());
    	} catch(Exception ex){
            throw new RestClientException("Erro executar ajuste, URL:" + urlRestAjuste, ex);
        }
      
    }
    
    public void executarAjusteNovo(final Long idRestr) throws RestClientException {
    	
    	String urlRestAjuste = null;
    	
    	try {
    	   urlRestAjuste = parametrosService.buscarParametroAceitacao("URL_GERA_AJUSTE");
    	   urlRestAjuste += "/" +  idRestr;
    	       	   
    	   HttpHeaders headers = new HttpHeaders();
           headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
           headers.setContentType(MediaType.APPLICATION_JSON);
    	   
           final HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
           final ResponseEntity<String> response = restTemplate.exchange(urlRestAjuste, HttpMethod.GET, entity, String.class);
           
    	} catch (HttpServerErrorException ex) {    		
    		 throw new RestClientException("Erro executar ajuste, URL:" + urlRestAjuste + " - StatusCode:" + ex.getStatusCode());
    	} catch(Exception ex){    		
            throw new RestClientException("Erro executar ajuste, URL:" + urlRestAjuste, ex);            
        }
      
    }
}
package br.com.tokiomarine.seguradora.aceitacao.rest.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.tokiomarine.seguradora.aceitacao.rest.client.service.ParametrosService;
import br.com.tokiomarine.seguradora.aceitacao.rest.client.util.RestClientException;
import br.com.tokiomarine.seguradora.ssv.corporativa.model.Cliente;
import br.com.tokiomarine.seguradora.ssv.corporativa.model.ClientePessoaFisica;
import br.com.tokiomarine.seguradora.ssv.corporativa.model.ClientePessoaJuridica;
import br.com.tokiomarine.seguradora.ssv.corporativa.model.EnderecoCliente;
import br.com.tokiomarine.seguradora.ssv.corporativa.model.TelefoneCliente;

@Lazy
@Service
public class ClienteRestClient {
	
	@Autowired
	private  ParametrosService parametrosService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	private RestClientException trataHttpServerErrorException(HttpServerErrorException ex) {
 	   HttpHeaders headers = ex.getResponseHeaders();
	   
 	   List<String> headerList = headers.get("tracererro");
 	   
 	   String msg = (headerList != null && headerList.size() > 0)?headerList.get(0):"";
 	   
 	   return new RestClientException(msg);   
	}
	
    public Cliente consultaCliente(Long codigoCliente) throws RestClientException {
    	
    	String urlRestCliente = null;
    	
    	try {
    	   urlRestCliente = parametrosService.buscarParametroAceitacao("URL.REST.CLIENTE");
    	   urlRestCliente += "/rest/cliente/consultarCliente/"+codigoCliente;
	        

	
	       ObjectMapper objectMapper = new ObjectMapper();
	       objectMapper.configure(Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
	        
	       return restTemplate.getForObject(urlRestCliente, Cliente.class);

      
    	} catch (HttpServerErrorException ex) {
    		throw trataHttpServerErrorException(ex);   
    	} catch(Exception ex){
            throw new RestClientException("Erro consulta cliente, URL:" + urlRestCliente, ex);
        }
      
    }
    
	public Long retornaCpfCnpjCliente(Long codigoCliente) throws RestClientException {

	    Cliente cliente = consultaCliente(codigoCliente);

	    if (cliente != null) {
	        if (cliente.getTpPesoa().equals("F")) {
	            return consultarClientePessoaFisica(codigoCliente).getNrCpf();
	        }
	        if (cliente.getTpPesoa().equals("J")) {
	            return consultarClientePessoaJuridica(codigoCliente).getNrCnpj();
	        }
	    }

	    return 0L;
	}
	
    public ClientePessoaFisica consultarClientePessoaFisica(Long codigoCliente) throws RestClientException {
    	
    	String urlRestCliente = null;
    	
    	try {
    		urlRestCliente = parametrosService.buscarParametroAceitacao("URL.REST.CLIENTE");
    		urlRestCliente += "/rest/clientePessoaFisica/consultarClientePessoaFisica/"+codigoCliente;
	
	       ObjectMapper objectMapper = new ObjectMapper();
	       objectMapper.configure(Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
	        
	       return restTemplate.getForObject(urlRestCliente, ClientePessoaFisica.class);
	       
    	}
    	catch (HttpServerErrorException ex) {
    		throw trataHttpServerErrorException(ex);   
    	} 
    	catch(Exception ex){
            throw new RestClientException("Erro consulta cliente pessoa fisica, URL:" + urlRestCliente, ex);
        }
    }

    public ClientePessoaJuridica consultarClientePessoaJuridica(Long codigoCliente) throws RestClientException {
    	String urlRestCliente = null;
    	
    	try {
    	   urlRestCliente = parametrosService.buscarParametroAceitacao("URL.REST.CLIENTE");
    	   urlRestCliente += "/rest/clientePessoaJuridica/consultarClientePessoaJuridica/"+codigoCliente;
	
	       ObjectMapper objectMapper = new ObjectMapper();
	       objectMapper.configure(Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
	        
	       return restTemplate.getForObject(urlRestCliente, ClientePessoaJuridica.class);
	       
    	}
    	catch (HttpServerErrorException ex) {
    		throw trataHttpServerErrorException(ex);   
    	} 
    	catch(Exception ex){
            throw new RestClientException("Erro consulta cliente pessoa juridica, URL:" + urlRestCliente, ex);
        }
    }

    
    public EnderecoCliente consultarEndereco(Long codigoCliente, Long idEndereco) throws RestClientException {
    	String urlRestCliente = null;
    	
    	try {
    		urlRestCliente = parametrosService.buscarParametroAceitacao("URL.REST.CLIENTE");
    		urlRestCliente += "/rest/enderecoCliente/consultarEndereco/"+codigoCliente+"/"+idEndereco;

	       ObjectMapper objectMapper = new ObjectMapper();
	       objectMapper.configure(Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
	        
	       return restTemplate.getForObject(urlRestCliente, EnderecoCliente.class);
	       
    	} 
    	catch (HttpServerErrorException ex) {
    		throw  trataHttpServerErrorException(ex);   
    	}     	
    	catch(Exception ex){
            throw new RestClientException("Erro consultar endereco do cliente, URL:" + urlRestCliente, ex);
        }
    }

    public TelefoneCliente consultarTelefonePorTipo(Long codigoCliente, Long tipoTelefone) throws RestClientException {
    	String urlRestCliente = null;
    	
    	try {
    		urlRestCliente = parametrosService.buscarParametroAceitacao("URL.REST.CLIENTE");
    		urlRestCliente += "/rest/telefoneCliente/consultarTelefone/"+codigoCliente+"/"+tipoTelefone;
	        
	       ObjectMapper objectMapper = new ObjectMapper();
	       objectMapper.configure(Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
	        
	       return restTemplate.getForObject(urlRestCliente, TelefoneCliente.class);
	       
    	}
    	catch (HttpServerErrorException ex) {
    		throw  trataHttpServerErrorException(ex);   
    	}     	
    	catch(Exception ex){
            throw new RestClientException("Erro consultar telefone do cliente, URL:" + urlRestCliente, ex);
        }
    }

    public Long formaDevolucaoAutomaticaNegocio(Long codigoCliente, Long codigoNegocio) throws RestClientException {
    	String urlRestCliente = null;
    	
    	try {
    		urlRestCliente = parametrosService.buscarParametroAceitacao("URL.REST.CLIENTE");
    		urlRestCliente += "/rest/formaDevolucao/formaDevolucaoAutomatica/"+codigoCliente+"/"+codigoNegocio;
	        
	       ObjectMapper objectMapper = new ObjectMapper();
	       objectMapper.configure(Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
	        
	       return restTemplate.getForObject(urlRestCliente, Long.class);
	       
    	}
    	catch (HttpServerErrorException ex) {
    		throw trataHttpServerErrorException(ex);   
    	}     	
    	catch(Exception ex){
            throw new RestClientException("Erro consultar forma devolucao automatica do negocio, URL:" + urlRestCliente, ex);
        }
    }

    public Long formaDevolucaoAutomaticaEndosso(Long codigoCliente, Long codigoEndosso) throws RestClientException {
    	String urlRestCliente = null;
    	
    	try {
    		urlRestCliente = parametrosService.buscarParametroAceitacao("URL.REST.CLIENTE");
    		urlRestCliente += "/rest/formaDevolucao/formaDevolucaoEndossoAutomatica/"+codigoCliente+"/"+codigoEndosso;

	       ObjectMapper objectMapper = new ObjectMapper();
	       objectMapper.configure(Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
	        
	       return restTemplate.getForObject(urlRestCliente, Long.class);
	       
    	}
    	catch (HttpServerErrorException ex) {
    		throw trataHttpServerErrorException(ex);   
    	}     	
    	catch(Exception ex){
            throw new RestClientException("Erro consultar forma devolucao automatica do endosso, URL:" + urlRestCliente, ex);
        }
   	
    }
}

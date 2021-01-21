package br.com.tokiomarine.seguradora.aceitacao.rest.client.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

@Lazy
@Configuration
public class RestTemplateConfiguration {
	
	
    @Bean
    @Scope(value="prototype") 
    public RestTemplate restTemplate()
    {
        HttpComponentsClientHttpRequestFactory httpRequestFactory = new HttpComponentsClientHttpRequestFactory();         
        httpRequestFactory.setConnectionRequestTimeout(900000);
        httpRequestFactory.setConnectTimeout(900000);
        httpRequestFactory.setReadTimeout(900000);
        
        
        RestTemplate restTemplate =  new RestTemplate(httpRequestFactory);
 	    restTemplate.getMessageConverters().clear();
	    restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
        
        return restTemplate;
    }    
}

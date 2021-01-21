package br.com.tokiomarine.seguradora.aceitacao.rest.client.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources(value = { 
		@PropertySource("classpath:application-act-rest-${tokiomarine.infra.AMBIENTE}.properties")		
	}
)
public class ConfiguracaoAceitacaoRestClientPropriedades{
}
package br.com.tokiomarine.aceitacao.rest.client.aceitacaorestclient;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import br.com.tokiomarine.seguradora.aceitacao.rest.client.BURestClient;
import br.com.tokiomarine.seguradora.aceitacao.rest.client.app.AceitacaoRestClientApplication;
import br.com.tokiomarine.seguradora.aceitacao.rest.client.dto.BuAssessoriaResponse;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = AceitacaoRestClientApplication.class)
@TestPropertySource(locations = "/application.properties")
@ContextConfiguration(classes=ConfigurationDB.class, loader=AnnotationConfigContextLoader.class)
public class BuRestClientTests {
	
	@Autowired
	private BURestClient buRestClient;
	
	@Test
	public void buRestClientTest() throws Exception {
		BuAssessoriaResponse response = buRestClient.getDadosAssessoria(870300998l);
		System.out.println(response.getBairr());
	}
}

package br.com.tokiomarine.seguradora.aceitacao.rest.client;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.tokiomarine.seguradora.aceitacao.rest.client.dto.BuAssessoriaResponse;
import br.com.tokiomarine.seguradora.aceitacao.rest.client.dto.BuCorretorOpcaoChequeResponse;
import br.com.tokiomarine.seguradora.aceitacao.rest.client.dto.BuCorretorResponse;
import br.com.tokiomarine.seguradora.aceitacao.rest.client.service.ParametrosService;

@Lazy
@Service
public class BURestClient {
	
	@Autowired
	private  ParametrosService parametrosService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public BuAssessoriaResponse getDadosAssessoria(Long cdAssessoria) throws Exception{
		
		String urlRestBU = null;
		
	 	try {
	 		urlRestBU = parametrosService.buscarParametroAceitacao("URL_REST_BU");
	 		urlRestBU += "/qrest/parceiros/1.0/buscar/tipoPN/8/codigoPN/"+cdAssessoria;

	 		ResponseEntity<BuAssessoriaResponse[]> response = restTemplate.getForEntity(urlRestBU, BuAssessoriaResponse[].class);
	 		List<BuAssessoriaResponse> buAssessoriaArrayList = Arrays.asList(response.getBody());
	 		BuAssessoriaResponse buAssessoriaResponse = buAssessoriaArrayList.stream().findFirst().orElse(null);
	 		
	 		return buAssessoriaResponse;
	 		
		} catch(Exception ex){
	        throw new Exception("Erro URL:" + urlRestBU, ex);
	    }
	}
	
	public BuCorretorResponse getDadosPorTipoPn(String codigoPN, String idTipoPN) throws Exception{
		
		String urlRestBU = null;
		
		try {
			urlRestBU = parametrosService.buscarParametroAceitacao("URL_REST_BU");
			urlRestBU += "/qrest/parceiros/1.0/buscar/tipoPN/"+idTipoPN+"/codigoPN/"+codigoPN;
			
			ResponseEntity<BuCorretorResponse[]> response = restTemplate.getForEntity(urlRestBU, BuCorretorResponse[].class);
			List<BuCorretorResponse> buCorretorArrayList = Arrays.asList(response.getBody());
			BuCorretorResponse buCorretorResponse = buCorretorArrayList.stream().findFirst().orElse(null);
			
			return buCorretorResponse;
			
		} catch(Exception ex){
			throw new Exception("Erro URL:" + urlRestBU, ex);
		}
	}
	
	public BuCorretorResponse getDadosCorretor(String idTipoPN,String codigoPN) throws Exception{
		
		String urlRestBU = null;
		
		try {
			urlRestBU = parametrosService.buscarParametroAceitacao("URL_REST_BU");
			urlRestBU += "/qrest/corretor/1.0/buscar/tipoPN/"+idTipoPN+"/codigoPN/"+codigoPN;
			
			ResponseEntity<BuCorretorResponse[]> response = restTemplate.getForEntity(urlRestBU, BuCorretorResponse[].class);
			List<BuCorretorResponse> buCorretorArrayList = Arrays.asList(response.getBody());
			BuCorretorResponse buCorretorResponse = buCorretorArrayList.stream().findFirst().orElse(null);
			
			return buCorretorResponse;
			
		} catch(Exception ex){
			throw new Exception("Erro URL:" + urlRestBU, ex);
		}
	}
	
	
	public BuCorretorOpcaoChequeResponse getDadosCorretorOpcaoCheque(String cdCrtor) throws Exception{
		
		String urlRestBU = null;
		
		try {
			urlRestBU = parametrosService.buscarParametroAceitacao("URL_REST_BU");
			urlRestBU += "/qrest/corretores/1.0/opcao-cheque/codigoCorretor/"+cdCrtor;

			ResponseEntity<BuCorretorOpcaoChequeResponse[]> response = restTemplate.getForEntity(urlRestBU, BuCorretorOpcaoChequeResponse[].class);
			List<BuCorretorOpcaoChequeResponse> buCorretorArrayList = Arrays.asList(response.getBody());
			BuCorretorOpcaoChequeResponse buCorretorOpChequeResponse = buCorretorArrayList.stream().findFirst().orElse(null);
			
			return buCorretorOpChequeResponse;
			
		} catch(Exception ex){
			throw new Exception("Erro URL:" + urlRestBU, ex);
		}
	}
}

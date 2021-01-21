package br.com.tokiomarine.seguradora.aceitacao.rest.client.ejb;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import br.com.tokiomarine.seguradora.aceitacao.rest.client.dto.CorretorServiceUser_pGetCorretorNom_Out;
import br.com.tokiomarine.seguradora.aceitacao.rest.client.dto.CorretorServiceUser_pGetCorretor_Out;
import br.com.tokiomarine.seguradora.aceitacao.rest.client.dto.LocaisServiceUser_pGetLocais_Out;
import br.com.tokiomarine.seguradora.aceitacao.rest.client.dto.LocaisServiceUser_pGetLochieraq_Out;
import br.com.tokiomarine.seguradora.aceitacao.rest.client.dto.PSDataServiceUserAvaliarDataOut;
import br.com.tokiomarine.seguradora.aceitacao.rest.client.util.RestClientException;
import br.com.tokiomarine.seguradora.aceitacao.rest.client.util.RestClientFactory;
import br.com.tokiomarine.seguradora.aceitacao.rest.client.util.RestClientParameter;


@Lazy
@Component
public class AcselXRestEJBClient{
	
	@Value("${url.rest.ejb}")
	private String url;
	

    public Long getAssessoriaCorretor(String codigoCorretor) throws RestClientException {

        RestClientFactory<Long> restClientFactory = new RestClientFactory<Long>(url, "br.com.tokiomarine.seguradora.ssv.gerenciador.bean.AcselxCorretorComponent", "getAssessoriaCorretor");

        RestClientParameter parameter = new RestClientParameter();
        parameter.add(codigoCorretor);

        restClientFactory.send(parameter);

        return restClientFactory.getFromJson(Long.class);
    }

    public String getDescricaoLocalCaptador(String codigoLocalCaptador) throws RestClientException {

        RestClientFactory<String> restClientFactory = new RestClientFactory<String>(url, "br.com.tokiomarine.seguradora.ssv.gerenciador.bean.AcselxLocalCaptadorComponent", "getDescricaoLocalCaptador");

        RestClientParameter parameter = new RestClientParameter();
        parameter.add(codigoLocalCaptador);

        restClientFactory.send(parameter);

        return restClientFactory.getFromJson(String.class);
    }

	public CorretorServiceUser_pGetCorretor_Out consultaCorretor ( String param0, Long param1, Long param2, Long param3) throws RestClientException {

		RestClientFactory<CorretorServiceUser_pGetCorretor_Out> restClientFactory = new RestClientFactory<CorretorServiceUser_pGetCorretor_Out> (url, "br.com.tokiomarine.seguradora.ssv.acselx.ws.bean.CorretorService", "consultaCorretor");

		RestClientParameter parameter = new RestClientParameter();

		parameter.add(param0);
		parameter.add(param1);
		parameter.add(param2);
		parameter.add(param3);

		restClientFactory.send(parameter);

		return restClientFactory.getFromJson(CorretorServiceUser_pGetCorretor_Out.class);

	}

	public LocaisServiceUser_pGetLocais_Out consultaLocais ( String param0, Long param1, Long param2, Long param3) throws RestClientException {

		RestClientFactory<LocaisServiceUser_pGetLocais_Out> restClientFactory = new RestClientFactory<LocaisServiceUser_pGetLocais_Out> (url, "br.com.tokiomarine.seguradora.ssv.acselx.ws.bean.LocaisService", "consultaLocais");

		RestClientParameter parameter = new RestClientParameter();

		parameter.add(param0);
		parameter.add(param1);
		parameter.add(param2);
		parameter.add(param3);

		restClientFactory.send(parameter);

		return restClientFactory.getFromJson(LocaisServiceUser_pGetLocais_Out.class);

	}
	
	public LocaisServiceUser_pGetLochieraq_Out consultaLocaisHierarquicos(String param0, Long param1, Long param2) throws RestClientException{
		RestClientFactory<LocaisServiceUser_pGetLochieraq_Out> restClientFactory = new RestClientFactory<LocaisServiceUser_pGetLochieraq_Out> (url, "br.com.tokiomarine.seguradora.ssv.acselx.ws.bean.LocaisService", "consultaLocaisHierarquicos");

		RestClientParameter parameter = new RestClientParameter();
		parameter.add(param0);
		parameter.add(param1);
		parameter.add(param2);

		restClientFactory.send(parameter);

		return restClientFactory.getFromJson(LocaisServiceUser_pGetLochieraq_Out.class);

	}

	public String descricaoSucursal(String codigoSucursal) throws RestClientException {
		RestClientFactory<String> restClientFactory = new RestClientFactory<String> (url, "br.com.tokiomarine.seguradora.ssv.gerenciador.bean.AcselxSucursalComponent", "descricaoSucursal");

		RestClientParameter parameter = new RestClientParameter();

		parameter.add(codigoSucursal);

		restClientFactory.send(parameter);

		return restClientFactory.getFromJson(String.class);
	}
	
    public PSDataServiceUserAvaliarDataOut avaliarData(Calendar calendar, String codigoPais) throws RestClientException {
    	
        RestClientFactory<PSDataServiceUserAvaliarDataOut> restClientFactory = new RestClientFactory<PSDataServiceUserAvaliarDataOut>(url, "br.com.tokiomarine.seguradora.ssv.acselx.ws.bean.PSDataService", "avaliarData");
        try{
	        RestClientParameter parameter = new RestClientParameter();
	        parameter.add(calendar);
	        parameter.add(codigoPais);
	        parameter.add("");
	        parameter.add("");

        	restClientFactory.send(parameter);
        }catch (Exception e) {
			e.printStackTrace(); 
		}
        
		return restClientFactory.getFromJson(PSDataServiceUserAvaliarDataOut.class);        
    }
    
    public CorretorServiceUser_pGetCorretorNom_Out consultaCorretorNome(String nomeCorretor) throws RestClientException {
    	
    	 RestClientFactory<CorretorServiceUser_pGetCorretorNom_Out> restClientFactory = new RestClientFactory<CorretorServiceUser_pGetCorretorNom_Out>(url, "br.com.tokiomarine.seguradora.ssv.acselx.ws.bean.CorretorService", "consultaCorretorNome");
    	 RestClientParameter parameter = new RestClientParameter();
    	 
    	 parameter.add(nomeCorretor.toUpperCase());
    	 parameter.add("");
    	 parameter.add(50L);
    	 
    	 restClientFactory.send(parameter);
    	 
    	return restClientFactory.getFromJson(CorretorServiceUser_pGetCorretorNom_Out.class);    	
    }
}
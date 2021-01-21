package br.com.tokiomarine.seguradora.aceitacao.rest.client;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import br.com.tokiomarine.seguradora.aceitacao.rest.client.dto.AvaliarDataRequest;
import br.com.tokiomarine.seguradora.aceitacao.rest.client.dto.AvaliarDataResponse;
import br.com.tokiomarine.seguradora.aceitacao.rest.client.dto.CalcularDataRequest;
import br.com.tokiomarine.seguradora.aceitacao.rest.client.dto.CalcularDataResponse;
import br.com.tokiomarine.seguradora.aceitacao.rest.client.dto.CalcularValorCorrecaoServiceRequest;
import br.com.tokiomarine.seguradora.aceitacao.rest.client.dto.CalcularValorCorrecaoServiceResponse;
import br.com.tokiomarine.seguradora.aceitacao.rest.client.dto.CalculoDataRequest;
import br.com.tokiomarine.seguradora.aceitacao.rest.client.dto.CalculoDataResponse;
import br.com.tokiomarine.seguradora.aceitacao.rest.client.dto.CancelaTituloSSVRequest;
import br.com.tokiomarine.seguradora.aceitacao.rest.client.dto.CancelaTituloSSVResponse;
import br.com.tokiomarine.seguradora.aceitacao.rest.client.dto.ConsultaCorretorRequest;
import br.com.tokiomarine.seguradora.aceitacao.rest.client.dto.ConsultaCorretorResponse;
import br.com.tokiomarine.seguradora.aceitacao.rest.client.dto.ConsultaEmailCorretorRequest;
import br.com.tokiomarine.seguradora.aceitacao.rest.client.dto.ConsultaEmailCorretorResponse;
import br.com.tokiomarine.seguradora.aceitacao.rest.client.dto.ConsultaEmailGerenteRequest;
import br.com.tokiomarine.seguradora.aceitacao.rest.client.dto.ConsultaEmailGerenteResponse;
import br.com.tokiomarine.seguradora.aceitacao.rest.client.dto.ConsultaFollowRequest;
import br.com.tokiomarine.seguradora.aceitacao.rest.client.dto.ConsultaFollowResponse;
import br.com.tokiomarine.seguradora.aceitacao.rest.client.dto.ConsultaTituloSSVRequest;
import br.com.tokiomarine.seguradora.aceitacao.rest.client.dto.ConsultaTituloSSVResponse;
import br.com.tokiomarine.seguradora.aceitacao.rest.client.dto.DevolverFUpTituloRequest;
import br.com.tokiomarine.seguradora.aceitacao.rest.client.dto.DevolverFUpTituloResponse;
import br.com.tokiomarine.seguradora.aceitacao.rest.client.dto.IncluirTituloRequest;
import br.com.tokiomarine.seguradora.aceitacao.rest.client.dto.IncluirTituloResponse;
import br.com.tokiomarine.seguradora.aceitacao.rest.client.service.ParametrosService;
import br.com.tokiomarine.seguradora.aceitacao.rest.client.util.DateUtil;

@Lazy
@Service
public class AcselXRestClient {

    private static Logger logger = LogManager.getLogger(AcselXRestClient.class);

    @Autowired
    private ParametrosService parametrosService;

    @Value("${url.avaliar.data.request}")
    private String urlAvaliarDataRequest;
    
	@Autowired
	private RestTemplate restTemplate;
    
    private SimpleDateFormat formatarData = new SimpleDateFormat("dd/MM/yyyy"); 
        
    private String completaComZero(final Long codigoCorretor){
    	if(codigoCorretor != null){
	    	String chaveCorretor = String.valueOf(codigoCorretor);
	    	
	    	while (chaveCorretor.length() < 6) {
	    		chaveCorretor = "0" + chaveCorretor;
	    	}
	    	
	    	return chaveCorretor;	
    	}
    	
    	return "";
    }
    
    public ConsultaCorretorResponse consultaCorretor(final Long codigoCorretor) throws Exception {
        try {
        	final String chaveCorretor = completaComZero(codigoCorretor);
            final String urlWSConsultaCorretor = parametrosService.buscarParametroAceitacao("REST.ACSEL.CONSULTA.CORRETOR");
            
            ConsultaCorretorRequest consultaCorretorRequest = new ConsultaCorretorRequest();
            consultaCorretorRequest.setP_chave(chaveCorretor);
            consultaCorretorRequest.setP_op_consulta(2L);
            consultaCorretorRequest.setP_tp_acesso(1L);
            consultaCorretorRequest.setP_qtd_reg(0L);
                                   
            HttpHeaders headers = new HttpHeaders();
            headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
            headers.setContentType(MediaType.APPLICATION_JSON);
	    
            final HttpEntity<ConsultaCorretorRequest> requestBody = new HttpEntity<>(consultaCorretorRequest, headers);
                       
            final ConsultaCorretorResponse consultaCorretorResponse = restTemplate.postForObject(urlWSConsultaCorretor, requestBody, ConsultaCorretorResponse.class);
         
            return consultaCorretorResponse;
        } catch (Throwable t) {
        	logger.error("Erro ao recuperar parâmetros do WS [AcselXRestClient.consultaCorretor]. Erro: " + t.getMessage());
            throw new Exception("Erro ao recuperar parâmetros do WS [AcselXRestClient.consultaCorretor]. Erro: " + t.getMessage(), t);
        }
    }

    public ConsultaEmailCorretorResponse consultaEmailOperacional(Long codigoCorretor) throws Exception {
        try {
        	final String chaveCorretor = completaComZero(codigoCorretor);
            String urlWSConsultaEmailCorretor = parametrosService.buscarParametroAceitacao("REST.ACSEL.CONSULTA.EMAIL.OPERACIONAL");

            // Insere dados no request (POST)
            ConsultaEmailCorretorRequest consultaEmailCorretor = new ConsultaEmailCorretorRequest();
            consultaEmailCorretor.setP_codintercli(chaveCorretor);
            consultaEmailCorretor.setP_tipo_email("OPERACIONAL");

            ConsultaEmailCorretorResponse consultaEmailCorretorResponse = restTemplate.postForObject(urlWSConsultaEmailCorretor, consultaEmailCorretor, ConsultaEmailCorretorResponse.class);

            return consultaEmailCorretorResponse;

        } catch (Throwable t) {
        	logger.error("Erro ao recuperar parâmetros do WS [AcselXRestClient.consultaEmailOperacional]. Erro: " + t.getMessage());
            throw new Exception("Erro ao recuperar parâmetros do WS [AcselXRestClient.consultaEmailOperacional]. Erro: " + t.getMessage(), t);
        }
    }
    
    public ConsultaEmailCorretorResponse consultaEmailOperacionalAuto(Long codigoCorretor) throws Exception {
    	
    	try {
    		final String chaveCorretor = completaComZero(codigoCorretor);
    		String urlWSConsultaEmailCorretor = parametrosService.buscarParametroAceitacao("REST.ACSEL.CONSULTA.EMAIL.OPERACIONAL");
    		
    		// Insere dados no request (POST)
    		ConsultaEmailCorretorRequest consultaEmailCorretor = new ConsultaEmailCorretorRequest();
    		consultaEmailCorretor.setP_codintercli(chaveCorretor);
    		consultaEmailCorretor.setP_tipo_email("OPERACIONAL AUTO");
    		
    		ConsultaEmailCorretorResponse consultaEmailCorretorResponse = restTemplate.postForObject(urlWSConsultaEmailCorretor, consultaEmailCorretor, ConsultaEmailCorretorResponse.class);
    		
    		return consultaEmailCorretorResponse;
    		
    	} catch (Throwable t) {
    		logger.error("Erro ao recuperar parâmetros do WS [AcselXRestClient.consultaEmailOperacionalAuto]. Erro: " + t.getMessage());
    		throw new Exception("Erro ao recuperar parâmetros do WS [AcselXRestClient.consultaEmailOperacionalAuto]. Erro: " + t.getMessage(), t);
    	}
    }
    
    
    public ConsultaEmailCorretorResponse consultaEmailVistoriaPrevia(Long codigoCorretor) {
    	
    	try {
    		
    		final String chaveCorretor = completaComZero(codigoCorretor);
    		String urlWSConsultaEmailCorretor = parametrosService.buscarParametroAceitacao("REST.ACSEL.CONSULTA.EMAIL.OPERACIONAL");
            
         // Insere dados no request (POST)
            ConsultaEmailCorretorRequest consultaEmailCorretor = new ConsultaEmailCorretorRequest();
            consultaEmailCorretor.setP_codintercli(chaveCorretor);
            consultaEmailCorretor.setP_tipo_email("VISTORIA PREVIA");

            ConsultaEmailCorretorResponse consultaEmailCorretorResponse = restTemplate.postForObject(urlWSConsultaEmailCorretor, consultaEmailCorretor, ConsultaEmailCorretorResponse.class);

            return consultaEmailCorretorResponse;
    		
		} catch (Exception e) {
			// TODO: handle exception
		}
    	return null;
    }

    public ConsultaEmailGerenteResponse consultaEmailGerente(Long codigoCorretor) throws Exception {
        try {
        	final String chaveCorretor = completaComZero(codigoCorretor);
            String urlWSConsultaEmailCorretor = parametrosService.buscarParametroAceitacao("REST.ACSEL.CONSULTA.EMAIL.COMERCIAL");

            // Insere dados no request (POST)
            ConsultaEmailGerenteRequest consultaEmailGerenteRequest = new ConsultaEmailGerenteRequest();
            consultaEmailGerenteRequest.setP_codintercli(chaveCorretor);

            ConsultaEmailGerenteResponse consultaEmailGerenteResponse = restTemplate.postForObject(urlWSConsultaEmailCorretor, consultaEmailGerenteRequest, ConsultaEmailGerenteResponse.class);

            return consultaEmailGerenteResponse;

        } catch (Throwable t) {
        	logger.error("Erro ao recuperar parâmetros do WS [AcselXRestClient.consultaEmailGerente]. Erro: " + t.getMessage());
            throw new Exception("Erro ao recuperar parâmetros do WS [AcselXRestClient.consultaEmailGerente]. Erro: " + t.getMessage(), t);
        }
    }

    

    public CalcularValorCorrecaoServiceResponse calcularValorCorrecaoRest(Date dataInicioCorrecaoMonetaria,BigDecimal valorOriginalDevolucao,String formaPagamento) throws Exception {
        try {
            String urlWSCadastro = parametrosService.buscarParametroAceitacao("REST.ACSEL.CALCULO.DEVOLUCAO");

            CalcularValorCorrecaoServiceRequest calcularValorCorrecaoServiceRequest = new CalcularValorCorrecaoServiceRequest();
            calcularValorCorrecaoServiceRequest.setCcodcia("3");
            
            String dataIniCorr = DateUtil.cast(dataInicioCorrecaoMonetaria, "yyyy-MM-dd");
            
            calcularValorCorrecaoServiceRequest.setDdatainicorr(dataIniCorr);
            calcularValorCorrecaoServiceRequest.setNvalordevorig(valorOriginalDevolucao);
            calcularValorCorrecaoServiceRequest.setCtipopagto("PRD");
            calcularValorCorrecaoServiceRequest.setFormaPagamento(formaPagamento);

            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.configure(Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
            
            String calcularValorCorrecaoServiceString = restTemplate.postForObject(urlWSCadastro, calcularValorCorrecaoServiceRequest, String.class);
            CalcularValorCorrecaoServiceResponse calcularValorCorrecaoServiceResponse = objectMapper.readValue(calcularValorCorrecaoServiceString, CalcularValorCorrecaoServiceResponse.class);

            return calcularValorCorrecaoServiceResponse;

        } catch (Exception e) {
            throw new Exception("Erro: " + e.getMessage(), e);
        }
    }

    
    public CancelaTituloSSVResponse cancelaTituloAcselx(String tipoCancelamento, String numeroTituloSSV, String usuario, Long banco) throws Exception {
        try {
            String urlWSConsultaEmailCorretor = parametrosService.buscarParametroAceitacao("REST.ACSEL.TITULO.CANCELAR");

            // Insere dados no request (POST)
            CancelaTituloSSVRequest cancelaTituloSSVRequest = new CancelaTituloSSVRequest();
            cancelaTituloSSVRequest.setCtipocan(tipoCancelamento);
            cancelaTituloSSVRequest.setpOrigem("S");
            cancelaTituloSSVRequest.setCnumtitulossv(numeroTituloSSV);
            cancelaTituloSSVRequest.setNcodneg(0L);//Padrao
            cancelaTituloSSVRequest.setCcoduser(usuario);
            cancelaTituloSSVRequest.setCcodentfinan(completaComZero(banco));

            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.configure(Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
            
            String cancelaTituloSSVString = restTemplate.postForObject(urlWSConsultaEmailCorretor, cancelaTituloSSVRequest, String.class);
            CancelaTituloSSVResponse cancelaTituloSSVResponse = objectMapper.readValue(cancelaTituloSSVString, CancelaTituloSSVResponse.class);
            
            if(cancelaTituloSSVResponse.getCretcode().equals("99")){
            	throw new Exception("Erro no AcselX URL: " + urlWSConsultaEmailCorretor + " Retorno: Codigo: 99 Mensagem: " + cancelaTituloSSVResponse.getCdescerro());
            }
            
            return cancelaTituloSSVResponse;

        } catch (Throwable t) {
           throw new Exception("Erro ao executar metodo cancelaTituloAcselx 	[AcselXRestClient.cancelaTituloAcselx]. Erro: " + t.getMessage(), t);
        }
    }

    public IncluirTituloResponse incluirTituloSSV(IncluirTituloRequest incluirTituloRequest) throws Exception {

        try {
            String urlWSConsultaEmailCorretor = parametrosService.buscarParametroAceitacao("REST.ACSEL.TITULO.INCLUIR");

            IncluirTituloResponse incluirTituloResponse = restTemplate.postForObject(urlWSConsultaEmailCorretor, incluirTituloRequest, IncluirTituloResponse.class);

            return incluirTituloResponse;

        } catch (Throwable t) {
           throw new Exception("Erro ao executar metodo incluirTituloSSV [AcselXRestClient.incluirTituloSSV]. Erro: " + t.getMessage(), t);
        }
    }

    public ConsultaTituloSSVResponse consultarTituloSSV(String numeroTitulo, Long opcaoConsulta, Long bancoCobrador) throws Exception{

    	 try {
             String urlWSConsultaEmailCorretor = parametrosService.buscarParametroAceitacao("REST.ACSEL.TITULO.CONSULTAR");

             // Insere dados no request (POST)
             ConsultaTituloSSVRequest consultaTituloSSVRequest = new ConsultaTituloSSVRequest();
             consultaTituloSSVRequest.setP_chave(numeroTitulo);
             consultaTituloSSVRequest.setP_op_consulta(opcaoConsulta);
             consultaTituloSSVRequest.setP_codentfinan(completaComZero(bancoCobrador));
             
             ObjectMapper objectMapper = new ObjectMapper();
             objectMapper.configure(Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
             
             String consultaTituloSSVString = restTemplate.postForObject(urlWSConsultaEmailCorretor, consultaTituloSSVRequest, String.class);
             
             ConsultaTituloSSVResponse consultaTituloSSVResponse = objectMapper.readValue(consultaTituloSSVString, ConsultaTituloSSVResponse.class);
             
             if(consultaTituloSSVResponse.getCodigoRetorno().equals("99")){
            	 throw new Exception("Erro no AcselX URL: " + urlWSConsultaEmailCorretor + " Retorno: Codigo: 99 Mensagem: " + consultaTituloSSVResponse.getDescricaoCodigoRetorno());
             }
             
             return consultaTituloSSVResponse;

         } catch (Throwable t) {
        	 throw new Exception("Erro ao executar metodo consultarTituloSSV [AcselXRestClient.consultarTituloSSV]. Erro: " + t.getMessage(), t);
         }
    }

    public ConsultaFollowResponse consultaFollowUpNormal(String numeroTituloSSV, Long bancoCobrador) throws Exception{

   	 try {
        String urlWSConsultaEmailCorretor = parametrosService.buscarParametroAceitacao("REST.ACSEL.FOLLOW");

        // Insere dados no request (POST)
        ConsultaFollowRequest consultaFollowRequest = new ConsultaFollowRequest();
        consultaFollowRequest.setCcodcia("3");
        consultaFollowRequest.setCnumtitulossv(numeroTituloSSV);
        consultaFollowRequest.setCcodentfinan(completaComZero(bancoCobrador));
        
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
        
        String consultaFollowString = restTemplate.postForObject(urlWSConsultaEmailCorretor, consultaFollowRequest, String.class);
        ConsultaFollowResponse consultaFollowResponse= objectMapper.readValue(consultaFollowString, ConsultaFollowResponse.class);

        return consultaFollowResponse;
        

    } catch (Throwable t) {
    	throw new Exception("Erro ao executar metodo consultaFollowUpNormal [AcselXRestClient.consultaFollowUpNormal]. Erro: " + t.getMessage(), t);
    }
  }

    public Date calculoData(final Date dataVencimento, Long qtdeDias) throws Exception{

      	 try {
           String urlWSConsultaEmailCorretor = parametrosService.buscarParametroAceitacao("REST.ACSEL.CALCULO.DATA");

           // Insere dados no request (POST)
           CalculoDataRequest calculoDataRequest = new CalculoDataRequest();
           calculoDataRequest.setCcodciudad("");
           calculoDataRequest.setCcodestado("");
           calculoDataRequest.setCcodpais("BR");
           calculoDataRequest.setCretdiautil("N");
           calculoDataRequest.setCtipodias("U");
           calculoDataRequest.setDfec(DateUtil.cast(dataVencimento,"yyyy-MM-dd"));
           calculoDataRequest.setNqtddias(qtdeDias);
           calculoDataRequest.setNtipocalculo(1L);

           CalculoDataResponse calculoDataResponse = restTemplate.postForObject(urlWSConsultaEmailCorretor, calculoDataRequest, CalculoDataResponse.class);

           Date dataConvertida = null;

           if(null != calculoDataResponse){
        	   dataConvertida = DateUtil.cast(calculoDataResponse.getReturnFunction(),"yyyy-MM-dd");
           }

           return dataConvertida;

       } catch (Throwable t) {
           throw new Exception("Erro ao executar metodo calculoData [AcselXRestClient.calculoData]. Erro: " + t.getMessage(), t);
       }
     }
    
    public Date calcularDiasUteis(final Date dataVencimento, Long qtdeDias, Long tipo) throws Exception{
    	
    	 try {
    		 
    		 String urlWSConsultaEmailCorretorx = parametrosService.buscarParametroAceitacao("REST.CALCULAR.DATA");
             
             CalcularDataRequest calculaData = new CalcularDataRequest("", "", "BR", DateUtil.cast(dataVencimento,"dd/MM/yyyy"), qtdeDias, "S", tipo, "U");
             
             System.out.println(new Gson().toJson(calculaData));

             CalcularDataResponse calculoDataResponse = restTemplate.postForObject(urlWSConsultaEmailCorretorx, calculaData, CalcularDataResponse.class);
             
             Date dataConvertida = null;
             if(null != calculoDataResponse){
          	   dataConvertida = DateUtil.cast(calculoDataResponse.getDataCalculada(),"dd/MM/yyyy");
             }

             return dataConvertida;
			
		} catch (Exception e) {
			 throw new Exception("Erro ao executar metodo calculoData [AcselXRestClient.calculoData]. Erro: " + e.getMessage(), e);
		}	
    }

    public DevolverFUpTituloResponse devolverFupTitVi(DevolverFUpTituloRequest devolverFUpTituloRequest) throws Exception {
     	 try {
             String urlRestDevolverTitulo = parametrosService.buscarParametroAceitacao("REST.ACSEL.DEVOLVER.TITULO");

             ObjectMapper objectMapper = new ObjectMapper();
             objectMapper.configure(Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
             
             String devolverFUpTituloString = restTemplate.postForObject(urlRestDevolverTitulo, devolverFUpTituloRequest, String.class);
             DevolverFUpTituloResponse devolverFUpTituloResponse= objectMapper.readValue(devolverFUpTituloString, DevolverFUpTituloResponse.class);
             
             return devolverFUpTituloResponse;
             
         } catch (Throwable t) {
             throw new Exception("Erro ao executar metodo devolverFupTitVi [AcselXRestClient.devolverFupTitVi]. Erro: " + t.getMessage(), t);
         }             
    }
    
    //Método com erro - Utilize o metodo isFeriado
    @Deprecated
    public Date verificaDataUtil(final Date diaFechamento, final String codPais) throws Exception {
     	 try {
     		final String data = formatarData.format(diaFechamento);	          
	        final AvaliarDataRequest avaliarDataRequest = new AvaliarDataRequest("", "", codPais, data, 0L, "", 0L, "");   	        
	        final AvaliarDataResponse avaliarDataResponse = restTemplate.postForObject(urlAvaliarDataRequest, avaliarDataRequest, AvaliarDataResponse.class);
		          	          
	        Date dataConvertida = null;	          
	        if(null != avaliarDataResponse){	        	  
	          dataConvertida = formatarData.parse(avaliarDataResponse.getDataCalculada());	        	  	        	  	        	  
	        }
	          
	        return dataConvertida;	          
      } catch (Throwable t) {
          throw new Exception("Erro ao executar metodo verificaDataUtil [AcselXRestClient.calculoData]. Erro: " + t.getMessage(), t);
      }
    }  
    
    public boolean isFeriado(Date diaFechamento) throws Exception {
    	 try {
    		final String data = formatarData.format(diaFechamento);	          
	        final AvaliarDataRequest avaliarDataRequest = new AvaliarDataRequest("", "", "BR", data, 0L, "", 0L, "");   	        
	        final AvaliarDataResponse avaliarDataResponse = restTemplate.postForObject(urlAvaliarDataRequest, avaliarDataRequest, AvaliarDataResponse.class);
		          	          
	        return avaliarDataResponse.getDiaUtil().equals("N");	        	  	        	  	        	  
     } catch (Throwable t) {
         throw new Exception("Erro ao executar metodo isDataUtil [AcselXRestClient.isDataUtil]. Erro: " + t.getMessage(), t);
     }
   }
}
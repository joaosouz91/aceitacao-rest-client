package br.com.tokiomarine.seguradora.aceitacao.rest.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.tokiomarine.seguradora.aceitacao.rest.client.service.ParametrosService;
import br.com.tokiomarine.seguradora.corporativo.util.dto.gpa.DetalheProcessamentoAssincronoIN;
import br.com.tokiomarine.seguradora.corporativo.util.dto.gpa.DetalheProcessamentoAssincronoOUT;
import br.com.tokiomarine.seguradora.corporativo.util.dto.gpa.ProcessamentoAssincronoIN;
import br.com.tokiomarine.seguradora.corporativo.util.dto.gpa.ProcessamentoAssincronoOUT;

@Lazy
@Service
public class GPARestClient {

    @Autowired
    private ParametrosService parametrosService;
    
	@Autowired
	private RestTemplate restTemplate;

    public Long iniciaGPA(final String nomeModulo, final String codigoUsuario) throws Exception {
        try {
            ProcessamentoAssincronoIN processamentoAssincronoIN = new ProcessamentoAssincronoIN();
            processamentoAssincronoIN.setNmMdulo(nomeModulo);
            processamentoAssincronoIN.setCdUsuroUltmaAlter(codigoUsuario);

            final String urlWSCadastro = parametrosService.buscaValorParametroSSV("CORPORATIVO.UTIL", "URL_REST_INICIA_GPA");

            ProcessamentoAssincronoOUT processamentoAssincronoOUT = restTemplate.postForObject(urlWSCadastro, processamentoAssincronoIN, ProcessamentoAssincronoOUT.class);

            if (null != processamentoAssincronoOUT) {
                return processamentoAssincronoOUT.getIdLogProcmAsscn();
            } else {
                throw new Exception("Erro ao criar processamento assíncrono");
            }
        } catch (Exception e) {
            throw new Exception("Erro: " + e.getMessage(), e);
        }
    }

    public Long iniciaOuContinuaProcessoDiario(final String nomeModulo, final String codigoUsuario) throws Exception {
        try {
            ProcessamentoAssincronoIN processamentoAssincronoIN = new ProcessamentoAssincronoIN();
            processamentoAssincronoIN.setNmMdulo(nomeModulo);
            processamentoAssincronoIN.setCdUsuroUltmaAlter(codigoUsuario);

            final String urlWSCadastro = parametrosService.buscaValorParametroSSV("CORPORATIVO.UTIL", "URL_REST_INICIA_CONTINUA_GPA_DIARIO");
            final ProcessamentoAssincronoOUT processamentoAssincronoOUT = restTemplate.postForObject(urlWSCadastro, processamentoAssincronoIN, ProcessamentoAssincronoOUT.class);

            if (null != processamentoAssincronoOUT) {
                return processamentoAssincronoOUT.getIdLogProcmAsscn();
            } else {
                throw new Exception("Erro ao criar processamento assíncrono");
            }
        } catch (Exception e) {
            throw new Exception("Erro: " + e.getMessage(), e);
        }
    }

    public Long finalizaGPA(final Long codProcessamento, final String codigoUsuario) throws Exception {
        try {
            ProcessamentoAssincronoIN processamentoAssincronoIN = new ProcessamentoAssincronoIN();
            processamentoAssincronoIN.setCdUsuroUltmaAlter(codigoUsuario);
            processamentoAssincronoIN.setIdLogProcmAsscn(codProcessamento);

            final String urlWSCadastro = parametrosService.buscaValorParametroSSV("CORPORATIVO.UTIL", "URL_REST_FINALIZA_GPA");
            final ProcessamentoAssincronoOUT processamentoAssincronoOUT = restTemplate.postForObject(urlWSCadastro, processamentoAssincronoIN, ProcessamentoAssincronoOUT.class);

            if (null != processamentoAssincronoOUT) {
                return processamentoAssincronoOUT.getIdLogProcmAsscn();
            } else {
                throw new Exception("Erro ao criar processamento assíncrono");
            }
        } catch (Exception e) {
            throw new Exception("Erro: " + e.getMessage(), e);
        }
    }

    public Long finalizaGPAErro(final Long codProcessamento, final String codigoUsuario) throws Exception {
        try {
            ProcessamentoAssincronoIN processamentoAssincronoIN = new ProcessamentoAssincronoIN();
            processamentoAssincronoIN.setCdUsuroUltmaAlter(codigoUsuario);
            processamentoAssincronoIN.setIdLogProcmAsscn(codProcessamento);

            final String urlWSCadastro = parametrosService.buscaValorParametroSSV("CORPORATIVO.UTIL", "URL_REST_FINALIZA_GPA_ERRO");
            final ProcessamentoAssincronoOUT processamentoAssincronoOUT = restTemplate.postForObject(urlWSCadastro, processamentoAssincronoIN, ProcessamentoAssincronoOUT.class);

            if (null != processamentoAssincronoOUT) {
                return processamentoAssincronoOUT.getIdLogProcmAsscn();
            } else {
                throw new Exception("Erro ao criar processamento assíncrono");
            }
        } catch (Exception e) {
            throw new Exception("Erro: " + e.getMessage(), e);
        }
    }

    public void debug(Long idProcessamento, String mensagemGPA, String chavePesquisa) throws Exception {
        try {
            DetalheProcessamentoAssincronoIN detalheProcessamentoAssincronoIN = new DetalheProcessamentoAssincronoIN();
            detalheProcessamentoAssincronoIN.setIdLogProcmAsscn(idProcessamento);
            detalheProcessamentoAssincronoIN.setDsLogDetalProcmAsscn(mensagemGPA);
            detalheProcessamentoAssincronoIN.setTpDetalProcmAsscn("0");
            detalheProcessamentoAssincronoIN.setCdArgumPsqsaUsuro(chavePesquisa);

            final String urlWSCadastro = parametrosService.buscaValorParametroSSV("CORPORATIVO.UTIL", "URL_REST_INSERE_DETALHE_GPA");
            final DetalheProcessamentoAssincronoOUT detalheProcessamentoAssincronoOUT = restTemplate.postForObject(urlWSCadastro, detalheProcessamentoAssincronoIN, DetalheProcessamentoAssincronoOUT.class);

            if (null == detalheProcessamentoAssincronoOUT) {
                throw new Exception("Erro ao criar processamento assíncrono");
            }
        } catch (Exception e) {
            throw new Exception("Erro: " + e.getMessage() + "#debug" + e.getStackTrace());
        }
    }

    public void info(final Long idProcessamento, final String mensagemGPA, final String chavePesquisa) throws Exception {
        try {
            DetalheProcessamentoAssincronoIN detalheProcessamentoAssincronoIN = new DetalheProcessamentoAssincronoIN();
            detalheProcessamentoAssincronoIN.setIdLogProcmAsscn(idProcessamento);
            detalheProcessamentoAssincronoIN.setDsLogDetalProcmAsscn(mensagemGPA);
            detalheProcessamentoAssincronoIN.setTpDetalProcmAsscn("1");
            detalheProcessamentoAssincronoIN.setCdArgumPsqsaUsuro(chavePesquisa);

            final String urlWSCadastro = parametrosService.buscaValorParametroSSV("CORPORATIVO.UTIL", "URL_REST_INSERE_DETALHE_GPA");
            final DetalheProcessamentoAssincronoOUT detalheProcessamentoAssincronoOUT = restTemplate.postForObject(urlWSCadastro, detalheProcessamentoAssincronoIN, DetalheProcessamentoAssincronoOUT.class);

            if (null == detalheProcessamentoAssincronoOUT) {
                throw new Exception("Erro ao criar processamento assíncrono");
            }
        } catch (Exception e) {
            throw new Exception("Erro: " + e.getMessage() +  "#info"  + e.getStackTrace());
        }
    }

    public void alerta(final Long idProcessamento, final String mensagemGPA, final String chavePesquisa) throws Exception {
        try {
            DetalheProcessamentoAssincronoIN detalheProcessamentoAssincronoIN = new DetalheProcessamentoAssincronoIN();
            detalheProcessamentoAssincronoIN.setIdLogProcmAsscn(idProcessamento);
            detalheProcessamentoAssincronoIN.setDsLogDetalProcmAsscn(mensagemGPA);
            detalheProcessamentoAssincronoIN.setTpDetalProcmAsscn("2");
            detalheProcessamentoAssincronoIN.setCdArgumPsqsaUsuro(chavePesquisa);

            final String urlWSCadastro = parametrosService.buscaValorParametroSSV("CORPORATIVO.UTIL", "URL_REST_INSERE_DETALHE_GPA");
            final DetalheProcessamentoAssincronoOUT detalheProcessamentoAssincronoOUT = restTemplate.postForObject(urlWSCadastro, detalheProcessamentoAssincronoIN, DetalheProcessamentoAssincronoOUT.class);

            if (null == detalheProcessamentoAssincronoOUT) {
                throw new Exception("Erro ao criar processamento assíncrono");
            }
        } catch (Exception e) {
            throw new Exception("Erro: " + e.getMessage() +  "#alerta"  + e.getStackTrace());
        }
    }

    public void erro(final Long idProcessamento, final String mensagemGPA, final String chavePesquisa) throws Exception {
        try {
            DetalheProcessamentoAssincronoIN detalheProcessamentoAssincronoIN = new DetalheProcessamentoAssincronoIN();
            detalheProcessamentoAssincronoIN.setIdLogProcmAsscn(idProcessamento);
            detalheProcessamentoAssincronoIN.setDsLogDetalProcmAsscn(mensagemGPA);
            detalheProcessamentoAssincronoIN.setTpDetalProcmAsscn("3");
            detalheProcessamentoAssincronoIN.setCdArgumPsqsaUsuro(chavePesquisa);

            final String urlWSCadastro = parametrosService.buscaValorParametroSSV("CORPORATIVO.UTIL", "URL_REST_INSERE_DETALHE_GPA");
            final DetalheProcessamentoAssincronoOUT detalheProcessamentoAssincronoOUT = restTemplate.postForObject(urlWSCadastro, detalheProcessamentoAssincronoIN, DetalheProcessamentoAssincronoOUT.class);

            if (null == detalheProcessamentoAssincronoOUT) {
                throw new Exception("Erro ao criar processamento assíncrono");
            }
        } catch (Exception e) {
            throw new Exception("Erro: " + e.getMessage() +  "#erro"  + e.getStackTrace());
        }
    }

    public void fatal(final Long idProcessamento, final String mensagemGPA, final String chavePesquisa) throws Exception {
        try {
            DetalheProcessamentoAssincronoIN detalheProcessamentoAssincronoIN = new DetalheProcessamentoAssincronoIN();
            detalheProcessamentoAssincronoIN.setIdLogProcmAsscn(idProcessamento);
            detalheProcessamentoAssincronoIN.setDsLogDetalProcmAsscn(mensagemGPA);
            detalheProcessamentoAssincronoIN.setTpDetalProcmAsscn("4");
            detalheProcessamentoAssincronoIN.setCdArgumPsqsaUsuro(chavePesquisa);

            final String urlWSCadastro = parametrosService.buscaValorParametroSSV("CORPORATIVO.UTIL", "URL_REST_INSERE_DETALHE_GPA");
            final DetalheProcessamentoAssincronoOUT detalheProcessamentoAssincronoOUT = restTemplate.postForObject(urlWSCadastro, detalheProcessamentoAssincronoIN, DetalheProcessamentoAssincronoOUT.class);

            if (null == detalheProcessamentoAssincronoOUT) {
                throw new Exception("Erro ao criar processamento assíncrono");
            }
        } catch (Exception e) {
            throw new Exception("Erro: " + e.getMessage() +  "#fatal"  + e.getStackTrace());
        }
    }
}
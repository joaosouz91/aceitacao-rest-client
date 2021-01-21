package br.com.tokiomarine.seguradora.aceitacao.rest.client.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PO_Mensagem implements Serializable {

    /**
	 * 
	 */
    private static final long serialVersionUID = 1L;

    private Long status_retorno;
    private String mensagem_retorno;
    private Long qtde_ocorrencias;

    public Long getStatus_retorno() {
        return status_retorno;
    }

    public void setStatus_retorno(Long status_retorno) {
        this.status_retorno = status_retorno;
    }

    public String getMensagem_retorno() {
        return mensagem_retorno;
    }

    public void setMensagem_retorno(String mensagem_retorno) {
        this.mensagem_retorno = mensagem_retorno;
    }

    public Long getQtde_ocorrencias() {
        return qtde_ocorrencias;
    }

    public void setQtde_ocorrencias(Long qtde_ocorrencias) {
        this.qtde_ocorrencias = qtde_ocorrencias;
    }
}

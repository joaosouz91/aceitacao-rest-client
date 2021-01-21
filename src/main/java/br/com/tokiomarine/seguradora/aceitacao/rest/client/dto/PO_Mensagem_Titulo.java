package br.com.tokiomarine.seguradora.aceitacao.rest.client.dto;

import java.io.Serializable;

public class PO_Mensagem_Titulo implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private Long status_retorno;
    private String mensagem_retorno;

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
}

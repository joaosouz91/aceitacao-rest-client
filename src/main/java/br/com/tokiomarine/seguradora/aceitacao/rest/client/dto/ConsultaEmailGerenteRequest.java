package br.com.tokiomarine.seguradora.aceitacao.rest.client.dto;

import java.io.Serializable;

public class ConsultaEmailGerenteRequest implements Serializable {

    /**
	 *
	 */
    private static final long serialVersionUID = 1L;
    private String p_codintercli;

    public String getP_codintercli() {
        return p_codintercli;
    }

    public void setP_codintercli(String p_codintercli) {
        this.p_codintercli = p_codintercli;
    }

}

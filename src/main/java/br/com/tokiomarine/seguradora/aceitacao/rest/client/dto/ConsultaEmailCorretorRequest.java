package br.com.tokiomarine.seguradora.aceitacao.rest.client.dto;

import java.io.Serializable;

public class ConsultaEmailCorretorRequest implements Serializable {

    /**
	 *
	 */
    private static final long serialVersionUID = 1L;
    private String p_codintercli;
    private String p_tipo_email;

    public String getP_codintercli() {
        return p_codintercli;
    }

    public void setP_codintercli(String p_codintercli) {
        this.p_codintercli = p_codintercli;
    }

    public String getP_tipo_email() {
        return p_tipo_email;
    }

    public void setP_tipo_email(String p_tipo_email) {
        this.p_tipo_email = p_tipo_email;
    }

}

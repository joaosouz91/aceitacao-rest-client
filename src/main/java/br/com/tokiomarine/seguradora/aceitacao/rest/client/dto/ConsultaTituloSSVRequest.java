package br.com.tokiomarine.seguradora.aceitacao.rest.client.dto;

import java.io.Serializable;

public class ConsultaTituloSSVRequest implements Serializable {

    private static final long serialVersionUID = 1425385524447365609L;

    private String p_chave;
    private Long p_op_consulta;
    private String p_codentfinan;
    public String getP_chave() {
        return p_chave;
    }
    public void setP_chave(String p_chave) {
        this.p_chave = p_chave;
    }
    public Long getP_op_consulta() {
        return p_op_consulta;
    }
    public void setP_op_consulta(Long p_op_consulta) {
        this.p_op_consulta = p_op_consulta;
    }

	public String getP_codentfinan() {
		return p_codentfinan;
	}

	public void setP_codentfinan(String p_codentfinan) {
		this.p_codentfinan = p_codentfinan;
	}

}

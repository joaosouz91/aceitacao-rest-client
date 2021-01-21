package br.com.tokiomarine.seguradora.aceitacao.rest.client.dto;

import java.io.Serializable;

public class ConsultaCorretorRequest implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String p_chave;
    private Long p_op_consulta;
    private Long p_tp_acesso;
    private Long p_qtd_reg;
    private Long idProposta;

    public ConsultaCorretorRequest(){
    	
    }
    
    public ConsultaCorretorRequest(String p_chave, Long p_op_consulta, Long p_tp_acesso, Long p_qtd_reg,
			Long idProposta) {
		super();
		this.p_chave = p_chave;
		this.p_op_consulta = p_op_consulta;
		this.p_tp_acesso = p_tp_acesso;
		this.p_qtd_reg = p_qtd_reg;
		this.idProposta = idProposta;
	}

	public Long getIdProposta() {
		return idProposta;
	}

	public void setIdProposta(Long idProposta) {
		this.idProposta = idProposta;
	}

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

    public Long getP_tp_acesso() {
        return p_tp_acesso;
    }

    public void setP_tp_acesso(Long p_tp_acesso) {
        this.p_tp_acesso = p_tp_acesso;
    }

    public Long getP_qtd_reg() {
        return p_qtd_reg;
    }

    public void setP_qtd_reg(Long p_qtd_reg) {
        this.p_qtd_reg = p_qtd_reg;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idProposta == null) ? 0 : idProposta.hashCode());
		result = prime * result + ((p_chave == null) ? 0 : p_chave.hashCode());
		result = prime * result + ((p_op_consulta == null) ? 0 : p_op_consulta.hashCode());
		result = prime * result + ((p_qtd_reg == null) ? 0 : p_qtd_reg.hashCode());
		result = prime * result + ((p_tp_acesso == null) ? 0 : p_tp_acesso.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConsultaCorretorRequest other = (ConsultaCorretorRequest) obj;
		if (idProposta == null) {
			if (other.idProposta != null)
				return false;
		} else if (!idProposta.equals(other.idProposta))
			return false;
		if (p_chave == null) {
			if (other.p_chave != null)
				return false;
		} else if (!p_chave.equals(other.p_chave))
			return false;
		if (p_op_consulta == null) {
			if (other.p_op_consulta != null)
				return false;
		} else if (!p_op_consulta.equals(other.p_op_consulta))
			return false;
		if (p_qtd_reg == null) {
			if (other.p_qtd_reg != null)
				return false;
		} else if (!p_qtd_reg.equals(other.p_qtd_reg))
			return false;
		if (p_tp_acesso == null) {
			if (other.p_tp_acesso != null)
				return false;
		} else if (!p_tp_acesso.equals(other.p_tp_acesso))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ConsultaCorretorRequest [p_chave=" + p_chave + ", p_op_consulta=" + p_op_consulta + ", p_tp_acesso="
				+ p_tp_acesso + ", p_qtd_reg=" + p_qtd_reg + ", idProposta=" + idProposta + "]";
	}    
}
package br.com.tokiomarine.seguradora.aceitacao.rest.client.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ConsultaCorretorResponse implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private String codigoRetorno;
    private String descricaoCodigoRetorno;
    private List<PO_Reg> po_reg;
    private PO_Mensagem po_mensagem;

    public ConsultaCorretorResponse(){
    	
    }
    
    public ConsultaCorretorResponse(String codigoRetorno, String descricaoCodigoRetorno, List<PO_Reg> po_reg,
			PO_Mensagem po_mensagem) {
		super();
		this.codigoRetorno = codigoRetorno;
		this.descricaoCodigoRetorno = descricaoCodigoRetorno;
		this.po_reg = po_reg;
		this.po_mensagem = po_mensagem;
	}

	public String getCodigoRetorno() {
        return codigoRetorno;
    }

    public void setCodigoRetorno(String codigoRetorno) {
        this.codigoRetorno = codigoRetorno;
    }

    public String getDescricaoCodigoRetorno() {
        return descricaoCodigoRetorno;
    }

    public void setDescricaoCodigoRetorno(String descricaoCodigoRetorno) {
        this.descricaoCodigoRetorno = descricaoCodigoRetorno;
    }

    public List<PO_Reg> getPo_reg() {
        return po_reg;
    }

    public void setPo_reg(List<PO_Reg> po_reg) {
        this.po_reg = po_reg;
    }

    public PO_Mensagem getPo_mensagem() {
        return po_mensagem;
    }

    public void setPo_mensagem(PO_Mensagem po_mensagem) {
        this.po_mensagem = po_mensagem;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoRetorno == null) ? 0 : codigoRetorno.hashCode());
		result = prime * result + ((descricaoCodigoRetorno == null) ? 0 : descricaoCodigoRetorno.hashCode());
		result = prime * result + ((po_mensagem == null) ? 0 : po_mensagem.hashCode());
		result = prime * result + ((po_reg == null) ? 0 : po_reg.hashCode());
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
		ConsultaCorretorResponse other = (ConsultaCorretorResponse) obj;
		if (codigoRetorno == null) {
			if (other.codigoRetorno != null)
				return false;
		} else if (!codigoRetorno.equals(other.codigoRetorno))
			return false;
		if (descricaoCodigoRetorno == null) {
			if (other.descricaoCodigoRetorno != null)
				return false;
		} else if (!descricaoCodigoRetorno.equals(other.descricaoCodigoRetorno))
			return false;
		if (po_mensagem == null) {
			if (other.po_mensagem != null)
				return false;
		} else if (!po_mensagem.equals(other.po_mensagem))
			return false;
		if (po_reg == null) {
			if (other.po_reg != null)
				return false;
		} else if (!po_reg.equals(other.po_reg))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ConsultaCorretorResponse [codigoRetorno=" + codigoRetorno + ", descricaoCodigoRetorno="
				+ descricaoCodigoRetorno + ", po_reg=" + po_reg + ", po_mensagem=" + po_mensagem + "]";
	}    
}
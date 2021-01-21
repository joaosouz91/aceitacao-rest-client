package br.com.tokiomarine.seguradora.aceitacao.rest.client.dto;

import java.io.Serializable;
import java.util.List;

public class ConsultaEmailCorretorResponse implements Serializable {

    /**
	 *
	 */
    private static final long serialVersionUID = 1L;
    private String codigoRetorno;
    private String descricaoCodigoRetorno;
    private List<PO_Reg> po_reg;
    private PO_Mensagem po_mensagem;

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

    public PO_Mensagem getPo_mensagem() {
        return po_mensagem;
    }

    public void setPo_mensagem(PO_Mensagem po_mensagem) {
        this.po_mensagem = po_mensagem;
    }

    public List<PO_Reg> getPo_reg() {
        return po_reg;
    }

    public void setPo_reg(List<PO_Reg> po_reg) {
        this.po_reg = po_reg;
    }
}
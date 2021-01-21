package br.com.tokiomarine.seguradora.aceitacao.rest.client.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ConsultaTituloSSVResponse implements Serializable {

    private static final long serialVersionUID = 1L;
    private String codigoRetorno;
    private String descricaoCodigoRetorno;
    private List<PO_Reg_Titulo> po_reg;
    private List<PO_Mensagem_Titulo> po_mensagem;
    private String cdescerro;
    private String cretcode;

    public String getCdescerro() {
        return cdescerro;
    }

    public void setCdescerro(String cdescerro) {
        this.cdescerro = cdescerro;
    }

    public String getCretcode() {
        return cretcode;
    }

    public void setCretcode(String cretcode) {
        this.cretcode = cretcode;
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

    public List<PO_Reg_Titulo> getPo_reg() {
        return po_reg;
    }

    public void setPo_reg(List<PO_Reg_Titulo> po_reg) {
        this.po_reg = po_reg;
    }

    public List<PO_Mensagem_Titulo> getPo_mensagem() {
        return po_mensagem;
    }

    public void setPo_mensagem(List<PO_Mensagem_Titulo> po_mensagem) {
        this.po_mensagem = po_mensagem;
    }
}

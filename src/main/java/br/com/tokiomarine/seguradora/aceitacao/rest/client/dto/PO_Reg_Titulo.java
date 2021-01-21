package br.com.tokiomarine.seguradora.aceitacao.rest.client.dto;

import java.io.Serializable;
import java.util.Calendar;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PO_Reg_Titulo implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 2939801057236769451L;

    private String numtitulo;
    private String numtitulossv;
    private Long codcia;
    private String codentfinan;
    private String codcnv;
    private String codtipotit;
    private Double mtotit;
    private Calendar fecvenc;
    private String ststitulo;
    private String descrip;
    private Calendar fecemi;
    private String banco_cli;
    private String codagencia_cli;
    private Long numdocref;
    private Long codcentcusto;
    private Long codintercli;
    private String localcap;
    private String codagecob;
    private String codcli;
    private Long codneg;
    private Calendar fecsts;
    private String mtodescconc;
    private String dvctacor;
    private String cnome_deb;
    private String cparent_deb;
    private String ctppessoa_deb;
    private Long ccpf_cnpj_deb;
    private String ctoken;

    public String getNumtitulo() {
        return numtitulo;
    }

    public void setNumtitulo(String numtitulo) {
        this.numtitulo = numtitulo;
    }

    public String getNumtitulossv() {
        return numtitulossv;
    }

    public void setNumtitulossv(String numtitulossv) {
        this.numtitulossv = numtitulossv;
    }

    public Long getCodcia() {
        return codcia;
    }

    public void setCodcia(Long codcia) {
        this.codcia = codcia;
    }

    public String getCodentfinan() {
        return codentfinan;
    }

    public void setCodentfinan(String codentfinan) {
        this.codentfinan = codentfinan;
    }

    public String getCodcnv() {
        return codcnv;
    }

    public void setCodcnv(String codcnv) {
        this.codcnv = codcnv;
    }

    public String getCodtipotit() {
        return codtipotit;
    }

    public void setCodtipotit(String codtipotit) {
        this.codtipotit = codtipotit;
    }

    public Double getMtotit() {
        return mtotit;
    }

    public void setMtotit(Double mtotit) {
        this.mtotit = mtotit;
    }

    public Calendar getFecvenc() {
        return fecvenc;
    }

    public void setFecvenc(Calendar fecvenc) {
        this.fecvenc = fecvenc;
    }

    public String getStstitulo() {
        return ststitulo;
    }

    public void setStstitulo(String ststitulo) {
        this.ststitulo = ststitulo;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public Calendar getFecemi() {
        return fecemi;
    }

    public void setFecemi(Calendar fecemi) {
        this.fecemi = fecemi;
    }

    public String getBanco_cli() {
        return banco_cli;
    }

    public void setBanco_cli(String banco_cli) {
        this.banco_cli = banco_cli;
    }

    public String getCodagencia_cli() {
        return codagencia_cli;
    }

    public void setCodagencia_cli(String codagencia_cli) {
        this.codagencia_cli = codagencia_cli;
    }

    public Long getNumdocref() {
        return numdocref;
    }

    public void setNumdocref(Long numdocref) {
        this.numdocref = numdocref;
    }

    public Long getCodcentcusto() {
        return codcentcusto;
    }

    public void setCodcentcusto(Long codcentcusto) {
        this.codcentcusto = codcentcusto;
    }

    public Long getCodintercli() {
        return codintercli;
    }

    public void setCodintercli(Long codintercli) {
        this.codintercli = codintercli;
    }

    public String getLocalcap() {
        return localcap;
    }

    public void setLocalcap(String localcap) {
        this.localcap = localcap;
    }

    public String getCodagecob() {
        return codagecob;
    }

    public void setCodagecob(String codagecob) {
        this.codagecob = codagecob;
    }

    public String getCodcli() {
        return codcli;
    }

    public void setCodcli(String codcli) {
        this.codcli = codcli;
    }

    public Long getCodneg() {
        return codneg;
    }

    public void setCodneg(Long codneg) {
        this.codneg = codneg;
    }

    public Calendar getFecsts() {
        return fecsts;
    }

    public void setFecsts(Calendar fecsts) {
        this.fecsts = fecsts;
    }

    public String getMtodescconc() {
        return mtodescconc;
    }

    public void setMtodescconc(String mtodescconc) {
        this.mtodescconc = mtodescconc;
    }


    public String getDvctacor() {
		return dvctacor;
	}

	public void setDvctacor(String dvctacor) {
		this.dvctacor = dvctacor;
	}

	public String getCnome_deb() {
        return cnome_deb;
    }

    public void setCnome_deb(String cnome_deb) {
        this.cnome_deb = cnome_deb;
    }

    public String getCparent_deb() {
        return cparent_deb;
    }

    public void setCparent_deb(String cparent_deb) {
        this.cparent_deb = cparent_deb;
    }

    public String getCtppessoa_deb() {
        return ctppessoa_deb;
    }

    public void setCtppessoa_deb(String ctppessoa_deb) {
        this.ctppessoa_deb = ctppessoa_deb;
    }

    public Long getCcpf_cnpj_deb() {
        return ccpf_cnpj_deb;
    }

    public void setCcpf_cnpj_deb(Long ccpf_cnpj_deb) {
        this.ccpf_cnpj_deb = ccpf_cnpj_deb;
    }

    public String getCtoken() {
		return ctoken;
	}

	public void setCtoken(String ctoken) {
		this.ctoken = ctoken;
	}

	public static long getSerialversionuid() {
        return serialVersionUID;
    }
}

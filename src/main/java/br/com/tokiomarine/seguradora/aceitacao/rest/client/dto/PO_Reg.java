package br.com.tokiomarine.seguradora.aceitacao.rest.client.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PO_Reg implements Serializable {

    private static final long serialVersionUID = 1L;

    private BigDecimal tipocor;
    private String codcorretor;
    private String codinter_acx;
    private String tipointermediario;
    private String tipoid;
    private BigDecimal numid;
    private String dvid;
    private String tipoter;
    private String nomter;
    private String apeter;
    private String endereco;
    private String numlograd;
    private String cep;
    private String codpais;
    private String codestado;
    private String codcidade;
    private String codbairro;
    private String descpais;
    private String descestado;
    private String descciudad;
    private String descmunicipio;
    private String telef1;
    private String telef2;
    private String telef3;
    private String fax;
    private String email;
    private String endfis_endereco;
    private BigDecimal endfis_numlograd;
    private String endfis_cep;
    private String endfis_codpais;
    private String endfis_codciudad;
    private String endfis_codestado;
    private String endfis_codmunicipio;
    private String endfis_pais;
    private String endfis_estado;
    private String endfis_cidade;
    private String endfis_bairro;
    private BigDecimal codmunic_fis;
    private String codsuperint;
    private String succentral;
    private String codsucursal;
    private String codnac;
    private String codloc_adm;
    private BigDecimal codger;
    private String inscr_municipal;
    private String ind_listaneg;
    private String ind_comunic_net;
    private String iconeimp;
    private String sitecor;
    private String numconv_iss;
    private String indmicroemp;
    private String codrealplug;
    private String nomresp;
    private String destdoc;
    private String destdoc_pe;
    private String tipoaltsusep;
    private Calendar dtprocsusep;
    private String codclascor;
    private String periodpgto;
    private BigDecimal valmindiapgtocom;
    private String tipo_pago;
    private String codentfinan;
    private String codagencia;
    private String cuentacor;
    private String destextrato;
    private String destcorclassic;
    private String indrecadsusep;
    private BigDecimal clascontribinss;
    private String indrecolh;
    private String nomrespaltrecolh;
    private Calendar dtinclusao;
    private String statuscor;
    private Calendar dtstatus;
    private String codplataforma;
    private Calendar dtinivig;
    private Calendar dtfimvig;
    private Calendar dtinipnc;
    private String indativosusep;
    private BigDecimal dddtelef1;
    private BigDecimal numtelef1;
    private BigDecimal cod_corr_plataforma;
    private String nomesucursal;
    private String codcategoria;
    private BigDecimal ide_grupo_corretores;

    public BigDecimal getTipocor() {
        return tipocor;
    }

    public void setTipocor(BigDecimal tipocor) {
        this.tipocor = tipocor;
    }

    public String getCodcorretor() {
        return codcorretor;
    }

    public void setCodcorretor(String codcorretor) {
        this.codcorretor = codcorretor;
    }

    public String getCodinter_acx() {
        return codinter_acx;
    }

    public void setCodinter_acx(String codinter_acx) {
        this.codinter_acx = codinter_acx;
    }

    public String getTipointermediario() {
        return tipointermediario;
    }

    public void setTipointermediario(String tipointermediario) {
        this.tipointermediario = tipointermediario;
    }

    public String getTipoid() {
        return tipoid;
    }

    public void setTipoid(String tipoid) {
        this.tipoid = tipoid;
    }

    public BigDecimal getNumid() {
        return numid;
    }

    public void setNumid(BigDecimal numid) {
        this.numid = numid;
    }

    public String getDvid() {
        return dvid;
    }

    public void setDvid(String dvid) {
        this.dvid = dvid;
    }

    public String getTipoter() {
        return tipoter;
    }

    public void setTipoter(String tipoter) {
        this.tipoter = tipoter;
    }

    public String getNomter() {
        return nomter;
    }

    public void setNomter(String nomter) {
        this.nomter = nomter;
    }

    public String getApeter() {
        return apeter;
    }

    public void setApeter(String apeter) {
        this.apeter = apeter;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumlograd() {
        return numlograd;
    }

    public void setNumlograd(String numlograd) {
        this.numlograd = numlograd;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCodpais() {
        return codpais;
    }

    public void setCodpais(String codpais) {
        this.codpais = codpais;
    }

    public String getCodestado() {
        return codestado;
    }

    public void setCodestado(String codestado) {
        this.codestado = codestado;
    }

    public String getCodcidade() {
        return codcidade;
    }

    public void setCodcidade(String codcidade) {
        this.codcidade = codcidade;
    }

    public String getCodbairro() {
        return codbairro;
    }

    public void setCodbairro(String codbairro) {
        this.codbairro = codbairro;
    }

    public String getDescpais() {
        return descpais;
    }

    public void setDescpais(String descpais) {
        this.descpais = descpais;
    }

    public String getDescestado() {
        return descestado;
    }

    public void setDescestado(String descestado) {
        this.descestado = descestado;
    }

    public String getDescciudad() {
        return descciudad;
    }

    public void setDescciudad(String descciudad) {
        this.descciudad = descciudad;
    }

    public String getDescmunicipio() {
        return descmunicipio;
    }

    public void setDescmunicipio(String descmunicipio) {
        this.descmunicipio = descmunicipio;
    }

    public String getTelef1() {
        return telef1;
    }

    public void setTelef1(String telef1) {
        this.telef1 = telef1;
    }

    public String getTelef2() {
        return telef2;
    }

    public void setTelef2(String telef2) {
        this.telef2 = telef2;
    }

    public String getTelef3() {
        return telef3;
    }

    public void setTelef3(String telef3) {
        this.telef3 = telef3;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndfis_endereco() {
        return endfis_endereco;
    }

    public void setEndfis_endereco(String endfis_endereco) {
        this.endfis_endereco = endfis_endereco;
    }

    public BigDecimal getEndfis_numlograd() {
        return endfis_numlograd;
    }

    public void setEndfis_numlograd(BigDecimal endfis_numlograd) {
        this.endfis_numlograd = endfis_numlograd;
    }

    public String getEndfis_cep() {
        return endfis_cep;
    }

    public void setEndfis_cep(String endfis_cep) {
        this.endfis_cep = endfis_cep;
    }

    public String getEndfis_codpais() {
        return endfis_codpais;
    }

    public void setEndfis_codpais(String endfis_codpais) {
        this.endfis_codpais = endfis_codpais;
    }

    public String getEndfis_codciudad() {
        return endfis_codciudad;
    }

    public void setEndfis_codciudad(String endfis_codciudad) {
        this.endfis_codciudad = endfis_codciudad;
    }

    public String getEndfis_codestado() {
        return endfis_codestado;
    }

    public void setEndfis_codestado(String endfis_codestado) {
        this.endfis_codestado = endfis_codestado;
    }

    public String getEndfis_codmunicipio() {
        return endfis_codmunicipio;
    }

    public void setEndfis_codmunicipio(String endfis_codmunicipio) {
        this.endfis_codmunicipio = endfis_codmunicipio;
    }

    public String getEndfis_pais() {
        return endfis_pais;
    }

    public void setEndfis_pais(String endfis_pais) {
        this.endfis_pais = endfis_pais;
    }

    public String getEndfis_estado() {
        return endfis_estado;
    }

    public void setEndfis_estado(String endfis_estado) {
        this.endfis_estado = endfis_estado;
    }

    public String getEndfis_cidade() {
        return endfis_cidade;
    }

    public void setEndfis_cidade(String endfis_cidade) {
        this.endfis_cidade = endfis_cidade;
    }

    public String getEndfis_bairro() {
        return endfis_bairro;
    }

    public void setEndfis_bairro(String endfis_bairro) {
        this.endfis_bairro = endfis_bairro;
    }

    public BigDecimal getCodmunic_fis() {
        return codmunic_fis;
    }

    public void setCodmunic_fis(BigDecimal codmunic_fis) {
        this.codmunic_fis = codmunic_fis;
    }

    public String getCodsuperint() {
        return codsuperint;
    }

    public void setCodsuperint(String codsuperint) {
        this.codsuperint = codsuperint;
    }

    public String getSuccentral() {
        return succentral;
    }

    public void setSuccentral(String succentral) {
        this.succentral = succentral;
    }

    public String getCodsucursal() {
        return codsucursal;
    }

    public void setCodsucursal(String codsucursal) {
        this.codsucursal = codsucursal;
    }

    public String getCodnac() {
        return codnac;
    }

    public void setCodnac(String codnac) {
        this.codnac = codnac;
    }

    public String getCodloc_adm() {
        return codloc_adm;
    }

    public void setCodloc_adm(String codloc_adm) {
        this.codloc_adm = codloc_adm;
    }

    public BigDecimal getCodger() {
        return codger;
    }

    public void setCodger(BigDecimal codger) {
        this.codger = codger;
    }

    public String getInscr_municipal() {
        return inscr_municipal;
    }

    public void setInscr_municipal(String inscr_municipal) {
        this.inscr_municipal = inscr_municipal;
    }

    public String getInd_listaneg() {
        return ind_listaneg;
    }

    public void setInd_listaneg(String ind_listaneg) {
        this.ind_listaneg = ind_listaneg;
    }

    public String getInd_comunic_net() {
        return ind_comunic_net;
    }

    public void setInd_comunic_net(String ind_comunic_net) {
        this.ind_comunic_net = ind_comunic_net;
    }

    public String getIconeimp() {
        return iconeimp;
    }

    public void setIconeimp(String iconeimp) {
        this.iconeimp = iconeimp;
    }

    public String getSitecor() {
        return sitecor;
    }

    public void setSitecor(String sitecor) {
        this.sitecor = sitecor;
    }

    public String getNumconv_iss() {
        return numconv_iss;
    }

    public void setNumconv_iss(String numconv_iss) {
        this.numconv_iss = numconv_iss;
    }

    public String getIndmicroemp() {
        return indmicroemp;
    }

    public void setIndmicroemp(String indmicroemp) {
        this.indmicroemp = indmicroemp;
    }

    public String getCodrealplug() {
        return codrealplug;
    }

    public void setCodrealplug(String codrealplug) {
        this.codrealplug = codrealplug;
    }

    public String getNomresp() {
        return nomresp;
    }

    public void setNomresp(String nomresp) {
        this.nomresp = nomresp;
    }

    public String getDestdoc() {
        return destdoc;
    }

    public void setDestdoc(String destdoc) {
        this.destdoc = destdoc;
    }

    public String getDestdoc_pe() {
        return destdoc_pe;
    }

    public void setDestdoc_pe(String destdoc_pe) {
        this.destdoc_pe = destdoc_pe;
    }

    public String getTipoaltsusep() {
        return tipoaltsusep;
    }

    public void setTipoaltsusep(String tipoaltsusep) {
        this.tipoaltsusep = tipoaltsusep;
    }

    public Calendar getDtprocsusep() {
        return dtprocsusep;
    }

    public void setDtprocsusep(Calendar dtprocsusep) {
        this.dtprocsusep = dtprocsusep;
    }

    public String getCodclascor() {
        return codclascor;
    }

    public void setCodclascor(String codclascor) {
        this.codclascor = codclascor;
    }

    public String getPeriodpgto() {
        return periodpgto;
    }

    public void setPeriodpgto(String periodpgto) {
        this.periodpgto = periodpgto;
    }

    public BigDecimal getValmindiapgtocom() {
        return valmindiapgtocom;
    }

    public void setValmindiapgtocom(BigDecimal valmindiapgtocom) {
        this.valmindiapgtocom = valmindiapgtocom;
    }

    public String getTipo_pago() {
        return tipo_pago;
    }

    public void setTipo_pago(String tipo_pago) {
        this.tipo_pago = tipo_pago;
    }

    public String getCodentfinan() {
        return codentfinan;
    }

    public void setCodentfinan(String codentfinan) {
        this.codentfinan = codentfinan;
    }

    public String getCodagencia() {
        return codagencia;
    }

    public void setCodagencia(String codagencia) {
        this.codagencia = codagencia;
    }

    public String getCuentacor() {
        return cuentacor;
    }

    public void setCuentacor(String cuentacor) {
        this.cuentacor = cuentacor;
    }

    public String getDestextrato() {
        return destextrato;
    }

    public void setDestextrato(String destextrato) {
        this.destextrato = destextrato;
    }

    public String getDestcorclassic() {
        return destcorclassic;
    }

    public void setDestcorclassic(String destcorclassic) {
        this.destcorclassic = destcorclassic;
    }

    public String getIndrecadsusep() {
        return indrecadsusep;
    }

    public void setIndrecadsusep(String indrecadsusep) {
        this.indrecadsusep = indrecadsusep;
    }

    public BigDecimal getClascontribinss() {
        return clascontribinss;
    }

    public void setClascontribinss(BigDecimal clascontribinss) {
        this.clascontribinss = clascontribinss;
    }

    public String getIndrecolh() {
        return indrecolh;
    }

    public void setIndrecolh(String indrecolh) {
        this.indrecolh = indrecolh;
    }

    public String getNomrespaltrecolh() {
        return nomrespaltrecolh;
    }

    public void setNomrespaltrecolh(String nomrespaltrecolh) {
        this.nomrespaltrecolh = nomrespaltrecolh;
    }

    public Calendar getDtinclusao() {
        return dtinclusao;
    }

    public void setDtinclusao(Calendar dtinclusao) {
        this.dtinclusao = dtinclusao;
    }

    public String getStatuscor() {
        return statuscor;
    }

    public void setStatuscor(String statuscor) {
        this.statuscor = statuscor;
    }

    public Calendar getDtstatus() {
        return dtstatus;
    }

    public void setDtstatus(Calendar dtstatus) {
        this.dtstatus = dtstatus;
    }

    public String getCodplataforma() {
        return codplataforma;
    }

    public void setCodplataforma(String codplataforma) {
        this.codplataforma = codplataforma;
    }

    public Calendar getDtinivig() {
        return dtinivig;
    }

    public void setDtinivig(Calendar dtinivig) {
        this.dtinivig = dtinivig;
    }

    public Calendar getDtfimvig() {
        return dtfimvig;
    }

    public void setDtfimvig(Calendar dtfimvig) {
        this.dtfimvig = dtfimvig;
    }

    public Calendar getDtinipnc() {
        return dtinipnc;
    }

    public void setDtinipnc(Calendar dtinipnc) {
        this.dtinipnc = dtinipnc;
    }

    public String getIndativosusep() {
        return indativosusep;
    }

    public void setIndativosusep(String indativosusep) {
        this.indativosusep = indativosusep;
    }

    public BigDecimal getDddtelef1() {
        return dddtelef1;
    }

    public void setDddtelef1(BigDecimal dddtelef1) {
        this.dddtelef1 = dddtelef1;
    }

    public BigDecimal getNumtelef1() {
        return numtelef1;
    }

    public void setNumtelef1(BigDecimal numtelef1) {
        this.numtelef1 = numtelef1;
    }

    public BigDecimal getCod_corr_plataforma() {
        return cod_corr_plataforma;
    }

    public void setCod_corr_plataforma(BigDecimal cod_corr_plataforma) {
        this.cod_corr_plataforma = cod_corr_plataforma;
    }

    public String getNomesucursal() {
        return nomesucursal;
    }

    public void setNomesucursal(String nomesucursal) {
        this.nomesucursal = nomesucursal;
    }

    public String getCodcategoria() {
        return codcategoria;
    }

    public void setCodcategoria(String codcategoria) {
        this.codcategoria = codcategoria;
    }

    public BigDecimal getIde_grupo_corretores() {
        return ide_grupo_corretores;
    }

    public void setIde_grupo_corretores(BigDecimal ide_grupo_corretores) {
        this.ide_grupo_corretores = ide_grupo_corretores;
    }
}

package br.com.tokiomarine.seguradora.aceitacao.rest.client.dto;

public class RequestLogAceitacao {

    private Long codigoNegocio;
    private Long codigoEndosso;
    private String usuarioCadastramento;
    private String logPendente;
    private String textoLog;

    public Long getCodigoNegocio() {
        return codigoNegocio;
    }

    public void setCodigoNegocio(Long codigoNegocio) {
        this.codigoNegocio = codigoNegocio;
    }

    public Long getCodigoEndosso() {
        return codigoEndosso;
    }

    public void setCodigoEndosso(Long codigoEndosso) {
        this.codigoEndosso = codigoEndosso;
    }

    public String getUsuarioCadastramento() {
        return usuarioCadastramento;
    }

    public void setUsuarioCadastramento(String usuarioCadastramento) {
        this.usuarioCadastramento = usuarioCadastramento;
    }

    public String getLogPendente() {
        return logPendente;
    }

    public void setLogPendente(String logPendente) {
        this.logPendente = logPendente;
    }

    public String getTextoLog() {
        return textoLog;
    }

    public void setTextoLog(String textoLog) {
        this.textoLog = textoLog;
    }

}

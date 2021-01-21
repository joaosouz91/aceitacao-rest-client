package br.com.tokiomarine.seguradora.aceitacao.rest.client.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@JsonAutoDetect
public class ParametroRegrasVP extends ParametroVP implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1255618708835964382L;

  	public ParametroRegrasVP() {
	
	}
		
	private Long codCoberturaCascoAtual = null;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "ddMMyyyy")
	private Date dataEmissao = null;
	private String codigoCongenere;
	private Long numeroApoliceCongenere;	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "ddMMyyyy")
	private Date dataSaidaZeroKM;
	private Long qtdFranquia;
	private String tipoHistoricoEndosso;
		
	private String voucher;
		
	// Endosso ou renovação.
	private CodigoValorIS[] coberturasItemAnterior;
	private CodigoValorDescricao[] caracteristicasItemAnterior;
	private CodigoValorAcessorio[] acessoriosItemAnterior;
	private Long codCoberturaCascoAnterior = null;
	private Long qtdFranquiaAnterior;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "ddMMyyyy")
	private Date dataFimVigenciaAnterior;
	
	// Renovação
	private Long codModuloProdutoAnterior;
	
	// Bonus
	private Boolean vpJaGerada;
	private Long codCoberturaAnterior;
	private String chassiAnterior;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "ddMMyyyy")
	private Date dataCancelamentoAnterior;
		
	// Endosso
	private String codCategoriaEndosso;
	
	// Mensagens Retorno
	private List<String> mensagensTela;
	private List<String> mensagensPDF;
	
	// Usuario para Cancelamento do Agto.
	private String codUsuroUltmaAlter;
	
	// Utilizado para verificação de regra antiga do KCW
	private Boolean recepcaoRegraAntiga = null;
	
	// Utilizado para verificar aumento na cobertura de casco.
	private Long tipoComercializacao;
	private Double pctAceitacaoSeguroAtual;
	private Double pctAceitacaoSeguroAnterior;
	
	// Bonus
	private String motivoVPBonus;
	
	private StringBuffer logVerificaVP;
	private String motivoVP;
	private Long inicioExecucao;
		
	public StringBuffer getLogVerificaVP() {
	  return logVerificaVP;
	}
		
	public void setLogVerificaVP(StringBuffer logVerificaVP) {
	   this.logVerificaVP = logVerificaVP;
	}
		
	public Long getCodCoberturaCascoAtual() {
	   return codCoberturaCascoAtual;
	}
		
	public void setCodCoberturaCascoAtual(Long codCoberturaCascoAtual) {
	   this.codCoberturaCascoAtual = codCoberturaCascoAtual;
	}
		
	public Date getDataEmissao() {
	    return dataEmissao;
	}
		
	public void setDataEmissao(Date dataEmissao) {
	    this.dataEmissao = dataEmissao;
	}
		
	public String getCodigoCongenere() {
	    return codigoCongenere;
	}
		
	public void setCodigoCongenere(String codigoCongenere) {
	    this.codigoCongenere = codigoCongenere;
	}
		
	public Long getNumeroApoliceCongenere() {
	    return numeroApoliceCongenere;
	}
		
	public void setNumeroApoliceCongenere(Long numeroApoliceCongenere) {
	    this.numeroApoliceCongenere = numeroApoliceCongenere;
	}
		
	public Date getDataFimVigenciaAnterior() {
	    return dataFimVigenciaAnterior;
	}
		
	public void setDataFimVigenciaAnterior(Date dataFimVigenciaAnterior) {
	    this.dataFimVigenciaAnterior = dataFimVigenciaAnterior;
	}
		
	public List<String> getMensagensTela() {
	    return mensagensTela;
	}
		
	public void setMensagensTela(List<String> mensagensTela) {
	    this.mensagensTela = mensagensTela;
	}
		
	public List<String> getMensagensPDF() {
	     return mensagensPDF;
	}
		
	public void setMensagensPDF(List<String> mensagensPDF) {
	    this.mensagensPDF = mensagensPDF;
	}
		
	public Long getCodModuloProdutoAnterior() {
	    return codModuloProdutoAnterior;
	}
		
	public void setCodModuloProdutoAnterior(Long codModuloProdutoAnterior) {
	    this.codModuloProdutoAnterior = codModuloProdutoAnterior;
	}
		
	public Date getDataSaidaZeroKM() {
	    return dataSaidaZeroKM;
	}
		
	public void setDataSaidaZeroKM(Date dataSaidaZeroKM) {
	   this.dataSaidaZeroKM = dataSaidaZeroKM;
	}
		
	public Long getQtdFranquia() {
	   return qtdFranquia;
	}
		
	public void setQtdFranquia(Long qtdFranquia) {
	   this.qtdFranquia = qtdFranquia;
	}
		
	public Long getQtdFranquiaAnterior() {
	   return qtdFranquiaAnterior;
	}
		
	public void setQtdFranquiaAnterior(Long qtdFranquiaAnterior) {
	   this.qtdFranquiaAnterior = qtdFranquiaAnterior;
	}
		
	public String getTipoHistoricoEndosso() {
	   return tipoHistoricoEndosso;
	}
		
	public void setTipoHistoricoEndosso(String tipoHistoricoEndosso) {
	   this.tipoHistoricoEndosso = tipoHistoricoEndosso;
	}
		
	public CodigoValorIS[] getCoberturasItemAnterior() {
	    return coberturasItemAnterior;
	}
		
	public void setCoberturasItemAnterior(CodigoValorIS[] coberturasItemAnterior) {
	    this.coberturasItemAnterior = coberturasItemAnterior;
	}
		
	public CodigoValorDescricao[] getCaracteristicasItemAnterior() {
	   return caracteristicasItemAnterior;
	}
		
	public void setCaracteristicasItemAnterior(CodigoValorDescricao[] caracteristicasItemAnterior) {
	   this.caracteristicasItemAnterior = caracteristicasItemAnterior;
	}
		
		public CodigoValorAcessorio[] getAcessoriosItemAnterior() {
		        return acessoriosItemAnterior;
		}
		
		public void setAcessoriosItemAnterior(CodigoValorAcessorio[] acessoriosItemAnterior) {
		        this.acessoriosItemAnterior = acessoriosItemAnterior;
		}
		
		public Long getCodCoberturaCascoAnterior() {
		        return codCoberturaCascoAnterior;
		}
		
		public void setCodCoberturaCascoAnterior(Long codCoberturaCascoAnterior) {
		        this.codCoberturaCascoAnterior = codCoberturaCascoAnterior;
		}
		
		public Boolean getVpJaGerada() {
		        return vpJaGerada;
		}
		
		public void setVpJaGerada(Boolean vpJaGerada) {
		        this.vpJaGerada = vpJaGerada;
		}
		
		public Long getCodCoberturaAnterior() {
		        return codCoberturaAnterior;
		}
		
		public void setCodCoberturaAnterior(Long codCoberturaAnterior) {
		        this.codCoberturaAnterior = codCoberturaAnterior;
		}
		
		public String getChassiAnterior() {
		        return chassiAnterior;
		}
		
		public void setChassiAnterior(String chassiAnterior) {
		        this.chassiAnterior = chassiAnterior;
		}
		
		public Date getDataCancelamentoAnterior() {
		        return dataCancelamentoAnterior;
		}
		
		public void setDataCancelamentoAnterior(Date dataCancelamentoAnterior) {
		        this.dataCancelamentoAnterior = dataCancelamentoAnterior;
		}
		
		public String getVoucher() {
		        return voucher;
		}
		
		public void setVoucher(String voucher) {
		        this.voucher = voucher;
		}
		
		public String getCodCategoriaEndosso() {
		        return codCategoriaEndosso;
		}
		
		public void setCodCategoriaEndosso(String codCategoriaEndosso) {
		        this.codCategoriaEndosso = codCategoriaEndosso;
		}
		
		@JsonIgnore
		public Long[] getChaveSistema() {
		
		        List<Long> codigos = new ArrayList<Long>();
		
		        switch (getSistemaChamador().intValue()) {
		
		        // --------------------------------------------------------------------------------------------------
		                        case 1: // KCW
		                        case 9: // Multicalculo
		                        case 13:/* TrasmissaoKCW */
		                        case 20:/* TrasmissaoKCW */
		                        case 21:/* TrasmissaoKCW */
		                        case 22:/* WSCotador */
		                                        codigos.add(getNumCalculo());
		                                        break;
		                        // --------------------------------------------------------------------------------------------------
		                        case 5: /* RecepSSV */
		                                        codigos.add(getNumCalculo());
		                        case 4: // EmissaoSSV
		                        case 8: // RestrBonus
		                        case 24: // Gera Restrição
		                                        codigos.add(getNumItem());
		                                        if (getCodEndosso() != null) {
		                                                       codigos.add(getCodEndosso());
		                                        }
		                                        break;
		                        case 10: /* LiberacaoProposta */
		                                        codigos.add(getNumItem());
		                                        break;
		                        // --------------------------------------------------------------------------------------------------
		                        case 6: // EndossoSSV
		                        case 7: // EndossoWEB
		                        case 11: // LiberacaoEndossoSSV
		                        case 12: /* LiberacaoEndossoWEB */
		                                        codigos.add(getCodEndosso());
		                                        break;
		                        // --------------------------------------------------------------------------------------------------
		                        case 3: /* EndossoPlat */
		                        case 2: /* EmissaoPlat */
		                        case 23:/* Cotador CTF */
		                                        codigos.add(getCodNegocio());
		                                        codigos.add(getNumItem());
		                                        break;
		                        case 25: // Endosso CTF
		                                        codigos.add(getNumItem());
		                                        codigos.add(getCodEndosso());
		                                        break;
		        // --------------------------------------------------------------------------------------------------
		        }
		
		        Long[] retorno = new Long[codigos.size()];
		        return codigos.toArray(retorno);
		}
		
		public String getCodUsuroUltmaAlter() {
		        return codUsuroUltmaAlter;
		}
		
		public void setCodUsuroUltmaAlter(String codUsuroUltmaAlter) {
		        this.codUsuroUltmaAlter = codUsuroUltmaAlter;
		}
		
		public Boolean getRecepcaoRegraAntiga() {
		        return recepcaoRegraAntiga;
		}
		
		public void setRecepcaoRegraAntiga(Boolean recepcaoRegraAntiga) {
		        this.recepcaoRegraAntiga = recepcaoRegraAntiga;
		}
		
		public Long getTipoComercializacao() {
		        return tipoComercializacao;
		}
		
		public void setTipoComercializacao(Long tipoComercializacao) {
		        this.tipoComercializacao = tipoComercializacao;
		}
		
		public Double getPctAceitacaoSeguroAtual() {
		        return pctAceitacaoSeguroAtual;
		}
		
		public void setPctAceitacaoSeguroAtual(Double pctAceitacaoSeguroAtual) {
		        this.pctAceitacaoSeguroAtual = pctAceitacaoSeguroAtual;
		}
		
		public Double getPctAceitacaoSeguroAnterior() {
		        return pctAceitacaoSeguroAnterior;
		}
		
		public void setPctAceitacaoSeguroAnterior(Double pctAceitacaoSeguroAnterior) {
		        this.pctAceitacaoSeguroAnterior = pctAceitacaoSeguroAnterior;
		}
		
		public String getMotivoVPBonus() {
		        return motivoVPBonus;
		}
		
		public void setMotivoVPBonus(String motivoVPBonus) {
		        this.motivoVPBonus = motivoVPBonus;
		}
		
		public String getMotivoVP() {
		        return motivoVP;
		}
		
		public void setMotivoVP(String motivoVP) {
		        this.motivoVP = motivoVP;
		}
		public Long getInicioExecucao() {
		        return inicioExecucao;
		}
		
		public void setInicioExecucao(Long inicioExecucao) {
		        this.inicioExecucao = inicioExecucao;
		}
		
		public Long obterTempoProcessamento() {
		        return System.currentTimeMillis() - this.inicioExecucao;
		}

}

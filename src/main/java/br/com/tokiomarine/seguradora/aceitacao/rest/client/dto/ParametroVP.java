package br.com.tokiomarine.seguradora.aceitacao.rest.client.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.tokiomarine.seguradora.aceitacao.rest.client.util.ModelRequest;

@JsonAutoDetect()
public class ParametroVP implements ModelRequest{
	private Long sistemaChamador; 
	private Long numItem; 
	private Long codEndosso; 
	private String tipoProduto; 
	private Long tipoSeguro; 
	private String cpfCnpj; 
	private Long codCorretor; 
	private String enderecoCorrespondencia; 
	private String numeroLogradouro; 
	private String complementoEndereco; 
	private String bairro; 
	private String cep; 
	private String cidade; 
	private String UF; 
	private String nomeCliente; 
	private String cdAdptoEixo; 
	private String tipoFranquia; 
	private String indicadorFrota; 
	private String tipoCarroceria; 
	private Long codModuloProduto; 
	private Long itemAnterior; 
	private Long numCalculo; 
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "ddMMyyyy")
	private Date dataInicioVigencia; 
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "ddMMyyyy")
	private Date dataFimVigencia; 
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "ddMMyyyy")
	private Date dataTransmissao; 
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "ddMMyyyy")
	private Date dataCalculo;
	private CodigoValorAcessorio[] acessorios; 
	private CodigoValorDescricao[] caracteristicas; 
	private CodigoValorIS[] coberturas; 
	private Double pcAceitacaoSeguro; 
	private Long anoFabricacao; 
	private Long anoModelo; 
	private Long codNegocio; 
	private String chassi; 
	private String codFIPE; 
	private String placa; 
	private String indicadorCarroceria; 
	private String indicadorZeroKM; 
	private String nomeFabricante; 
	private Long codigoVeiculoTMS; 
	private Long codigoCliente; 

	public Long getSistemaChamador() { 
		return sistemaChamador;
	}
	public Long getNumItem() { 
		return numItem;
	}
	public Long getCodEndosso() { 
		return codEndosso;
	}
	public String getTipoProduto() { 
		return tipoProduto;
	}
	public Long getTipoSeguro() { 
		return tipoSeguro;
	}
	public String getCpfCnpj() { 
		return cpfCnpj;
	}
	public Long getCodCorretor() { 
		return codCorretor;
	}
	public String getEnderecoCorrespondencia() { 
		return enderecoCorrespondencia;
	}
	public String getNumeroLogradouro() { 
		return numeroLogradouro;
	}
	public String getComplementoEndereco() { 
		return complementoEndereco;
	}
	public String getBairro() { 
		return bairro;
	}
	public String getCep() { 
		return cep;
	}
	public String getCidade() { 
		return cidade;
	}
	public String getUF() { 
		return UF;
	}
	public String getNomeCliente() { 
		return nomeCliente;
	}
	public String getCdAdptoEixo() { 
		return cdAdptoEixo;
	}
	public String getTipoFranquia() { 
		return tipoFranquia;
	}
	public String getIndicadorFrota() { 
		return indicadorFrota;
	}
	public String getTipoCarroceria() { 
		return tipoCarroceria;
	}
	public Long getCodModuloProduto() { 
		return codModuloProduto;
	}
	public Long getItemAnterior() { 
		return itemAnterior;
	}
	public Long getNumCalculo() { 
		return numCalculo;
	}
	public Date getDataInicioVigencia() { 
		return dataInicioVigencia;
	}
	public Date getDataFimVigencia() { 
		return dataFimVigencia;
	}
	public Date getDataTransmissao() { 
		return dataTransmissao;
	}
	public Date getDataCalculo() { 
		return dataCalculo;
	}
	public CodigoValorAcessorio[] getAcessorios() { 
		return acessorios;
	}
	public CodigoValorDescricao[] getCaracteristicas() { 
		return caracteristicas;
	}
	public CodigoValorIS[] getCoberturas() { 
		return coberturas;
	}
	public Double getPcAceitacaoSeguro() { 
		return pcAceitacaoSeguro;
	}
	public Long getAnoFabricacao() { 
		return anoFabricacao;
	}
	public Long getAnoModelo() { 
		return anoModelo;
	}
	public Long getCodNegocio() { 
		return codNegocio;
	}
	public String getChassi() { 
		return chassi;
	}
	public String getCodFIPE() { 
		return codFIPE;
	}
	public String getPlaca() { 
		return placa;
	}
	public String getIndicadorCarroceria() { 
		return indicadorCarroceria;
	}
	public String getIndicadorZeroKM() { 
		return indicadorZeroKM;
	}
	public String getNomeFabricante() { 
		return nomeFabricante;
	}
	public Long getCodigoVeiculoTMS() { 
		return codigoVeiculoTMS;
	}
	public Long getCodigoCliente() { 
		return codigoCliente;
	}

	public void setSistemaChamador( Long sistemaChamador ) { 
		this.sistemaChamador = sistemaChamador;
	}
	public void setNumItem( Long numItem ) { 
		this.numItem = numItem;
	}
	public void setCodEndosso( Long codEndosso ) { 
		this.codEndosso = codEndosso;
	}
	public void setTipoProduto( String tipoProduto ) { 
		this.tipoProduto = tipoProduto;
	}
	public void setTipoSeguro( Long tipoSeguro ) { 
		this.tipoSeguro = tipoSeguro;
	}
	public void setCpfCnpj( String cpfCnpj ) { 
		this.cpfCnpj = cpfCnpj;
	}
	public void setCodCorretor( Long codCorretor ) { 
		this.codCorretor = codCorretor;
	}
	public void setEnderecoCorrespondencia( String enderecoCorrespondencia ) { 
		this.enderecoCorrespondencia = enderecoCorrespondencia;
	}
	public void setNumeroLogradouro( String numeroLogradouro ) { 
		this.numeroLogradouro = numeroLogradouro;
	}
	public void setComplementoEndereco( String complementoEndereco ) { 
		this.complementoEndereco = complementoEndereco;
	}
	public void setBairro( String bairro ) { 
		this.bairro = bairro;
	}
	public void setCep( String cep ) { 
		this.cep = cep;
	}
	public void setCidade( String cidade ) { 
		this.cidade = cidade;
	}
	public void setUF( String UF ) { 
		this.UF = UF;
	}
	public void setNomeCliente( String nomeCliente ) { 
		this.nomeCliente = nomeCliente;
	}
	public void setCdAdptoEixo( String cdAdptoEixo ) { 
		this.cdAdptoEixo = cdAdptoEixo;
	}
	public void setTipoFranquia( String tipoFranquia ) { 
		this.tipoFranquia = tipoFranquia;
	}
	public void setIndicadorFrota( String indicadorFrota ) { 
		this.indicadorFrota = indicadorFrota;
	}
	public void setTipoCarroceria( String tipoCarroceria ) { 
		this.tipoCarroceria = tipoCarroceria;
	}
	public void setCodModuloProduto( Long codModuloProduto ) { 
		this.codModuloProduto = codModuloProduto;
	}
	public void setItemAnterior( Long itemAnterior ) { 
		this.itemAnterior = itemAnterior;
	}
	public void setNumCalculo( Long numCalculo ) { 
		this.numCalculo = numCalculo;
	}
	public void setDataInicioVigencia( Date dataInicioVigencia ) { 
		this.dataInicioVigencia = dataInicioVigencia;
	}
	public void setDataFimVigencia( Date dataFimVigencia ) { 
		this.dataFimVigencia = dataFimVigencia;
	}
	public void setDataTransmissao( Date dataTransmissao ) { 
		this.dataTransmissao = dataTransmissao;
	}
	public void setDataCalculo( Date dataCalculo ) { 
		this.dataCalculo = dataCalculo;
	}
	public void setAcessorios( CodigoValorAcessorio[] acessorios ) { 
		this.acessorios = acessorios;
	}
	public void setCaracteristicas( CodigoValorDescricao[] caracteristicas ) { 
		this.caracteristicas = caracteristicas;
	}
	public void setCoberturas( CodigoValorIS[] coberturas ) { 
		this.coberturas = coberturas;
	}
	public void setPcAceitacaoSeguro( Double pcAceitacaoSeguro ) { 
		this.pcAceitacaoSeguro = pcAceitacaoSeguro;
	}
	public void setAnoFabricacao( Long anoFabricacao ) { 
		this.anoFabricacao = anoFabricacao;
	}
	public void setAnoModelo( Long anoModelo ) { 
		this.anoModelo = anoModelo;
	}
	public void setCodNegocio( Long codNegocio ) { 
		this.codNegocio = codNegocio;
	}
	public void setChassi( String chassi ) { 
		this.chassi = chassi;
	}
	public void setCodFIPE( String codFIPE ) { 
		this.codFIPE = codFIPE;
	}
	public void setPlaca( String placa ) { 
		this.placa = placa;
	}
	public void setIndicadorCarroceria( String indicadorCarroceria ) { 
		this.indicadorCarroceria = indicadorCarroceria;
	}
	public void setIndicadorZeroKM( String indicadorZeroKM ) { 
		this.indicadorZeroKM = indicadorZeroKM;
	}
	public void setNomeFabricante( String nomeFabricante ) { 
		this.nomeFabricante = nomeFabricante;
	}
	public void setCodigoVeiculoTMS( Long codigoVeiculoTMS ) { 
		this.codigoVeiculoTMS = codigoVeiculoTMS;
	}
	public void setCodigoCliente( Long codigoCliente ) { 
		this.codigoCliente = codigoCliente;
	}

}


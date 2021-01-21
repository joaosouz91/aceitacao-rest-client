package br.com.tokiomarine.seguradora.aceitacao.rest.client.dto;

public class CodigoValorIS {
	private Long codigo; 
	private Double valor; 

	public Long getCodigo() { 
		return codigo;
	}
	public Double getValor() { 
		return valor;
	}

	public void setCodigo( Long codigo ) { 
		this.codigo = codigo;
	}
	public void setValor( Double valor ) { 
		this.valor = valor;
	}

}


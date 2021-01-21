package br.com.tokiomarine.seguradora.aceitacao.rest.client.dto;

public class CodigoValorDescricao {
	private Long codigo; 
	private Long valor; 
	private String descricao; 

	public Long getCodigo() { 
		return codigo;
	}
	public Long getValor() { 
		return valor;
	}
	public String getDescricao() { 
		return descricao;
	}

	public void setCodigo( Long codigo ) { 
		this.codigo = codigo;
	}
	public void setValor( Long valor ) { 
		this.valor = valor;
	}
	public void setDescricao( String descricao ) { 
		this.descricao = descricao;
	}

}


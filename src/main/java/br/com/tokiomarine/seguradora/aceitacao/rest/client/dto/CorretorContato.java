package br.com.tokiomarine.seguradora.aceitacao.rest.client.dto;
import java.math.BigDecimal;

public class CorretorContato {
	private String codcorretor; 
	private String codinterAcx; 
	private String nomecontato; 
	private String sexo; 
	private String area; 
	private String email; 
	private BigDecimal dddtelef; 
	private BigDecimal numtelef; 
	private String compltelef; 
	private BigDecimal dddfax; 
	private BigDecimal numfax; 
	private String complfax; 

	public String getCodcorretor() { 
		return codcorretor;
	}
	public String getCodinterAcx() { 
		return codinterAcx;
	}
	public String getNomecontato() { 
		return nomecontato;
	}
	public String getSexo() { 
		return sexo;
	}
	public String getArea() { 
		return area;
	}
	public String getEmail() { 
		return email;
	}
	public BigDecimal getDddtelef() { 
		return dddtelef;
	}
	public BigDecimal getNumtelef() { 
		return numtelef;
	}
	public String getCompltelef() { 
		return compltelef;
	}
	public BigDecimal getDddfax() { 
		return dddfax;
	}
	public BigDecimal getNumfax() { 
		return numfax;
	}
	public String getComplfax() { 
		return complfax;
	}

	public void setCodcorretor( String codcorretor ) { 
		this.codcorretor = codcorretor;
	}
	public void setCodinterAcx( String codinterAcx ) { 
		this.codinterAcx = codinterAcx;
	}
	public void setNomecontato( String nomecontato ) { 
		this.nomecontato = nomecontato;
	}
	public void setSexo( String sexo ) { 
		this.sexo = sexo;
	}
	public void setArea( String area ) { 
		this.area = area;
	}
	public void setEmail( String email ) { 
		this.email = email;
	}
	public void setDddtelef( BigDecimal dddtelef ) { 
		this.dddtelef = dddtelef;
	}
	public void setNumtelef( BigDecimal numtelef ) { 
		this.numtelef = numtelef;
	}
	public void setCompltelef( String compltelef ) { 
		this.compltelef = compltelef;
	}
	public void setDddfax( BigDecimal dddfax ) { 
		this.dddfax = dddfax;
	}
	public void setNumfax( BigDecimal numfax ) { 
		this.numfax = numfax;
	}
	public void setComplfax( String complfax ) { 
		this.complfax = complfax;
	}

}


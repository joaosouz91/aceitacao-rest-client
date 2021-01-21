package br.com.tokiomarine.seguradora.aceitacao.rest.client.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class Acxcdpa0020001RecLocHieraUser
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  private BigDecimal cdtiploc;
  private String codlocadm;
  private BigDecimal codlocal;
  private BigDecimal codrede;
  private String dataencerra;
  private String desclocal;
  private String sgemp;

  public BigDecimal getCdtiploc()
  {
    return this.cdtiploc;
  }

  public String getCodlocadm()
  {
    return this.codlocadm;
  }

  public BigDecimal getCodlocal()
  {
    return this.codlocal;
  }

  public BigDecimal getCodrede()
  {
    return this.codrede;
  }

  public String getDataencerra()
  {
    return this.dataencerra;
  }

  public String getDesclocal()
  {
    return this.desclocal;
  }

  public String getSgemp()
  {
    return this.sgemp;
  }

  public void setCdtiploc(BigDecimal cdtiploc)
  {
    this.cdtiploc = cdtiploc;
  }

  public void setCodlocadm(String codlocadm)
  {
    this.codlocadm = codlocadm;
  }

  public void setCodlocal(BigDecimal codlocal)
  {
    this.codlocal = codlocal;
  }

  public void setCodrede(BigDecimal codrede)
  {
    this.codrede = codrede;
  }

  public void setDataencerra(String dataencerra)
  {
    this.dataencerra = dataencerra;
  }

  public void setDesclocal(String desclocal)
  {
    this.desclocal = desclocal;
  }

  public void setSgemp(String sgemp)
  {
    this.sgemp = sgemp;
  }
}
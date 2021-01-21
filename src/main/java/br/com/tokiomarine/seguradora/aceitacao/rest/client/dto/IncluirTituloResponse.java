package br.com.tokiomarine.seguradora.aceitacao.rest.client.dto;

import java.io.Serializable;
import java.util.Calendar;

public class IncluirTituloResponse implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -8435177943267136189L;

		private String returnFunction;
		private String numTitulo;
		private Calendar gdtFecPagoServ;
		private Double nmToPagoServ;
		private String codigoRetorno;
		private String descricaoCodigoRetorno;
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
		public String getReturnFunction() {
			return returnFunction;
		}
		public void setReturnFunction(String returnFunction) {
			this.returnFunction = returnFunction;
		}
		public String getNumTitulo() {
			return numTitulo;
		}
		public void setNumTitulo(String numTitulo) {
			this.numTitulo = numTitulo;
		}
		public Calendar getGdtFecPagoServ() {
			return gdtFecPagoServ;
		}
		public void setGdtFecPagoServ(Calendar gdtFecPagoServ) {
			this.gdtFecPagoServ = gdtFecPagoServ;
		}
		public Double getNmToPagoServ() {
			return nmToPagoServ;
		}
		public void setNmToPagoServ(Double nmToPagoServ) {
			this.nmToPagoServ = nmToPagoServ;
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
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
}
package com.br.bancoDigital.model;

public abstract class Cliente extends GenerateId{
	private String nrCpfCnpj;
	private String nmCliente;
	private String tpCliente;
	private String tpDocumento;
	private String idDocumento;
	
	
	public String getNrCpfCnpj() {
		return nrCpfCnpj;
	}
	public void setNrCpfCnpj(String nrCpfCnpj) {
		this.nrCpfCnpj = nrCpfCnpj;
	}
	public String getNmCliente() {
		return nmCliente;
	}
	public void setNmCliente(String nmCliente) {
		this.nmCliente = nmCliente;
	}
	public String getTpCliente() {
		return tpCliente;
	}
	public void setTpCliente(String tpCliente) {
		this.tpCliente = tpCliente;
	}
	public String getTpDocumento() {
		return tpDocumento;
	}
	public void setTpDocumento(String tpDocumento) {
		this.tpDocumento = tpDocumento;
	}
	public String getIdDocumento() {
		return idDocumento;
	}
	public void setIdDocumento(String idDocumento) {
		this.idDocumento = idDocumento;
	}
	
	
	public Cliente(String nrCpfCnpj, String nmCliente, String tpCliente, String tpDocumento, String idDocumento) {
		this.nrCpfCnpj = nrCpfCnpj;
		this.nmCliente = nmCliente;
		this.tpCliente = tpCliente;
		this.tpDocumento = tpDocumento;
		this.idDocumento = idDocumento;
	}
	
	public Cliente() {}
	
}
package com.br.bancoDigital.model;

import jakarta.persistence.Entity;

@Entity
public class PessoaJuridica extends Cliente {
	private String dtFundacao;
	private String nmRazaoSocial;
	private String nmFantasia;
	private String seguimento;
	private Double faturamentoAnual;
	
	
	public String getDtFundacao() {
		return dtFundacao;
	}
	public void setDtFundacao(String dtFundacao) {
		this.dtFundacao = dtFundacao;
	}
	public String getNmRazaoSocial() {
		return nmRazaoSocial;
	}
	public void setNmRazaoSocial(String nmRazaoSocial) {
		this.nmRazaoSocial = nmRazaoSocial;
	}
	public String getNmFantasia() {
		return nmFantasia;
	}
	public void setNmFantasia(String nmFantasia) {
		this.nmFantasia = nmFantasia;
	}
	public String getSeguimento() {
		return seguimento;
	}
	public void setSeguimento(String seguimento) {
		this.seguimento = seguimento;
	}
	public double getFaturamentoAnual() {
		return faturamentoAnual;
	}
	public void setFaturamentoAnual(Double faturamentoAnual) {
		this.faturamentoAnual = faturamentoAnual;
	}
	
	
	public PessoaJuridica(Long id, Integer nrCpfCnpj, String nmCliente, String tpCliente, String tpDocumento,
			String idDocumento, String dtFundacao, String nmRazaoSocial, String nmFantasia, String seguimento,
			Double faturamentoAnual) {
		this.dtFundacao = dtFundacao;
		this.nmRazaoSocial = nmRazaoSocial;
		this.nmFantasia = nmFantasia;
		this.seguimento = seguimento;
		this.faturamentoAnual = faturamentoAnual;
	}
	
	public PessoaJuridica () {}
}
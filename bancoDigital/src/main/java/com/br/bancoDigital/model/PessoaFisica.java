package com.br.bancoDigital.model;

import jakarta.persistence.Entity;

@Entity
public class PessoaFisica extends Cliente {
	private String dtNascimento;
	private String nmMae;
	private String nmPai; 
	private String nmConjugue;
	private String dsEstadoCivil;
	private Double vlRendaMensal;
	private String dsProfissao;
	
	
	public String getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	public String getNmMae() {
		return nmMae;
	}
	public void setNmMae(String nmMae) {
		this.nmMae = nmMae;
	}
	public String getNmPai() {
		return nmPai;
	}
	public void setNmPai(String nmPai) {
		this.nmPai = nmPai;
	}
	public String getNmConjugue() {
		return nmConjugue;
	}
	public void setNmConjugue(String nmConjugue) {
		this.nmConjugue = nmConjugue;
	}
	public String getDsEstadoCivil() {
		return dsEstadoCivil;
	}
	public void setDsEstadoCivil(String dsEstadoCivil) {
		this.dsEstadoCivil = dsEstadoCivil;
	}
	public double getVlRendaMensal() {
		return vlRendaMensal;
	}
	public void setVlRendaMensal(Double vlRendaMensal) {
		this.vlRendaMensal = vlRendaMensal;
	}
	public String getDsProfissao() {
		return dsProfissao;
	}
	public void setDsProfissao(String dsProfissao) {
		this.dsProfissao = dsProfissao;
	}
	
	
	public PessoaFisica(String nrCpfCnpj, String nmCliente, String tpCliente, String tpDocumento,
			String idDocumento, String dtNascimento, String nmMae, String nmPai, String nmConjugue,
			String dsEstadoCivil, Double vlRendaMensal, String dsProfissao) {
		this.dtNascimento = dtNascimento;
		this.nmMae = nmMae;
		this.nmPai = nmPai;
		this.nmConjugue = nmConjugue;
		this.dsEstadoCivil = dsEstadoCivil;
		this.vlRendaMensal = vlRendaMensal;
		this.dsProfissao = dsProfissao;
	}
	
	public PessoaFisica() {}
}

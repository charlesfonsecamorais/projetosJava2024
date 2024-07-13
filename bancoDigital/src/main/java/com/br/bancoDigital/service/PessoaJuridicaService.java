package com.br.bancoDigital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.bancoDigital.model.PessoaJuridica;
import com.br.bancoDigital.repository.PessoaJuridicaRepository;

@Service
public class PessoaJuridicaService implements ServiceInterface<PessoaJuridica>{
	@Autowired 
	private PessoaJuridicaRepository repository;
	
	@Override
	public PessoaJuridica create(PessoaJuridica obj) {
		repository.save(obj);
		return obj;
	}

	@Override
	public PessoaJuridica findById(Long id) {
		repository.findById(id);
		return repository.findById(id).get();
	}

	@Override
	public List<PessoaJuridica> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public boolean update(PessoaJuridica obj) {
		repository.save(obj);
		return true;
	}

	@Override
	public boolean delete(Long id) {
		repository.deleteById(id);
		return true;
	}
	
}

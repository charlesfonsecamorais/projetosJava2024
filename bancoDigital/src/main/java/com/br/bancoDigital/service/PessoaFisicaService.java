package com.br.bancoDigital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.bancoDigital.model.PessoaFisica;
import com.br.bancoDigital.repository.PessoaFisicaRepository;

@Service
public class PessoaFisicaService implements ServiceInterface<PessoaFisica> {
	@Autowired
	private PessoaFisicaRepository repository;
	
	@Override
	public PessoaFisica create(PessoaFisica obj) {
		repository.save(obj);
		return obj;
	}

	@Override
	public PessoaFisica findById(Long id) {
		repository.findById(id);
		return repository.findById(id).get();
	}

	@Override
	public List<PessoaFisica> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public boolean update(PessoaFisica obj) {
		repository.save(obj);
		return true;
	}

	@Override
	public boolean delete(Long id) {
		repository.deleteById(id);
		return true;
	}

}

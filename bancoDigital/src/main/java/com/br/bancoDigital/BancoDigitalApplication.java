package com.br.bancoDigital;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.br.bancoDigital.model.PessoaFisica;
import com.br.bancoDigital.service.PessoaFisicaService;

@SpringBootApplication
public class BancoDigitalApplication implements CommandLineRunner{
	@Autowired
	PessoaFisicaService servicePF;
	
	public static void main(String[] args) {
		SpringApplication.run(BancoDigitalApplication.class, args);
			
	}

	@Override
	public void run(String... args) throws Exception {
//		String nrCpfCnpj, String nmCliente, String tpCliente, String tpDocumento,
//		String idDocumento, String dtNascimento, String nmMae, String nmPai, String nmConjugue,
//		String dsEstadoCivil, Double vlRendaMensal, String dsProfissao
		PessoaFisica P1 = new PessoaFisica("25045860860", "Charles Fonseca Morais", "PF", "RG", "263638911", "24/07/1974", "Vera Orsini Fonseca", "Darci da Silva Morais",
				"Rosana de Lourdes Catelhano Peralta", "Casado", 2888.00, "Analista de Suporte TI");
		
		PessoaFisica P2 = new PessoaFisica("13378412852", "Rosana de Lourdes Castelhano Peralta", "PF", "RG", "53233231", "14/07/1970", "Maria Clementina Castelhano Peralta", 
				"Manuel de Jesus Peralta", "Charles Fonseca Morais", "Casada", 2100.00, "Recepcionista");
		
		PessoaFisica P3 = new PessoaFisica("54565499800", "Vera Orsini Fonseca", "PF", "RG", "", "25/12/1948", "Ondina Orsini da Fonseca", "Manoel Eustáquio da Fonseca",
				"Darci da Silva Morais", "Viuva", 4000.00, "Pensionista");
		
		servicePF.create(P1);
		servicePF.create(P2);
		servicePF.create(P3);
		
	}
	
}

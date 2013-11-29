package br.edu.uniritter.liquid.democracy.service.impl;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import br.com.caelum.vraptor.ioc.Component;
import br.edu.uniritter.liquid.democracy.model.User;
import br.edu.uniritter.liquid.democracy.repository.CandidateRepository;
import br.edu.uniritter.liquid.democracy.repository.SecurityRepository;
import br.edu.uniritter.liquid.democracy.service.CandidateService;
import br.edu.uniritter.liquid.democracy.service.SecurityService;
import br.edu.uniritter.liquid.democracy.utils.SecurityUtils;

@Component
public class CandidateServiceImpl implements CandidateService {

	private final CandidateRepository repository;

	public CandidateServiceImpl(CandidateRepository repository) {
		this.repository = repository;
	}

	@Override
	public void create(Candidate user) {
		// TODO Auto-generated method stub
		
	}

}

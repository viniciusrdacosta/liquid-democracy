<<<<<<< HEAD
package br.edu.uniritter.liquid.democracy.service.impl;

import java.util.List;

import br.com.caelum.vraptor.ioc.Component;
import br.edu.uniritter.liquid.democracy.model.Citizen;
import br.edu.uniritter.liquid.democracy.repository.CitizenRepository;
import br.edu.uniritter.liquid.democracy.service.CitizenService;

@Component
public class CitizenServiceImpl implements CitizenService {
	
	private final CitizenRepository repository;

	public CitizenServiceImpl(CitizenRepository repository) {
		this.repository = repository;
	}

	@Override
	public void create(Citizen candidate) {
		repository.create(candidate);
	}

	@Override
	public List<Citizen> findAll() {
		return repository.findAll();
	}

	@Override
	public Citizen update(Citizen citizen) {
		return repository.update(citizen);
	}

	@Override
	public void delete(Citizen citizen) {
		repository.delete(citizen);
	}

	@Override
	public List<Citizen> findByName(String name) {
		return repository.findByName(name);
	}
}
=======
package br.edu.uniritter.liquid.democracy.service.impl;

import java.util.List;

import br.com.caelum.vraptor.ioc.Component;
import br.edu.uniritter.liquid.democracy.model.Citizen;
import br.edu.uniritter.liquid.democracy.repository.CitizenRepository;
import br.edu.uniritter.liquid.democracy.service.CitizenService;

@Component
public class CitizenServiceImpl implements CitizenService {
	
	private final CitizenRepository repository;

	public CitizenServiceImpl(CitizenRepository repository) {
		this.repository = repository;
	}

	@Override
	public void create(Citizen candidate) {
		repository.create(candidate);
	}

	@Override
	public List<Citizen> findAll() {
		return repository.findAll();
	}

	@Override
	public Citizen update(Citizen citizen) {
		return repository.update(citizen);
	}

	@Override
	public void delete(Citizen citizen) {
		repository.delete(citizen);
	}

	@Override
	public List<Citizen> findByName(String name) {
		return repository.findByName(name);
	}
}
>>>>>>> 5eb408aa5145ed5336c4712bc59ea628dd0154bd

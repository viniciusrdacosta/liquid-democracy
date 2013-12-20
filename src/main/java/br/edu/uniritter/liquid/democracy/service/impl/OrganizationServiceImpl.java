package br.edu.uniritter.liquid.democracy.service.impl;

import java.util.List;

import br.com.caelum.vraptor.ioc.Component;
import br.edu.uniritter.liquid.democracy.model.Citizen;
import br.edu.uniritter.liquid.democracy.model.Organization;
import br.edu.uniritter.liquid.democracy.repository.OrganizationRepository;
import br.edu.uniritter.liquid.democracy.service.OrganizationService;

@Component
public class OrganizationServiceImpl implements OrganizationService{
	
	private final OrganizationRepository repository;
	
	public OrganizationServiceImpl(OrganizationRepository repository){
		this.repository = repository;
	}

	@Override
	public List<Organization> findAll() {
		return repository.findAll();
	}

	@Override
	public void create(Organization organization) {
		repository.create(organization);
	}

	@Override
	public Organization update(Organization organization) {
		return repository.update(organization);
	}

	@Override
	public void delete(Organization organization) {
		repository.delete(organization);
	}

	@Override
	public List<Organization> findByName(String name) {
		return repository.findByName(name);
	}
	
	@Override
	public Organization findById(Long id) {
		return repository.findById(id);
	}

}

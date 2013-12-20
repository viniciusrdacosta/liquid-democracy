package br.edu.uniritter.liquid.democracy.repository;

import java.util.List;

import br.edu.uniritter.liquid.democracy.model.Organization;

public interface OrganizationRepository {

	List<Organization> findAll();
	
	void create(Organization organization);
	
	Organization update(Organization organization);
	
	void delete(Organization organization);
	
	List<Organization> findByName(String name);
	
	Organization findById(Long id);
}

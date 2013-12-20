package br.edu.uniritter.liquid.democracy.dao;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.ioc.Component;
import br.edu.uniritter.liquid.democracy.model.Organization;
import br.edu.uniritter.liquid.democracy.repository.OrganizationRepository;

@Component
public class OrganizationDao extends AbstractDao<Organization> implements OrganizationRepository{

	protected OrganizationDao(EntityManager entityManager) {
		super(entityManager);
	}
}

package br.edu.uniritter.liquid.democracy.dao;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.ioc.Component;
import br.edu.uniritter.liquid.democracy.model.Citizen;
import br.edu.uniritter.liquid.democracy.repository.CitizenRepository;

@Component
public class CitizenDao extends AbstractDao<Citizen> implements CitizenRepository {

	protected CitizenDao(EntityManager entityManager) {
		super(entityManager);
	}
	
	
}

package br.edu.uniritter.liquid.democracy.dao;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.ioc.Component;
import br.edu.uniritter.liquid.democracy.model.Area;
import br.edu.uniritter.liquid.democracy.repository.AreaRepository;

@Component
public class AreaDao extends AbstractDao<Area> implements AreaRepository{

	protected AreaDao(EntityManager entityManager) {
		super(entityManager);
	}
}

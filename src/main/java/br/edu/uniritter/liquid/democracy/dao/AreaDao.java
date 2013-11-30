package br.edu.uniritter.liquid.democracy.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.edu.uniritter.liquid.democracy.model.Area;
import br.edu.uniritter.liquid.democracy.repository.AreaRepository;

public class AreaDao extends AbstractDao<Area> implements AreaRepository{

	protected AreaDao(EntityManager entityManager) {
		super(entityManager);
	
	}

	@Override
	public List<Area> findAll() {
		return super.findAll();
	}
	
	

}

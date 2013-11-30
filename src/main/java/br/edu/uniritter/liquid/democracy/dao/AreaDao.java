package br.edu.uniritter.liquid.democracy.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.edu.uniritter.liquid.democracy.model.Area;
import br.edu.uniritter.liquid.democracy.repository.AreaRepository;

public class AreaDao extends AbstractDao<Area> implements AreaRepository{

	protected AreaDao(EntityManager entityManager) {
		super(entityManager);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Area> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}

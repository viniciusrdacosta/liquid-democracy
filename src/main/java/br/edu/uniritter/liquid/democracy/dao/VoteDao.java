package br.edu.uniritter.liquid.democracy.dao;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.ioc.Component;
import br.edu.uniritter.liquid.democracy.model.Vote;
import br.edu.uniritter.liquid.democracy.repository.VoteRepository;


@Component
public class VoteDao extends AbstractDao<Vote> implements VoteRepository {

	protected VoteDao(EntityManager entityManager) {
		super(entityManager);
	}
}

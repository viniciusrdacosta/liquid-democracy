package br.edu.uniritter.liquid.democracy.dao;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.ioc.Component;
import br.edu.uniritter.liquid.democracy.model.Candidate;
import br.edu.uniritter.liquid.democracy.repository.CandidateRepository;

@Component
public class CandidateDao extends AbstractDao<Candidate> implements CandidateRepository {

	protected CandidateDao(EntityManager entityManager) {
		super(entityManager);
	}
	
	public List<Candidate> getCandidates()
	{
		return new ArrayList<Candidate>();
	}
}

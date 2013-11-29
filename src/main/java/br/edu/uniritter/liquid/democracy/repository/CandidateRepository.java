package br.edu.uniritter.liquid.democracy.repository;

import br.edu.uniritter.liquid.democracy.model.Candidate;

public interface CandidateRepository  {
	
	Candidate update(Candidate entity);
	
}

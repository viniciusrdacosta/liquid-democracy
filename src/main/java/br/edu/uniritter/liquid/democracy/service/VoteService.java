package br.edu.uniritter.liquid.democracy.service;

import java.util.List;

import br.edu.uniritter.liquid.democracy.model.Vote;


public interface VoteService {
	
	List<Vote> findAll();

	void create(Vote vote);
	
	Vote update(Vote vote);
	
	void delete(Vote vote);

}
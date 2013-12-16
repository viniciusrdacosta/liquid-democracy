package br.edu.uniritter.liquid.democracy.repository;

import java.util.List;

import br.edu.uniritter.liquid.democracy.model.Vote;;

public interface VoteRepository  {
	
	List<Vote> findAll();
	
	void create(Vote vote);
	
	Vote update(Vote vote);
	
	void delete(Vote vote);
	
	
}
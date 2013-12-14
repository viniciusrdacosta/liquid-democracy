package br.edu.uniritter.liquid.democracy.service.impl;

import java.util.List;

import br.edu.uniritter.liquid.democracy.model.Vote;
import br.edu.uniritter.liquid.democracy.repository.VoteRepository;
import br.edu.uniritter.liquid.democracy.service.VoteService;

public class VoteServiceImpl implements VoteService {

	private final VoteRepository repository;

	public VoteServiceImpl(VoteRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public List<Vote> findAll() {
		return repository.findAll();
	}

	@Override
	public void create(Vote vote) {
		repository.create(vote);
	}

	@Override
	public Vote update(Vote vote) {
		return repository.update(vote);
	}

	@Override
	public void delete(Vote vote) {
		repository.delete(vote);
	}

	@Override
	public List<Vote> findByName(String name) {
		return repository.findByName(name);
	}

}

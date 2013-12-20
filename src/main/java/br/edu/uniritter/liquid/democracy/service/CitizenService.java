package br.edu.uniritter.liquid.democracy.service;

import java.util.List;

import br.edu.uniritter.liquid.democracy.model.Citizen;

public interface CitizenService {

	List<Citizen> findAll();

	void create(Citizen citizen);
	
	Citizen update(Citizen citizen);
	
	void delete(Citizen citizen);
	
	List<Citizen> findByName(String name);
	
	Citizen findById(Long id);
}

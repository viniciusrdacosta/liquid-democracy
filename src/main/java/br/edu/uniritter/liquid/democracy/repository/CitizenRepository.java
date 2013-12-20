package br.edu.uniritter.liquid.democracy.repository;

import java.util.List;

import br.edu.uniritter.liquid.democracy.model.Citizen;

public interface CitizenRepository  {
	
	List<Citizen> findAll();
	
	void create(Citizen citizen);
	
	Citizen update(Citizen citizen);
	
	void delete(Citizen citizen);
	
	List<Citizen> findByName(String name);

	Citizen findById(Long id);
}

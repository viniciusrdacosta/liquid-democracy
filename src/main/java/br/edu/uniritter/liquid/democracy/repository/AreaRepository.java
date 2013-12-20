package br.edu.uniritter.liquid.democracy.repository;

import java.util.List;

import br.edu.uniritter.liquid.democracy.model.Area;

public interface AreaRepository {

	List<Area> findAll();
	
	void create(Area area);
	
	Area update(Area area);
	
	void delete(Long id);
	
	List<Area> findByName(String name);
}

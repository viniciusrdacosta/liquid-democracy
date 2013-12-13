package br.edu.uniritter.liquid.democracy.service;

import java.util.List;

import br.edu.uniritter.liquid.democracy.model.Area;

public interface AreaService {
	
	List<Area> findAll();

	void create(Area area);
	
	Area update(Area area);
	
	void delete(Area area);
	
	List<Area> findByName(String name);
}

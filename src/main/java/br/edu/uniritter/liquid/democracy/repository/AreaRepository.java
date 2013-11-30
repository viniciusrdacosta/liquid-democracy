package br.edu.uniritter.liquid.democracy.repository;

import java.util.List;

import br.edu.uniritter.liquid.democracy.model.Area;

public interface AreaRepository {

	
	List<Area> findAll();
}

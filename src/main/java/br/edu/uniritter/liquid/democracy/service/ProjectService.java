package br.edu.uniritter.liquid.democracy.service;

import java.util.List;

import br.edu.uniritter.liquid.democracy.model.Project;

public interface ProjectService {
	
	List<Project> findAll();

	void create(Project project);
	
	Project update(Project project);
	
	void delete(Project project);
	
	List<Project> findByName(String name);

}

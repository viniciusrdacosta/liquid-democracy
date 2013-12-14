package br.edu.uniritter.liquid.democracy.repository;

import java.util.List;

import br.edu.uniritter.liquid.democracy.model.Project;

public interface ProjectRepository {

	List<Project> findAll();
	
	void create(Project project);
	
	Project update(Project project);
	
	void delete(Project project);
	
	List<Project> findByName(String name);
}

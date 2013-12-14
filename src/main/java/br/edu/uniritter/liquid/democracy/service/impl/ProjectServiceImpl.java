package br.edu.uniritter.liquid.democracy.service.impl;

import java.util.List;

import br.com.caelum.vraptor.ioc.Component;
import br.edu.uniritter.liquid.democracy.model.Project;
import br.edu.uniritter.liquid.democracy.repository.ProjectRepository;
import br.edu.uniritter.liquid.democracy.service.ProjectService;

@Component
public class ProjectServiceImpl implements ProjectService{
	
	private final ProjectRepository repository;
	
	public ProjectServiceImpl(ProjectRepository repository){
		this.repository = repository;
	}

	@Override
	public List<Project> findAll() {
		return repository.findAll();
	}

	@Override
	public void create(Project project) {
		repository.create(project);
	}

	@Override
	public Project update(Project project) {
		return repository.update(project);
	}

	@Override
	public void delete(Project project) {
		repository.delete(project);
	}

	@Override
	public List<Project> findByName(String name) {
		return repository.findByName(name);
	}

}

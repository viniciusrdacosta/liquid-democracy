package br.edu.uniritter.liquid.democracy.dao;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.ioc.Component;
import br.edu.uniritter.liquid.democracy.model.Project;
import br.edu.uniritter.liquid.democracy.repository.ProjectRepository;

@Component
public class ProjectDao extends AbstractDao<Project> implements ProjectRepository{

	protected ProjectDao(EntityManager entityManager) {
		super(entityManager);
	}
}

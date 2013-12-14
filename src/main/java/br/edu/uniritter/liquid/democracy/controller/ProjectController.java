package br.edu.uniritter.liquid.democracy.controller;

import static br.edu.uniritter.liquid.democracy.validator.CustomMatchers.notNull;
import static org.hamcrest.Matchers.is;

import java.util.List;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.validator.Validations;
import br.edu.uniritter.liquid.democracy.annotation.Public;
import br.edu.uniritter.liquid.democracy.model.Area;
import br.edu.uniritter.liquid.democracy.model.Project;
import br.edu.uniritter.liquid.democracy.service.ProjectService;

@Resource
public class ProjectController {

	private Result result;
	private ProjectService service;
	private final Validator validator;

	public ProjectController(Result result, ProjectService service, Validator validator) {
		this.result = result;
		this.service = service;
		this.validator = validator;
	}

	@Public
	@Get("/project")
	public void home() {
		List<Project> projects = service.findAll();
		result.include("projects", projects);
	}
	
	@Public
	@Get("/project/new")
	public void add() {
	}
	
	@Public
	@Post("/project/new")
	public void add(Project project) {
		validate(project);
		service.create(project);
	}
	
	@Public
	@Post("/project/delete/{project}")
	public void delete(Project project) {
		validate(project);
		service.delete(project);
		result.redirectTo(this).home();
	}


	private void validate(final Project project) {
		validator.checking(new Validations() {
			{
				that(project, is(notNull()), "erro", "Erro ao validar Project.");
			}			
		});
		
		validator.onErrorUsePageOf(ProjectController.class).add();

	}
}

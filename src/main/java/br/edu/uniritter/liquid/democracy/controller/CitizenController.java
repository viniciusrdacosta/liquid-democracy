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
import br.edu.uniritter.liquid.democracy.model.Citizen;
import br.edu.uniritter.liquid.democracy.service.CitizenService;

@Resource
public class CitizenController {

	private Result result;
	private CitizenService service;
	private final Validator validator;
	
	public CitizenController(Result result, CitizenService service, Validator validator) {
		this.result = result;
		this.service = service;
		this.validator = validator;
	}
	
	@Get("/citizens")
	public void citizens() {
		List<Citizen> citizens = service.findAll();
		result.include("citizens", citizens);
	}
	
	@Post("/citizens")
	public void add(Citizen citizen) {
		validate(citizen);
		service.create(citizen);

	}
	
	private void validate(final Citizen citizen) {
		validator.checking(new Validations() {
			{
				that(citizen, is(notNull()), "erro", "Erro ao validar Citizen.");
			}			
		});
		validator.onErrorUsePageOf(ProjectController.class).add();
	}
}

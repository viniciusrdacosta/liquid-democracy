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
import br.edu.uniritter.liquid.democracy.model.Citizen;
import br.edu.uniritter.liquid.democracy.model.Organization;
import br.edu.uniritter.liquid.democracy.service.OrganizationService;

@Resource
public class OrganizationController {

	private Result result;
	private OrganizationService service;
	private final Validator validator;

	public OrganizationController(Result result, OrganizationService service, Validator validator) {
		this.result = result;
		this.service = service;
		this.validator = validator;
	}

	@Public
	@Get("/organization")
	public void home() {
		List<Organization> organizations = service.findAll();
		result.include("organizations", organizations);
	}
	
	@Public
	@Get("/organization/new")
	public void add() {
	}
	
	@Public
	@Post("/organization/new")
	public void add(Organization organization) {
		validate(organization);
		service.create(organization);
	}
	
	@Public
	@Post("/organization/delete/{id}")
	public void delete(Long id) {
		Organization organization = service.findById(id);
		service.delete(organization);
		result.redirectTo(OrganizationController.class).home();
	}

	private void validate(final Organization organization) {
		validator.checking(new Validations() {
			{
				that(organization, is(notNull()), "erro", "Erro ao validar Organization.");
			}			
		});
		
		validator.onErrorUsePageOf(OrganizationController.class).add();

	}
}

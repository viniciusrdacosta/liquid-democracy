package br.edu.uniritter.liquid.democracy.controller;

import static br.edu.uniritter.liquid.democracy.validator.CustomMatchers.notNull;
import static org.hamcrest.Matchers.is;

import java.io.Console;
import java.util.List;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.validator.ValidationMessage;
import br.com.caelum.vraptor.validator.Validations;
import br.edu.uniritter.liquid.democracy.annotation.Public;
import br.edu.uniritter.liquid.democracy.model.Area;
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

	@Public
	@Get("/citizen")
	public void home() {
		List<Citizen> citizens = service.findAll();
		result.include("citizens", citizens);
	}

	@Public
	@Get("/citizen/new")
	public void add() {
		Citizen citizen = new Citizen();
		result.include("action", "new");
		result.forwardTo(CitizenController.class).crud(citizen);
	}

	@Public
	@Post("/citizen/new")
	public void add(Citizen citizen) {
		validateAdd(citizen);
		service.create(citizen);
		result.redirectTo(CitizenController.class).home();
	}
	
	@Public
	@Get("/citizen/edit/{id}")
	public void edit(Long id) {
		Citizen citizen = service.findById(id);
		result.include("action", "edit/"+id);
		result.forwardTo(CitizenController.class).crud(citizen);
	}
	
	@Public
	@Post("/citizen/edit/{id}")
	public void update(Citizen citizen) {
		validateEdit(citizen);
		service.update(citizen);
		result.redirectTo(CitizenController.class).edit(citizen.getId());
	}
	
	@Public
	public void crud(Citizen citizen)
	{
		result.include("citizen", citizen);
	}
	
	@Public
	@Post("/citizen/delete/{id}")
	public void delete(Long id) {
		Citizen citizen = service.findById(id);
		service.delete(citizen);
		result.redirectTo(CitizenController.class).home();
	}

	private void validateAdd(final Citizen citizen) {
		validate(citizen);
		validator.onErrorUsePageOf(CitizenController.class).add();
	}
	
	private void validateEdit(final Citizen citizen) {
		validate(citizen);
		if (citizen != null)
			if (citizen.getId() == null)
				validator.add(new ValidationMessage("Id can not be empty", "citizen.id"));
		validator.onErrorUsePageOf(CitizenController.class).home();
	}
	
	private void validate(final Citizen citizen) {
		if (citizen == null) {
	        validator.add(new ValidationMessage("Citizen can not be null", "citizen"));
		} else {
			if (citizen.getName() == null)
	        	validator.add(new ValidationMessage("Name can not be empty", "citizen.name"));
			
			if (citizen.getCpf() == null)
	        	validator.add(new ValidationMessage("CPF can not be empty", "citizen.cpf"));
		
			if (citizen.getPassword() == null)
	        	validator.add(new ValidationMessage("Password can not be empty", "citizen.password"));
			
			if(citizen.getCandidate() == null)
				citizen.setCandidate(false);
		}
	}
}

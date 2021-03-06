package br.edu.uniritter.liquid.democracy.controller;

import static br.edu.uniritter.liquid.democracy.validator.CustomMatchers.notNull;
import static org.hamcrest.Matchers.is;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.validator.Validations;
import br.edu.uniritter.liquid.democracy.annotation.Public;
import br.edu.uniritter.liquid.democracy.model.Area;
import br.edu.uniritter.liquid.democracy.service.AreaService;

@Resource
public class AreaController {

	private Result result;
	private AreaService service;
	private final Validator validator;

	public AreaController(Result result, AreaService service, Validator validator) {
		this.result = result;
		this.service = service;
		this.validator = validator;
	}

	@Public
	@Get("/area")
	public void home() {
	}
	
	@Public
	@Get("/area/new")
	public void add() {
	}
	
	@Public
	@Post("/area/new")
	public void add(Area area) {
		validate(area);
		service.create(area);
	}
	
	@Public
	@Post("/area/find")
	public void find(String name) {
		List<Area> areas = new ArrayList<>();
		if(name == null)
			areas = service.findAll();
		else 
			areas = service.findByName(name);

		result.include("areas", areas);
		result.redirectTo(this).home();
	}
	
	@Public
	@Post("/area/delete/{id}")
	public void delete(Long id) {
		service.delete(id);
		result.forwardTo(this).home();
	}

	private void validate(final Area area) {
		validator.checking(new Validations() {
			{
				that(area, is(notNull()), "erro", "Erro ao validar Area.");
			}			
		});
		
		validator.onErrorUsePageOf(AreaController.class).add();

	}
}

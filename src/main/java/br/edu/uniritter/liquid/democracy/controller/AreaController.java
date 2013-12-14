package br.edu.uniritter.liquid.democracy.controller;

import static br.edu.uniritter.liquid.democracy.validator.CustomMatchers.notNull;
import static org.hamcrest.Matchers.is;

import java.util.List;

import br.com.caelum.vraptor.Delete;
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
		List<Area> areas = service.findAll();
		result.include("areas", areas);
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
	@Post("/area/delete/{area}")
	public void delete(Area area) {
		validate(area);
		service.delete(area);
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

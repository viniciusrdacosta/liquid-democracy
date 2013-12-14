package br.edu.uniritter.liquid.democracy.controller;

import java.util.List;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.edu.uniritter.liquid.democracy.annotation.Public;
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
	public void citizens() {
		//List<Citizen> citizens = service.findAll();
		//result.include("citizens", citizens);
	}
}

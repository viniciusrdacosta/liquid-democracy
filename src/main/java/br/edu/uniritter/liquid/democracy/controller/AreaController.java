package br.edu.uniritter.liquid.democracy.controller;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.edu.uniritter.liquid.democracy.annotation.Public;
import br.edu.uniritter.liquid.democracy.service.SecurityService;
import br.edu.uniritter.liquid.democracy.session.UserInfo;


@Resource
public class AreaController {
	
	private Result result;
	private UserInfo info;
	private AreasService service;
	private final Validator validator;
	
	@Public
	@Get("/areas")
	public void home() {
		
	}
	
	@Get("/edit")
	public void add() {}
	
	
}

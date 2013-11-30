package br.edu.uniritter.liquid.democracy.controller;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Resource;
import br.edu.uniritter.liquid.democracy.annotation.Public;


@Resource
public class AreaController {
	
	@Public
	@Get("/area")
	public void area() {}
}

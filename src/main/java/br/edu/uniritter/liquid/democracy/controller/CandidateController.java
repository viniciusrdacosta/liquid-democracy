package br.edu.uniritter.liquid.democracy.controller;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Resource;
import br.edu.uniritter.liquid.democracy.annotation.Public;


@Resource
public class CandidateController {
	
	@Public
	@Get("/candidates")
	public void candidates() {}
}

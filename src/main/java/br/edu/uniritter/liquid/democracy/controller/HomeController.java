package br.edu.uniritter.liquid.democracy.controller;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Resource;
import br.edu.uniritter.liquid.democracy.annotation.Public;


@Resource
public class HomeController {
	
	@Public
	@Get("/")
	public void home() {}
	
	@Public
	@Get("/about")
	public void about() {}
	

	@Public
	@Get("/citizen")
	public void citizen() {
		System.out.println("teste");
	}
	
}

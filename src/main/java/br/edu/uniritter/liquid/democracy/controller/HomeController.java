package br.edu.uniritter.liquid.democracy.controller;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.edu.uniritter.liquid.democracy.annotation.Public;


@Resource
public class HomeController {
	private Result result;
	
	public HomeController(Result result){
		this.result = result;
	}
	
	@Public
	@Get("/")
	public void root() {
		this.result.forwardTo(HomeController.class).home();
	}
	
	@Public
	@Get("/home")
	public void home() {}
	
	@Public
	@Get("/about")
	public void about() {}
}

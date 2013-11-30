package br.edu.uniritter.liquid.democracy.controller;

import static br.edu.uniritter.liquid.democracy.validator.CustomMatchers.notNull;
import static org.hamcrest.Matchers.is;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.validator.Validations;
import br.edu.uniritter.liquid.democracy.annotation.Public;
import br.edu.uniritter.liquid.democracy.model.User;
import br.edu.uniritter.liquid.democracy.service.AreaService;
import br.edu.uniritter.liquid.democracy.service.SecurityService;
import br.edu.uniritter.liquid.democracy.session.UserInfo;




@Resource
public class AreaController {
	
	private Result result;
	private UserInfo info;
	private AreaService service;
	private final Validator validator;
	
	public AreaController(Result result, UserInfo info, AreaService service, Validator validator) {
		this.result = result;
		this.info = info;
		this.service = service;
		this.validator = validator;
	}
	
	@Public
	@Get("/areas")
	public void home() {
		
	}
	
	@Get("/edit")
	public void add() {}
	
	private void validate(final User user){
		validator.checking(new Validations() {
			{
				that(user, is(notNull()), "error", "error.login");
			}
		});

		validator.onErrorUsePageOf(SecurityController.class).login();
	}
}

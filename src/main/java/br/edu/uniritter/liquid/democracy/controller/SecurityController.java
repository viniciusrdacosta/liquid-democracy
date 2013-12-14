package br.edu.uniritter.liquid.democracy.controller;

import static br.edu.uniritter.liquid.democracy.validator.CustomMatchers.notNull;
import static org.hamcrest.Matchers.is;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.validator.Validations;
import br.edu.uniritter.liquid.democracy.annotation.Public;
import br.edu.uniritter.liquid.democracy.model.User;
import br.edu.uniritter.liquid.democracy.service.SecurityService;
import br.edu.uniritter.liquid.democracy.session.UserInfo;

@Resource
public class SecurityController {

	private Result result;
	private UserInfo info;
	private SecurityService service;
	private final Validator validator;

	public SecurityController(Result result, UserInfo info, SecurityService service, Validator validator) {
		this.result = result;
		this.info = info;
		this.service = service;
		this.validator = validator;
	}

	@Public
	@Get("/login")
	public void login() {}

	@Public
	@Post("/login")
	public void login(final User user) {
		final User userAuth = service.authenticate(user);
		validate(userAuth);
		info.setUser(user);
		result.redirectTo(HomeController.class).home();
	}

	@Get("/logout")
	public void logout() {
		info.logout();
		result.redirectTo(HomeController.class).home();
	}
	
	@Public
	@Get("/register")
	public void register() {}
	
	@Public
	@Post("/register")
	public void register(final User user) {
		service.create(user);
		validate(user);
		info.setUser(user);
		result.redirectTo(HomeController.class).home();
	}
	
	
	private void validate(final User user){
		validator.checking(new Validations() {
			{
				that(user, is(notNull()), "error", "error.login");
			}
		});

		validator.onErrorUsePageOf(SecurityController.class).login();
	}
}
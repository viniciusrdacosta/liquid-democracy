
package br.edu.uniritter.liquid.democracy.controller;
import static br.edu.uniritter.liquid.democracy.validator.CustomMatchers.notNull;
import static org.hamcrest.Matchers.is;
import java.util.List;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.validator.Validations;
import br.edu.uniritter.liquid.democracy.annotation.Public;
import br.edu.uniritter.liquid.democracy.model.Vote;
import br.edu.uniritter.liquid.democracy.service.VoteService;

@Resource
public class VoteController {

	private Result result;
	private VoteService service;
	private final Validator validator;

	public VoteController(Result result, VoteService service, Validator validator) {
		this.result = result;
		this.service = service;
		this.validator = validator;
	}

	@Public
	@Get("/vote")
	public void home() {
		List<Vote> areas = service.findAll();
		result.include("areas", areas);
	}
	
	@Public
	@Get("/vote/new")
	public void add() {
	}
	
	@Public
	@Post("/vote/new")
	public void add(Vote vote) {
		validate(vote);
		service.create(vote);
	}

	private void validate(final Vote vote) {
		validator.checking(new Validations() {
			{
				that(vote, is(notNull()), "erro", "Erro ao validar voto.");
			}			
		});
		
		validator.onErrorUsePageOf(VoteController.class).add();

	}
}

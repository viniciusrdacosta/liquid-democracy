package br.edu.uniritter.liquid.democracy.controller;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import br.com.caelum.vraptor.util.test.JSR303MockValidator;
import br.com.caelum.vraptor.util.test.MockSerializationResult;
import br.com.caelum.vraptor.validator.ValidationException;
import br.edu.uniritter.liquid.democracy.model.Candidate;
import br.edu.uniritter.liquid.democracy.model.Vote;
import br.edu.uniritter.liquid.democracy.service.VoteService;

public class VoteControllerTest {
	private MockSerializationResult result;
	private VoteService service;
	private VoteController controller;
	private JSR303MockValidator validator;

	private Vote validVote;
	private Vote invalidVote;

	@Before
	public void setUp() throws Exception {
		service = mock(VoteService.class);
		result = spy(new MockSerializationResult());
		validator = spy(new JSR303MockValidator());
		controller = new VoteController(result, service, validator);

		validVote = new Vote();
		validVote.setDate(new Date("01/01/2001"));
		validVote.setWeight(0);
		validVote.setCandidate(null);
		validVote.setProject(null );
	}

	@Test
	public void addingAValidVote() {
		controller.add(validVote);
		verify(service).create(validVote);
	}

	@Test(expected = ValidationException.class)
	public void addingAInvalidVote() {
		controller.add(invalidVote);
		verifyNoMoreInteractions(service);
	}
}


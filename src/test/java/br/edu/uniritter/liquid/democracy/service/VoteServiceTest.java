package br.edu.uniritter.liquid.democracy.service;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import org.junit.Before;
import org.junit.Test;

import br.edu.uniritter.liquid.democracy.repository.VoteRepository;
import br.edu.uniritter.liquid.democracy.service.impl.VoteServiceImpl;


public class VoteServiceTest {


	private VoteService service;
	private VoteRepository repository;
	

	@Before
	public void setUp() throws Exception {
		repository = mock(VoteRepository.class);
		service = new VoteServiceImpl(repository);
	}

	@Test
	public void finAllVotesTest() {
		service.findAll();
		verify(repository).findAll();
	}

}

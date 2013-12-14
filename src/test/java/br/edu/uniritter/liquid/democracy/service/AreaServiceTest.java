package br.edu.uniritter.liquid.democracy.service;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import br.edu.uniritter.liquid.democracy.repository.AreaRepository;
import br.edu.uniritter.liquid.democracy.service.impl.AreaServiceImpl;

public class AreaServiceTest {
	private AreaService service;
	private AreaRepository repository;
	

	@Before
	public void setUp() throws Exception {
		repository = mock(AreaRepository.class);
		service = new AreaServiceImpl(repository);
	}

	@Test
	public void finAllAreasTest() {
		service.findAll();
		verify(repository).findAll();
	}

}

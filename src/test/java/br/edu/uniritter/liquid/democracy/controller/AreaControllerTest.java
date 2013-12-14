package br.edu.uniritter.liquid.democracy.controller;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import org.junit.Before;
import org.junit.Test;

import br.com.caelum.vraptor.util.test.JSR303MockValidator;
import br.com.caelum.vraptor.util.test.MockSerializationResult;
import br.com.caelum.vraptor.validator.ValidationException;
import br.edu.uniritter.liquid.democracy.model.Area;
import br.edu.uniritter.liquid.democracy.service.AreaService;

public class AreaControllerTest {
	private MockSerializationResult result;
	private AreaService service;
	private AreaController controller;
	private JSR303MockValidator validator;

	private Area validArea;
	private Area invalidArea;

	@Before
	public void setUp() throws Exception {
		service = mock(AreaService.class);
		result = spy(new MockSerializationResult());
		validator = spy(new JSR303MockValidator());
		controller = new AreaController(result, service, validator);

		validArea = new Area();
		validArea.setName("");
		validArea.setDescription("");
	}

	@Test
	public void addingAValidArea() {
		controller.add(validArea);
		verify(service).create(validArea);
	}

	@Test(expected = ValidationException.class)
	public void addingAInvalidArea() {
		controller.add(invalidArea);
		verifyNoMoreInteractions(service);
	}
}

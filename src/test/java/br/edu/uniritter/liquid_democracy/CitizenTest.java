

import static org.junit.Assert.*;

import org.junit.*;

import br.edu.uniritter.liquid_democracy.backend.model.Citizen;


public class CitizenTest {
	Citizen c;

	@Before
	public void setup() {
		c = new Citizen();
		c.setName("Milton");
		c.setVoterRegistration("1264651XYZ");
		c.setSocialCC("90812323129Y");
	}
	
	@Test
	public void testCitzenWasFilled() {
		assertTrue(c.isFilled());
	}
	
	

}

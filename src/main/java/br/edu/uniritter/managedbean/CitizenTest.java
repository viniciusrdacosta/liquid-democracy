package br.edu.uniritter.managedbean;

import static org.junit.Assert.*;

import org.junit.*;


public class CitizenTest {
	Citzen c;

	@Before
	public void setup() {
		c = new Citzen();
		c.setName("Milton");
		c.setVoterRegistration("1264651XYZ");
		c.setSocialCC("90812323129Y");
	}
	
	@Test
	public void testCitzenWasFilled() {
		assertTrue(c.isFilled());
	}
	
	

}

package exo1_2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestBonjourAmi {

	@Test
	void testBonjourAmi1() {
		assertEquals("Bonjour, Arthur.", BonjourAmi.bonjourAmi("Arthur"));
	}
	
	@Test
	void testBonjourAmi2() {
		assertEquals("Bonjour, ami.", BonjourAmi.bonjourAmi(null));
	}

}

package exo1_2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestBonjourAmi {

	@Test
	void test() {
		assertEquals("Bonjour, Arthur.", BonjourAmi.bonjourAmi("Arthur"));
	}

}

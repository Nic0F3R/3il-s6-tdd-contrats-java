import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFizzBuzz {
	
	@Test
	void testFizzBuzz1() {
		assertEquals("1", FizzBuzz.fizzBuzz(1));
	}
	
	@Test
	void testFizzBuzz2() {
		assertEquals("2", FizzBuzz.fizzBuzz(2));
	}
	
	@Test
	void testFizzBuzz3() {
		assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
	}
	
	@Test
	void testFizzBuzz4() {
		assertEquals("4", FizzBuzz.fizzBuzz(4));
	}
	
	@Test
	void testFizzBuzz5() {
		assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
	}
	
	@Test
	void testFizzBuzz15() {
		assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
	}
	
	@Test
	void testFizzBuzzMoins1() {
		assertEquals("-1", FizzBuzz.fizzBuzz(-1));
	}

}

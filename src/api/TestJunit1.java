package api;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJunit1 {

	@Test
	public void testAdd() {

		int num = 5;
		String str = "Junit is working fine";

		assertEquals("Junit is working fine", str);
		
		assertFalse(num > 6);

		assertNotNull(str);
	}
}

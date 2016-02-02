package testsuite;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJunit2 {

	String message = "Robert";
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Test
	public void testSaludationMessage() {
		System.out.println("Inside testSaludationMessage()");
		message = "Hi " + message;
		assertEquals(message, messageUtil.saludationMessage());
	}
}

package timetest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJunit {

	String message = "Robert";
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Test(timeout = 1000)
	public void testPrintMessage() {
		System.out.println("InsidePrintMessage");
		messageUtil.printMessage();
	}
	
	@Test(timeout = 1000)
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage()");
		message = "Hi " + "Robert";
		assertEquals(message, messageUtil.salutationMessage());
	}
}

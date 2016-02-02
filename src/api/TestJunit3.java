package api;

import org.junit.Before;
import org.junit.Test;

import junit.framework.AssertionFailedError;
import junit.framework.TestResult;

public class TestJunit3 extends TestResult {
	
	public synchronized void addError(junit.framework.Test test, Throwable t) {
		super.addError(test, t);
	}
	
	public synchronized void addFailure(junit.framework.Test test, AssertionFailedError t) {
		super.addFailure(test, t);
	}
	
	@Before
	public void startTest() {
		this.startTest();
	}
	
	@Test
	public void testAdd() {		
				
		System.out.println("Failures found: " + this.fErrors);
		System.out.println("Number of tests: " + this.runCount());
				
		this.stop();
	}
	
	public synchronized void stop() {
		
	}

}

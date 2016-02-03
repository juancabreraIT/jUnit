package java.exe;

import java.junit.TestJunit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args) {
		
		Result result = JUnitCore.runClasses(TestJunit.class);
		System.out.println("Found " + result.getFailureCount() + " errors");;
		for(Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		
		System.out.println("Test result: " + result.wasSuccessful());		
	}

}
package com.java.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunit {

	@Test 
	public void test() {
		String str = "jUnit is working fine";
		assertEquals("jUnit is working fine", str);
	}
}

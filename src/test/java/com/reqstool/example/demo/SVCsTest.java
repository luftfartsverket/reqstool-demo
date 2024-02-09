package com.reqstool.example.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import se.lfv.reqstool.annotations.SVCs;

public class SVCsTest {

	@Test
	@SVCs("SVC_010")
	@java.lang.SuppressWarnings("java:S2701")
	public void testMethod1() {
		assertTrue(false, "dummy test");
	}

	@Test
	@SVCs("SVC_020")
	@java.lang.SuppressWarnings("java:S2701")
	public void testMethod2() {
		assertTrue(true, "dummy test");
	}

}

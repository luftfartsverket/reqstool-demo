package com.reqstool.example.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import se.lfv.reqstool.annotations.SVCs;

class DemoApplicationTestsIT {

	@Test
	@SVCs("SVC_010")
	@java.lang.SuppressWarnings("java:S2701")
	void contextLoads() {
		assertTrue(true, "dummy test");
	}

}

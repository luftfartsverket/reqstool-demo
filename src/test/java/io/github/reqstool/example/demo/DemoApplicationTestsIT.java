package io.github.reqstool.example.demo;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import io.github.reqstool.annotations.SVCs;

class DemoApplicationTestsIT {

	@Test
	@SVCs("SVC_010")
	void shouldGreetWithNonNullResult() {
		RequirementsExample example = new RequirementsExample();
		String result = example.greet("Integration");
		assertNotNull(result);
	}

}

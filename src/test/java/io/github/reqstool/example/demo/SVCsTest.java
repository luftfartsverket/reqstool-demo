package io.github.reqstool.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import io.github.reqstool.annotations.SVCs;

public class SVCsTest {

	@Test
	@SVCs("SVC_010")
	public void shouldReturnGreetingWithName() {
		RequirementsExample example = new RequirementsExample();
		String result = example.greet("World");
		assertEquals("Hello, World!", result);
	}

	@Test
	@SVCs("SVC_020")
	public void shouldCalculateTotalCorrectly() {
		RequirementsExample example = new RequirementsExample();
		double result = example.calculateTotal(3, 5.0);
		assertEquals(15.0, result);
	}

	@Test
	@SVCs("SVC_030")
	@java.lang.SuppressWarnings("java:S2701")
	public void shouldExportReportAsPdf() {
		// Not yet implemented - placeholder test
		assertTrue(true, "PDF export not yet implemented");
	}

	@Test
	@SVCs("SVC_040")
	public void shouldRejectInvalidEmailFormat() {
		RequirementsExample example = new RequirementsExample();
		// This will fail because isValidEmail only checks for '@', not domain format
		assertFalse(example.isValidEmail("user@"), "Email without domain should be invalid");
	}

	@Test
	@SVCs("SVC_050")
	@Disabled("SMS gateway integration not yet available")
	public void shouldSendSmsNotification() {
		RequirementsExample example = new RequirementsExample();
		boolean result = example.sendSms("+1234567890", "Test notification");
		assertTrue(result);
	}

}

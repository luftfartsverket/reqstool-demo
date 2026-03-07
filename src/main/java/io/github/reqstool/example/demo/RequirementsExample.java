package io.github.reqstool.example.demo;

import io.github.reqstool.annotations.Requirements;

@Requirements({ "REQ_PASS", "REQ_MANUAL_FAIL", "REQ_FAILING_TEST", "REQ_SKIPPED_TEST", "REQ_MISSING_TEST" })
public class RequirementsExample {

	@Requirements({ "REQ_PASS" })
	public String greet(String name) {
		return "Hello, " + name + "!";
	}

	@Requirements("REQ_MANUAL_FAIL")
	public double calculateTotal(int quantity, double unitPrice) {
		return quantity * unitPrice;
	}

	@Requirements("REQ_FAILING_TEST")
	public boolean isValidEmail(String email) {
		// Bug: missing check for domain part - will cause test failure
		return email != null && email.contains("@");
	}

	@Requirements("REQ_SKIPPED_TEST")
	public boolean sendSms(String phoneNumber, String message) {
		// TODO: SMS gateway integration not yet available
		throw new UnsupportedOperationException("SMS gateway not yet integrated");
	}

	@Requirements("REQ_MISSING_TEST")
	public void auditLog(String userId, String action) {
		// Audit log implementation
		System.out.println("Audit: user=" + userId + " action=" + action);
	}

}

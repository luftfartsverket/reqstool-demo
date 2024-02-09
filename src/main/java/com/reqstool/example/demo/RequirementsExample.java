package com.reqstool.example.demo;

import se.lfv.reqstool.annotations.Requirements;

@Requirements({ "REQ_010", "REQ_020" })
public class RequirementsExample {

	@Requirements({ "REQ_010", "ext-001:REQ_100" })
	public void firstMethod(float parameter) {
		System.out.println("This is a parameter:" + parameter);
	}

	@Requirements("REQ_020")
	public void someMethod(int parameter) {
		System.out.println("This is another parameter: " + parameter);
	}

}

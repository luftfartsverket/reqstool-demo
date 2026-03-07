package io.github.reqstool.example.demo;

public class DemoApplication {

	public static void main(String[] args) {
		RequirementsExample example = new RequirementsExample();
		System.out.println(example.greet("World"));
		System.out.println(example.calculateTotal(3, 9.99));
	}

}

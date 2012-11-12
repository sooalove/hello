package net.ss;

public class HelloWorld {

	public String getMessage() {
		return "Hello World";
	}

	public String getMessage(String string) {
		if (string == null) {
			string = "World";
		}
		return "Hello " + string;
	}

}

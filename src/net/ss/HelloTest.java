package net.ss;

import junit.framework.TestCase;

public class HelloTest extends TestCase {
	public void testGetMessage() throws Exception {
		HelloWorld hello = new HelloWorld();
		assertEquals("Hello World", hello.getMessage());
		
	}
	
	public void testGetMessageName() throws Exception {
		HelloWorld hello = new HelloWorld();
		assertEquals("Hello Steve", hello.getMessage("Steve"));		
	}
	
	public void testGetMessageNameOther() throws Exception {
		HelloWorld hello = new HelloWorld();
		assertEquals("Hello Jobs", hello.getMessage("Jobs"));		
	}
	
	public void testGetMessageNameNull() throws Exception {
		HelloWorld hello = new HelloWorld();
		assertEquals("Hello World", hello.getMessage(null));		
	}
}

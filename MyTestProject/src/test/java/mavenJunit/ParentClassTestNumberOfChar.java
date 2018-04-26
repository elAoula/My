package mavenJunit;

import static org.junit.Assert.*;

import org.junit.Test;

import fi.cgi.otso.lt.junit.classes.SimpleClass;

public class ParentClassTestNumberOfChar {

	@Test
	public void testNumberOfCharachtersInAString() {
		SimpleClass c = new SimpleClass();
		int result = c.numberOfCharachtersInAString("amin2");
		assertEquals(1, result);
		
	}

	@Test
	public void testNumberOfCharachtersInAString2() {
		SimpleClass c = new SimpleClass();
		int result = c.numberOfCharachtersInAString("amina");
		assertEquals(2, result);
		
	}
}

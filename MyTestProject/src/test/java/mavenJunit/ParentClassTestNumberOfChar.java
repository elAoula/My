package mavenJunit;

import static org.junit.Assert.*;

import org.junit.Test;

import fi.cgi.otso.lt.junit.classes.ParentClass;
import fi.cgi.otso.lt.junit.classes.SimpleClass;

public class ParentClassTestNumberOfChar {

	@Test
	public void testNumberOfCharachtersInAString() {
		ParentClass c = new ParentClass();
		String s = "AmineAoula";
		int result = c.numberOfCharachtersInAString(s);
		System.out.println("Result: " +result);
		assertEquals(1, result);
		
	}
	
	@Test
	public void testNumberOfCharachtersInAString2() {
		ParentClass c = new ParentClass();
		int result = c.numberOfCharachtersInAString("amina");
		assertEquals(34, result);
		
	}
}

package mavenJunit;

import static org.junit.Assert.*;

import org.junit.Test;

import fi.cgi.otso.lt.junit.classes.ParentClass;

public class ParentClassTest {

	@Test
	public void test1() {
		ParentClass n = new ParentClass();
		int r = n.squareroot(3);
		assertEquals(9, r);
	}

	
	@Test
	public void testSquareNoEqual() {
		ParentClass c = new ParentClass();
		int result = c.squareroot(3);
		assertNotEquals(0, result);
		
	}
}

package fi.cgi.otso.lt.junit.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ParentClassTest.class, ParentClassTestNumberOfChar.class})
public class AllTests {

}

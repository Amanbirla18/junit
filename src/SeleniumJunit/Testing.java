package SeleniumJunit;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Testing {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("I am before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("I am after class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("I am before ");
	}
	@Ignore
	@After
	public void tearDown() throws Exception {
		System.out.println("I am after");
	}

	@Test
	public void test1() {
		//fail("Not yet implemented");
		System.out.println("I am test1");
	}
	@Test
	public void test2() {
		//fail("Not yet implemented");
		System.out.println("I am test2");
	}
	@Test
	public void test3() {
		//fail("Not yet implemented");
		System.out.println("I am test2");
	}

}

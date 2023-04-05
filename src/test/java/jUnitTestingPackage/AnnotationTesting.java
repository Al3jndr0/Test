package jUnitTestingPackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AnnotationTesting {
	
	@Before
	public void beforeClass() {
		System.out.println("Executing Before Test");
	}
	
	@Test
	public void test1() {
		System.out.println("Executing Test1");
	}
	@Test
	public void test2() {
		System.out.println("Executing Test2");
	}
	@After
	public void afterClass() {
		System.out.println("Executing After test");
	}

}

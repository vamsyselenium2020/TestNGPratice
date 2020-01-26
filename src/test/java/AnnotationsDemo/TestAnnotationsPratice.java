package AnnotationsDemo;

import org.testng.annotations.Test;

public class TestAnnotationsPratice {

	@Test(priority=10)
	public void m1() {
		System.out.println("hai from m1 method");
	}
	
	@Test(priority=9)
	public void m2() {
		System.out.println("hai from m2 method");
	}
}

package AnnotationsDemo;

import org.testng.annotations.Test;

public class DependsOnMethods {

	@Test
	public void m1() {
		System.out.println("hai from m1");
	}
	
	@Test
	public void m2() {
		System.out.println("hai from m2");
	}
}


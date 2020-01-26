package AnnotationsDemo;

import org.testng.annotations.Test;

public class DependsOnMethods {

	@Test
	public void m1() {
		System.out.println("hai from m1 "+this.getClass().getName());
		System.out.println(System.getProperty("name"));
	}
	
	@Test
	public void m2() {
		System.out.println("hai from m2 "+this.getClass().getName());
	}
}


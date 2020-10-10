package AnnotaionsPkg;

import org.testng.annotations.Test;

public class ClassB {
	@Test(expectedExceptions= {ArithmeticException.class})
	public void m1() {
		System.out.println("m1 of B");
		throw new ArithmeticException();
	}
	@Test
	public void m2() {
		System.out.println("m2 of B");
	}
	@Test(groups= {"Regession"})
	public void m3() {
		System.out.println("m3 of B");
	}
	@Test
	public void m4() {
		System.out.println("m4 of B");
	}


}

package AnnotaionsPkg;

import org.testng.annotations.Test;

public class ClassC {
	@Test
	public void m1() {
		System.out.println("m1 of C");
	}
	
	@Test(groups= {"Suchita"})
	public void m2() {
		System.out.println("m2 of C");
	}
	@Test(groups= {"Regression"})
	public void m3() {
		System.out.println("m3 of C");
	}
	
	@Test(groups= {"Regression"})
	public void m4() {
		System.out.println("m4 of C");
	}

}

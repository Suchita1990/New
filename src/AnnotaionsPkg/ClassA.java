package AnnotaionsPkg;

import org.testng.annotations.Test;

public class ClassA {

	@Test(groups = { "Regression" })
	public void m1() {
		System.out.println("m1 of A");
	}

	@Test(invocationCount=3)
	public void m2() {
		System.out.println("m2 of A");//excute 3 times
	}

	@Test(groups = { "Regression", "Suchita" })
	public void m3() {
		System.out.println("m3 of A");
	}

	@Test(invocationTimeOut=1000)//how much time take ur method tu invoke
	public void m4() {
		System.out.println("m4 of A");
	}

}

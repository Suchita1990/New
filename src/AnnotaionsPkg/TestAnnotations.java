package AnnotaionsPkg;

import org.apache.poi.ddf.EscherColorRef.SysIndexSource;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @BeforeTest and @AfterTest executes before test tag.And they depends on how many test tag's are
 * in code ,it will excute depends on test tag.
 * 
 * @Beforesuite and @Aftersuite executes before just suite tag and after suite tag.It excutes only once
 */

public class TestAnnotations {
	@Parameters({"rollnumber" , "studentName"})
	@Test
	public void m1(String rollNumber ,String sname) {
		System.out.println("m1 Test case :" +  rollNumber);
		System.out.println("Student name :" + sname);
	}

	@BeforeTest
	public void m2() {
		// Using this annotation we can write reset code like db connection, open
		// browser
		System.out.println("Before test tag");
	}

	@Test
	public void m3() {
		System.out.println("m3 test case");
	}

	@AfterTest
	public void m4() {
		System.out.println("After test tag");

	}

	@BeforeSuite
	public void m5() {
		System.out.println("beforesuite");

	}

	@AfterSuite
	public void m6() {
		System.out.println("Aftersuite");
	}
	@BeforeMethod
	public void m7() {
		System.out.println("BeforeMethod");

	}
	@AfterMethod
	public void m8() {
		System.out.println("AfterMethod ");

	}
	@BeforeClass
	public void m9() {
		System.out.println("Before class");

	}
	@AfterClass
	public void m10() {
		System.out.println("After class");
	}
}

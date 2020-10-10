package AnnotaionsPkg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTestCase {
	@Test(dataProvider = "LoginDataProvider" , dataProviderClass=DataProviders.class)
	public void m1(String uname, String pass) throws InvalidUserOrPasswordException {
		if (uname.contains("user") && pass.contains("pass")) {
			System.out.println(uname + "\t" + pass);
		} else {
			throw new InvalidUserOrPasswordException();
		}

	}

	/*@DataProvider(name = "LoginDataProvider")
	public Object[][] loginData() {
		Object[][] values = { { "user1", "pass1" }, { "user2", "pass2" }, { "user3", "pass3" },
				{ "Suchita", "Suchita@123" } };
		return values;

	}*/
}

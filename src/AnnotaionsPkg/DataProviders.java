package AnnotaionsPkg;

import org.testng.annotations.DataProvider;

public class DataProviders {
	@DataProvider(name = "LoginDataProvider")
	public Object[][] loginData() {
		Object[][] values = { { "user1", "pass1" }, { "user2", "pass2" }, { "user3", "pass3" },
				{ "Suchita", "Suchita@123" } };
		return values;

	}
}
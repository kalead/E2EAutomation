package Testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import Pageobjectmodel.Loginpageobject1;
import Resources.Baseclass;

public class Logintestcase extends Baseclass  {
	@Test
	public void launchurl() throws IOException {
		driver=driverInitlization();
		driver.get("https://automationexercise.com/login");
		Loginpageobject1 obj=new Loginpageobject1(driver);
		obj.Enteremailaddress().sendKeys("Amit@ymail.com");
		obj.Enterpassword().sendKeys("varad");
		obj.login().click();
		
	}

}

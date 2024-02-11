package Testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import Pageobjectmodel.Loginpageobject;
import Resources.Baseclass;

public class Loginpage extends Baseclass  {
	@Test
	public void launchbrowser() throws IOException {
		driver=driverInitlization();
		driver.get("https://automationexercise.com/login");
		Loginpageobject obj=new Loginpageobject(driver);
		obj.Enterusername().sendKeys("Rahul");
		obj.Enteremail().sendKeys("Rahul@mail.com");
		//obj.Ticksignup().click();
	}

}

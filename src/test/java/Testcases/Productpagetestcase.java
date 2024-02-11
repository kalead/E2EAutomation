package Testcases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Pageobjectmodel.Productpageobject;
import Resources.Baseclass;

public class Productpagetestcase extends Baseclass {
	@Test
	public void Selectproduct() throws IOException, InterruptedException {
		driver=driverInitlization();
		driver.get("https://automationexercise.com/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,750)");
		Productpageobject obj=new Productpageobject(driver);
		//Thread.sleep(3000);
		//obj.EnterMen().click();
		//obj.SelectProduct().click();
		obj.SelectDress().click();
		//Thread.sleep(2000);
		obj.Confirmorder().click();
		Thread.sleep(1000);
		obj.Tickview().click();
	}
}


	



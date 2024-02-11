package Testcases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Pageobjectmodel.Productpageobject1;
import Resources.Baseclass;

public class Productpagetestcase1 extends Baseclass  {
	@Test
	public void Shopbybrand() throws IOException {
		driver=driverInitlization();
		driver.get("https://automationexercise.com/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,750)");
		 Productpageobject1 obj=new  Productpageobject1(driver);
		 
		 obj.Selectbrand().click();
		 js.executeScript("window.scrollBy(0,600)");
		 obj. Selecttshirt().click();
		 obj.Tickcart().click();
		 
		
	}

}

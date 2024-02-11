package Pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Productpageobject1 {
	public WebDriver driver;
By Brand=	By.xpath("//a[@href='/brand_products/Polo']");
By MenTshirt=By.xpath("//a[@href='/product_details/29']");
By Addcart=By.xpath("//button[@type='button']");
public Productpageobject1(WebDriver driver2) {
	this.driver=driver2;
}
public WebElement Selectbrand() {
	return driver.findElement(Brand);
}
public WebElement Selecttshirt() {
	return driver.findElement(MenTshirt);
}
public WebElement Tickcart() {
	return driver.findElement(Addcart);
}

}

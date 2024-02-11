package Pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Productpageobject {
	public WebDriver driver;

By Dress=By.xpath("//a[@href='/product_details/4']");
By Addtocart=By.xpath("//button[@type='button']");
By Viewcart=By.linkText("View Cart");
public Productpageobject(WebDriver driver2) {
	this.driver=driver2;
}
public WebElement SelectDress() {
	return driver.findElement(Dress);
}
public WebElement Confirmorder() {
	return driver.findElement(Addtocart);
}
public WebElement Tickview() {
	return driver.findElement(Viewcart);
}


}

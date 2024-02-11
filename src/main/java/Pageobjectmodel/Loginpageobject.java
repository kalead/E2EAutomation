package Pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpageobject {
	public WebDriver driver;
By username=	By.xpath("//input[@name='name']");
By email=By.xpath("//input[@name='name']");
By signup=By.xpath("//form[@action='/signup']/button");

public Loginpageobject(WebDriver driver2) {
	this.driver=driver2;
}
public WebElement Enterusername() {
	return driver.findElement(username);
}
public WebElement Enteremail() {
	return driver.findElement(email);
}
public WebElement Ticksignup() {
	return driver.findElement(signup);
}
}

package Pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpageobject1 {
	public WebDriver driver;
By emailaddress=	By.xpath("//input[@data-qa='login-email']");
By password=By.xpath("//input[@name='password']");
By login=By.xpath("//button[@data-qa='login-button']");

public Loginpageobject1(WebDriver driver2) {
	this.driver=driver2;
}
public WebElement Enteremailaddress() {
	return driver.findElement(emailaddress);
}
public WebElement Enterpassword() {
	return driver.findElement(password);
}
public WebElement login() {
	return driver.findElement(login);
}
}

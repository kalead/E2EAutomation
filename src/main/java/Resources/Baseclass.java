package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	public WebDriver driver;
	public WebDriver driverInitlization() throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\Akshay\\eclipse-workspace\\E2EAutomation\\src\\main\\java\\Resources\\data.properties");
		Properties prop=new Properties();
		prop.load(fis);
	String browserName=	prop.getProperty("browser");
	if(browserName.contentEquals("chrome")) {
		 driver=new ChromeDriver();
	}
	else if(browserName.contentEquals("firefox")) {
		//firefox driver code
	}
	else if(browserName.contentEquals("safari")) {
		//safari driver code
	}
	else if(browserName.contentEquals("edge")) {
	   //edge driver code
	}
	else {
		System.out.println("Please choose valid browser to launch");
	}
	return driver;
	}

}

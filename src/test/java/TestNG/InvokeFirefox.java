package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(ListnerClass.class)
public class InvokeFirefox {
	
	
	@Test
	public void invokeff() {
	
	
	System.setProperty("webdriver.Gecko.driver", 
			"C:\\Users\\Harsha Patil\\Documents\\Manipal\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe");
			
			WebDriver driver = new FirefoxDriver();
			
			driver.get("https://www.selenium.dev/");
			
	}
			
			
			

}

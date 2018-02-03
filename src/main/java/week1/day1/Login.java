package week1.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {


	//@Test(invocationCount=2,threadPoolSize=2,invocationTimeOut=9000)
	@Test(invocationCount=10,successPercentage=70)
	public void login() throws InterruptedException {
		// init driver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//launch browser
		ChromeDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//Load the URL
		driver.get("http://leaftaps.com/opentaps");
		//enter user name
		driver.findElementById("username").clear();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		WebElement select = driver.findElementByClassName("decorativeSubmit");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.findElementByClassName("decorativeSubmit").click();
		driver.close();
		
		
		
		
		
		
		
		
		
	}

}

package week1.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
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
		driver.findElementByClassName("decorativeSubmit").click();
		Thread.sleep(5000);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.close();
		
		
		
		
		
		
		
		
		
	}

}

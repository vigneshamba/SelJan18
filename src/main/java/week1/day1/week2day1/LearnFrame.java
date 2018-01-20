package week2day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//launch browser
		ChromeDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//Load the URL
		driver.get("https://jqueryui.com/draggable/");
		WebElement myFrameInfo = driver.findElementByLinkText("NGeT Agent Login");
		driver.switchTo().frame("");
		driver.switchTo().frame("myFrameInfo");
		driver.switchTo().frame(0);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

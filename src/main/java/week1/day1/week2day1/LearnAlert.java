package week2day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//launch browser
		ChromeDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//Load the URL
		driver.get("https://jqueryui.com/draggable/");
		//driver.findElementById("loginbutton").click();
		Alert myAlert = driver.switchTo().alert();
		myAlert.sendKeys("");
		myAlert.getText();
		myAlert.accept();
		
		
		
		
		
		
		
		
	}

}

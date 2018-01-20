package week2day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//launch browser
		ChromeDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//Load the URL
		driver.get("http://legacy.crystalcruises.com/");
		//String windowHandle = driver.getWindowHandle();
		//System.out.println(windowHandle);
		driver.findElementByLinkText("GUEST CHECK-IN").click();
		System.out.println(driver.getTitle());
		Set<String> allWin = driver.getWindowHandles();
		for (String eachwin : allWin) {
			System.out.println(eachwin);
		}
		List<String> list = new ArrayList<String>();
		list.addAll(allWin);
		driver.switchTo().window(list.get(1));
		System.out.println(driver.getTitle());
		driver.findElementByLinkText("View Offer»").click();
		Set<String> allWin1 = driver.getWindowHandles();
		List<String> list1 = new ArrayList<String>();
		list1.addAll(allWin1);
		driver.switchTo().window("aszxdcf");
		System.out.println(driver.getTitle());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

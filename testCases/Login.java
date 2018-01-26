package testCases;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import wdMethods.SeMethods;

public class Login extends SeMethods{

	@Test
	public void login() throws InterruptedException {		
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement userName = locateElement("username");
		type(userName, "DemoSalesManager");
		WebElement password = locateElement("password");
		type(password, "crmsfa");
		Thread.sleep(2000);
		WebElement submit = locateElement("class", "decorativeSubmit1");
		click(submit);	
		
		
		
		
		
		
		
		
		
	}

}

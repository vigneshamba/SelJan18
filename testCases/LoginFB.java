package testCases;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class LoginFB extends SeMethods{

	@Test
	public void login() throws InterruptedException {		
		startApp("chrome", "https://www.facebook.com");
		WebElement userName = locateElement("email");
		type(userName, "DemoSalesManager");
		WebElement password = locateElement("pass");
		type(password, "crmsfa");
		WebElement submit = locateElement("id", "u_0_2");
		click(submit);				
	}

}

package wdMethods;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeMethods implements WdMethods{

	RemoteWebDriver driver;
	int i=1;

	public void startApp(String browser, String url) {
		try {
			if(browser.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");		
				driver = new ChromeDriver();	
			}else if(browser.equalsIgnoreCase("firefox")){
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");		
				driver = new FirefoxDriver();	
			}
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			System.out.println("The Browser "+browser+" is launched");
		} 
		catch (NullPointerException e) {
			System.err.println("The Browser value is not matching the conditions");
		}
		catch (WebDriverException e) {
			System.err.println("Driver is not instanstiated.");
		}
		catch (Exception e) {
			System.err.println("Exception occured");
		}
		finally {
			takeSnap();
		}
	}

	public WebElement locateElement(String locator, String locValue) {
		WebElement ele = null;
		try {
			switch (locator){
			case "id":
				ele =  driver.findElementById(locValue);
			case "name":
				ele = driver.findElementByName(locValue);
			case "class":
				ele = driver.findElementByClassName(locValue);
			case "xpath":
				ele = driver.findElementByXPath(locValue);
			case "link":
				ele = driver.findElementByLinkText(locValue);
			default: ele = null;
			}
		} catch (NoSuchElementException e) {
			System.err.println("Element "+locValue+" is not found");
			throw new RuntimeException();
		}
		catch (WebDriverException e) {
			System.err.println("Browser does not exist.");
		}
		return ele;
	}

	public WebElement locateElement(String locValue) {
		return locateElement("id", locValue);		
	}

	public void type(WebElement ele, String data) {
			ele.clear();
			ele.sendKeys(data);
			System.out.println("The text field is entered with data "+data);
			takeSnap();
	}

	public void click(WebElement ele) {
		try {
			ele.click();
			System.out.println("The Element "+ele+" is clicked");
		} catch (WebDriverException e) {
			System.err.println("Browser does not exist");
		}finally {
			takeSnap();
		}
	}

	public void clickWithoutSnap(WebElement ele) {
		ele.click();
		System.out.println("The Element "+ele+" is clicked");
	}

	public String getText(WebElement ele) {
		// TODO Auto-generated method stub
		return null;
	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		// TODO Auto-generated method stub

	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		// TODO Auto-generated method stub

	}

	public boolean verifyTitle(String expectedTitle) {
		// TODO Auto-generated method stub
		return false;
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub

	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub

	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub

	}

	public void verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub

	}

	public void switchToWindow(int index) {
		// TODO Auto-generated method stub

	}

	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub

	}

	public void acceptAlert() {
		// TODO Auto-generated method stub

	}

	public void dismissAlert() {
		// TODO Auto-generated method stub

	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		return null;
	}

	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./snaps/snap"+i+".jpeg");
		try {
			FileUtils.copyFile(src, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		i++;
	}

	public void closeBrowser() {
		// TODO Auto-generated method stub

	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub

	}

}

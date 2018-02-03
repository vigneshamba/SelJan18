package leaf.Lead;

import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class DublicateLead extends ProjectMethods{

	@Test
	public void createLead() throws InterruptedException {
		click(locateElement("linkText", "Leads"));
		click(locateElement("linkText", "Find Leads"));
		click(locateElement("xpath", "//span[contains(text(),'Phone')]"));
		type(locateElement("name", "phoneNumber"), "9597704568");
		click(locateElement("xpath", "//button[contains(text(),'Find Leads')]"));
		Thread.sleep(2000);
		String txt = getText(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		clickWithNoSnap(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		click(locateElement("linkText", "Duplicate Lead"));
		click(locateElement("xpath", "//input[@name='submitButton']"));				
	}
}

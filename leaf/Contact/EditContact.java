package leaf.Contact;

import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class EditContact extends ProjectMethods{
	
	@Test
	public void createContact() throws InterruptedException {
		click(locateElement("linkText", "Contacts"));
		click(locateElement("linkText", "Find Contacts"));
		
		type(locateElement("xpath", "(//input[@name='firstName'])[3]"), "Gopinath");
		click(locateElement("xpath", "//button[contains(text(),'Find Contacts')]"));
		Thread.sleep(2000);
		
		//String sText = getText(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		click(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		click(locateElement("xpath", "//a[contains(text(),'Edit')]"));
		
		type(locateElement("id", "updateContactForm_departmentName"), "IT");
		
		click(locateElement("xpath", "//input[@class='smallSubmit']"));
		
		
		
	}

}

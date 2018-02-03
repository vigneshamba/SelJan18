package leaf.Contact;



import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class CreateContact extends ProjectMethods{
	
	@Test
	public void createContact() {
	
		click(locateElement("linkText", "Contacts"));
		click(locateElement("linkText", "Create Contact"));
		type(locateElement("id", "firstNameField"), "TestLeaf");
		type(locateElement("id", "lastNameField"), "Gopinath");
		click(locateElement("name", "submitButton"));
		
	}

}

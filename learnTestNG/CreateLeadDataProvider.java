package leaf.Lead;



import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.DataInputProvider;
import wdMethods.ProjectMethods;

public class CreateLeadDataProvider extends ProjectMethods{

	
	@Test (dataProvider="fetchData")
	public void createLead(String companyName, String fName,String lName) {
		click(locateElement("linkText", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"), companyName);
		type(locateElement("id", "createLeadForm_firstName"), fName);
		type(locateElement("id", "createLeadForm_lastName"), lName);
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"), "8768767");
		click(locateElement("name", "submitButton"));
	}
	
	
	
		@DataProvider(name = "fetchData")
		public Object[][] getData1() throws IOException{			
			DataInputProvider dp = new DataInputProvider();
			Object[][] data = dp.readExcel("CreateLead");			
			return data;
		
	}	
}













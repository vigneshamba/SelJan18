package leaf.Lead;



import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.DataInputProvider;
import wdMethods.ProjectMethods;

public class CreateLeadDataProvider extends ProjectMethods{

	
	@Test(dataProvider="fetchData"
			,dataProviderClass=util.DataInputProvider.class)
	public void createLead(String cName,String fName,String lName) {	
		click(locateElement("linkText", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"), cName);
		type(locateElement("id", "createLeadForm_firstName"), fName);
		type(locateElement("id", "createLeadForm_lastName"), lName);
		type(locateElement("id", "createLeadForm_primaryEmail"), "gopinath@testleaf.com");
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"), "9597704568");
		click(locateElement("name", "submitButton"));	
	}
/*	@DataProvider(name="fetchData")
	public String[][] getData() {
		String[][] data = new String[2][3];
		data[0][0]="TestLeaf";
		data[0][1]="gopi";
		data[0][2]="J";
		
		data[1][0]="TestLeaf";
		data[1][1]="Sarath";
		data[1][2]="M";
		return data;
	}*/
	
	
	
	
	
	
	
	
	
	
}













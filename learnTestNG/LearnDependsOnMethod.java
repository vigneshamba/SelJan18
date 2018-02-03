package learnTestNG;

import org.testng.annotations.Test;

public class LearnDependsOnMethod {
	
	@Test
	public void createLead() {
		System.out.println("createLead");
		throw new RuntimeException();
	}
	@Test(dependsOnMethods="learnTestNG.LearnDependsOnMethod.createLead"
			,alwaysRun=true)
	public void editLead() {
		System.out.println("editLead");
	}

	@Test//(dependsOnMethods="learnTestNG.LearnDependsOnMethod.createLead")
	public void deleteLead() {
		System.out.println("deleteLead");
	}==
	
	@Test(enabled=false)
	public void mergeLead() {
		System.out.println("mergeLead");
	}

}

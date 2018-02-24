package collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import freemarker.core.CollectionAndSequence;

public class NewListClass {
	
	public static void main(String[] args) {		
		//<Generic>
		List<String> compList = new LinkedList<String>();		
		compList.add("Infosys");
		compList.add("hCL");
		compList.add("TCS");
		compList.add("Google");	
		compList.add("HCL");		
		
		Collections.sort(compList);
		
		for (String eachComp : compList) {
			System.out.println(eachComp);
		}
		
		
		
			
	/*	System.out.println(compList);
		System.out.println(compList.size());
		System.out.println(compList.get(2));
		System.out.println(compList.contains("TCS"));
		compList.remove("HCL");
		System.out.println(compList);
		
		compList.add("TCS");
		compList.remove("TCS");
		System.out.println(compList);
		
		System.out.println(compList.isEmpty());
		compList.clear();
		
		
		
		*/
		
		
		
	}

}

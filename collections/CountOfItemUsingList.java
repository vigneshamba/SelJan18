package collections;

import java.util.LinkedList;
import java.util.List;

public class CountOfItemUsingList {
	
	public static void main(String[] args) {
		
		List<String> comp = new LinkedList<String>();
		
		comp.add("HCL");
		comp.add("Paypal");
		comp.add("HCL");
		comp.add("Infosys");
		comp.add("HCL");		
		
		int count = comp.size();
		int i=0;
		for (String company : comp) {
			if(company.equals("HCL")){
				i++;
			}			
		}		
		System.out.println(i);
		
		
	}

}










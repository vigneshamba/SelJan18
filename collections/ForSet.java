package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ForSet {
	
	public static void main(String[] args) {
		
		Set<String> comp = new LinkedHashSet<String>();
		comp.add("TCS");
		comp.add("HCL");
		comp.add("InfoSys");
		comp.add("CTS");
		comp.add("HCL");
		
		System.out.println(comp);
		
		System.out.println(comp.size());
		
		comp.remove("HCL");
		System.out.println(comp.contains("HCL"));
		
		comp.clear();
		
		System.out.println(comp.isEmpty());
		
		
		
	}

}






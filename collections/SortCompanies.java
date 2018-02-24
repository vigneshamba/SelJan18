package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortCompanies {

	
	public static void main(String[] args) {
		
		SortCompanies sc = new SortCompanies();
		sc.sort1();
	
	}
	
	//Way 1
	public void sort1(){
		String[] companies =
			{"TCS","Infosys", "Hexaware", "HCL"};

		Arrays.sort(companies);
		for (int i = 0; i < companies.length ; i++) {
			System.out.println(companies[i]);
		}
	}
	
	//Way 2
	public void sort2(){
		List<String> companies = new ArrayList<String>();
		companies.add("TCS");
		companies.add("Infosys");
		companies.add("Hexaware");
		companies.add("HCL");
		Collections.sort(companies);
		for (int i = 0; i < companies.size() ; i++) {
			System.out.println(companies.get(i));
		}
	}
	
	//Way 3
	public void sort3(){
		Set<String> companies = new TreeSet<String>();
		companies.add("TCS");
		companies.add("Infosys");
		companies.add("Hexaware");
		companies.add("HCL");
		for (String company : companies) {
			System.out.println(company);
		}
		
	}
}

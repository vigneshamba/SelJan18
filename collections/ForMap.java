package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class ForMap {
	
	public static void main(String[] args) {
		
		//need each character count
		String company = "Interview";
		char[] ch = company.toCharArray();
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (char c : ch) {			
			if(map.containsKey(c)){
				int val = map.get(c)+1;
				map.put(c, val);
			}			else{
				map.put(c, 1);
			}		
		}		
		System.out.println(map);
		
		
		
		
		
		
		
		
		//Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		/*
		map.put('S', 3);
		map.put('J', 1);
		map.put('A', 1);
		map.put('J', 2);
		
		
		for (Entry<Character, Integer> eachChar : map.entrySet()) {
			
			System.out.println("Key : "+eachChar.getKey()+"--->"
								+"Value : "+eachChar.getValue());
			
		}
		
		
		
		
		
		
		System.out.println(map.entrySet());
		
		System.out.println(map.get('S'));
		
		map.remove('J');
		
		System.out.println(map.containsKey('J'));
		
		
		
		*/
	}

}








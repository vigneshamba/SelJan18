package collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class GetCountOfEachCharacter {

	public static void main(String[] args) {

		// Lets write Psuedocode first
		// Goal ?? Count of every character in a String

		// 1, Convert the string to the character array >> toCharArray()
		// 2, Create a map with Key as Character and Value as Integer >> LinkedHashMap<Character, Integer>();
		// 3, Loop through each character (use foreach) from character array
		// 4, If the character is already in map key >> containsKey
		//	  then increment the count with 1
		// 4, If not add to the map >> put(k,1)

		String company = "Amazon India Development Center";		

		char[] allChars= company.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (char c : allChars) {

			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);

			}else{
				map.put(c, 1);
			}
		}

		System.out.println(map);
	}
}



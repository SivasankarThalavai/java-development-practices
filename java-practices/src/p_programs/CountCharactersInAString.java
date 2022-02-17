package p_programs;

import java.util.HashMap;
import java.util.Map;

public class CountCharactersInAString {

	public static void main(String[] args) {

		String myStr = "Sivasankar Thalavai";

		countCharacters(myStr);
	}

	private static void countCharacters(String myStr) {

		HashMap<Character, Integer> hMap = new HashMap<Character, Integer>();

		char[] str_array = myStr.toCharArray();

		for (char c : str_array) {
			if (hMap.containsKey(c)) {
				hMap.put(c, hMap.get(c) + 1);
			} else {
				hMap.put(c, 1);
			}
		}

		for (Map.Entry entry : hMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}

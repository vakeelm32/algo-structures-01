package windowsliding;

import java.util.HashMap;

public class CountVowels {

	public static void main(String[] args) {
		
		HashMap<Character, Integer> map = new HashMap<>();
		String str = "AECBEOUI";
		int k = 4;

		for (int i = 0; i < k; i++) {
			char element = str.charAt(i);
			if (map.get(element) != null) {
				map.put(element, map.get(element) + 1);
			} else {
				map.put(element, 1);
			}
		}
		
		int nofUniqueVowels = getNofUniqueVowels(map);
		System.out.println(nofUniqueVowels);

		for (int j = 1; j < str.length() - k + 1; j++) {

			char elementToBeDeleted = str.charAt(j - 1);
			char elementToBeAdded = str.charAt(j + k - 1);
			
			map.remove(elementToBeDeleted);
			
			if (map.get(elementToBeAdded) != null) {
				map.put(elementToBeAdded, map.get(elementToBeAdded) + 1);
			} else {
				map.put(elementToBeAdded, 1);
			}
			System.out.println(getNofUniqueVowels(map));
		}

	}

	static public int getNofUniqueVowels(HashMap<Character, Integer> map) {
		char[] vowels = { 'A', 'E', 'I', 'O', 'U' };
		int count = 0;
		for (char vowel : vowels) {
			if (map.get(vowel) != null && map.get(vowel) > 0) {
				count++;
			}
		}
		return count;
	}
}

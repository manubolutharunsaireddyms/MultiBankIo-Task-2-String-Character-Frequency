package characterfrequency;

import java.util.*;

public class CharacterFrequency {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		Map<Character, Integer> map = new HashMap<>();
		for (char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}

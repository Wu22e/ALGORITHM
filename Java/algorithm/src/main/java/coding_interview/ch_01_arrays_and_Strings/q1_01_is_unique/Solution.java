package coding_interview.ch_01_arrays_and_Strings.q1_01_is_unique;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static boolean isUnique(String s) {
        Set<Character> chars = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (chars.contains(c)) {
                return false;
            }
            chars.add(c);
        }
        return true;
    }

    public static void main(String[] args) {
		String[] words = {"abcde", "hello", "apple", "kite", "padle"};
		for (String word : words) {
			System.out.println(word + ": " + isUnique(word));
		}
	}
}

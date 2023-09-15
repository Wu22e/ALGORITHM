package coding_interview.ch_01_arrays_and_Strings.q1_02_check_permutation;

import java.util.Arrays;

public class Solution {
    private static String sort(String s) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    public static boolean isPermutationRelation(String s1, String s2) {
        return sort(s1).equals(sort(s2));
    }

    public static void main(String[] args) {
		String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
		for (String[] pair : pairs) {
			String word1 = pair[0];
			String word2 = pair[1];
			boolean anagram = isPermutationRelation(word1, word2);
			System.out.println(word1 + ", " + word2 + ": " + anagram);
		}
	} 
}

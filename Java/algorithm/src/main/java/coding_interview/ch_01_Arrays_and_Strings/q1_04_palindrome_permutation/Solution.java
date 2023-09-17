package coding_interview.ch_01_Arrays_and_Strings.q1_04_palindrome_permutation;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        String pali = "Rats live on no evil star";
        System.out.println(isPermutationPalindrome(pali));
    }

    public static boolean isPermutationPalindrome(String s) {
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            char lowerCase = Character.toLowerCase(c);
            if (c == ' ') continue;
            characterIntegerMap.put(lowerCase, characterIntegerMap.getOrDefault(lowerCase, 0) + 1);
        }

        int oddCount = 0;
        for (Integer charCount : characterIntegerMap.values()) {
             if (charCount % 2 == 1) ++oddCount;
             if (oddCount > 1) return false;
        }

        return true;
    }
}



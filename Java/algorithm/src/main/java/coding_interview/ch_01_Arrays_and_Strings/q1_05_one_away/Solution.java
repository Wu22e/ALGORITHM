package coding_interview.ch_01_Arrays_and_Strings.q1_05_one_away;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isPossibleWithinOneTrial("pale", "ple"));
        System.out.println(isPossibleWithinOneTrial("pales", "pale"));
        System.out.println(isPossibleWithinOneTrial("pale", "bale"));
        System.out.println(isPossibleWithinOneTrial("pale", "bake"));
        System.out.println(isPossibleWithinOneTrial("pppe", "pae"));
    }

    public static boolean isPossibleWithinOneTrial(String s1, String s2) {
        int diffLength = s1.length() - s2.length();
        if (diffLength == 1) {
            return insert(s2, s1);
        }
        if (diffLength == -1) {
            return insert(s1, s2);
        }
        if (diffLength == 0) {
            return exchange(s1, s2);
        }
        return false;
    }

    private static boolean exchange(String s1, String s2) {
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        int count = 0;
        for (int idx = 0; idx < chars1.length; idx++) {
            if (chars1[idx] != chars2[idx]) {
                count++;
            }
            if (count >= 2) {
                return false;
            }
        }
        return true;
    }

    private static boolean insert(String s1, String s2) {
        int idx1 = 0;
        int idx2 = 0;
        int countOverTwoDiff = 0;

        while (idx1 < s1.length() && idx2 < s2.length()) {
            if (s1.charAt(idx1) != s2.charAt(idx2)) {
                if (countOverTwoDiff >= 2) {
                    return false;
                }
                ++countOverTwoDiff;
                ++idx2;
            } else {
                ++idx1;
                ++idx2;
            }
        }

        return true;
    }
}


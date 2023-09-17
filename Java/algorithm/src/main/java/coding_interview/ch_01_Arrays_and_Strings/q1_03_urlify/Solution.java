package coding_interview.ch_01_Arrays_and_Strings.q1_03_urlify;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    private static final String blank = "%20";

    public static void main(String[] args) {
        String s = "Mr John Smith    ";
        System.out.println(makeURL(s));
    }

    static public String makeURL(String s) {
        String[] splitString = s.split(" ");
        return Arrays.stream(splitString).collect(Collectors.joining(blank));
    }
}

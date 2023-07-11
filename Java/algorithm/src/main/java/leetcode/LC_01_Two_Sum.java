package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LC_01_Two_Sum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 7, 11, 15};
        int[] indexArr = solution.twoSum1(nums, 9);
        System.out.println(Arrays.toString(indexArr));
    }

    static class Solution {
        // time  : o(n^2)
        // space : o(1)
        public int[] twoSum1(int[] nums, int target) {
            int[] answer = new int[2];
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < i; j++) {
                    if (nums[i] + nums[j] == target) {
                        answer[0] = j;
                        answer[1] = i;
                    }
                }
            }
            return answer;
        }

        // time  : o(n)
        // space : o(n)
        public int[] twoSum2(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int cur = nums[i];
                int x = target - cur;
                if (map.containsKey(x)) {
                    return new int[]{map.get(x), i};
                }
                map.put(cur, i);
            }
            return null;
        }
    }
}

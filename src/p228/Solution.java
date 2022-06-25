package p228;

import java.util.ArrayList;
import java.util.List;

/**
 * 228. Summary Ranges
 * https://leetcode.com/problems/summary-ranges/
 */
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            int j = i;
            while (j < nums.length - 1 && nums[j + 1] == nums[j] + 1) {
                j++;
            }
            if (i == j) {
                result.add(String.valueOf(nums[j]));
            } else if (i < j) {
                result.add(nums[i] + "->" + nums[j]);
            }
            i = j + 1;
        }
        return result;
    }
}

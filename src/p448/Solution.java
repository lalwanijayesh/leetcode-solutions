package p448;

import java.util.ArrayList;
import java.util.List;

/**
 * 448. Find All Numbers Disappeared in an Array
 * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
 */
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] counts = new int[nums.length];
        for (int num : nums) {
            counts[num - 1]++;
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] == 0) {
                res.add(i + 1);
            }
        }
        return res;
    }
}

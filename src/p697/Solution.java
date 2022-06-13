package p697;

import java.util.Arrays;

/**
 * 697. Degree of an Array
 * https://leetcode.com/problems/degree-of-an-array/
 */
class Solution {
    public int findShortestSubArray(int[] nums) {
        int[] first = new int[50000];
        Arrays.fill(first, -1);
        int[] last = new int[50000];
        int[] counts = new int[50000];
        for (int i = 0; i < nums.length; i++) {
            if (first[nums[i]] == -1) {
                first[nums[i]] = i;
            }
            last[nums[i]] = i;
            counts[nums[i]]++;
        }
        int max = 0;
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > max) {
                max = counts[i];
                result = last[i] - first[i] + 1;
            } else if (counts[i] == max) {
                result = Math.min(result, last[i] - first[i] + 1);
            }
        }
        return result;
    }
}

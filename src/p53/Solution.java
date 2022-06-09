package p53;

/**
 * 53. Maximum Subarray
 * https://leetcode.com/problems/maximum-subarray/
 */
class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int current = 0;
        for (int num : nums) {
            current = Math.max(current + num, num);
            max = Math.max(current, max);
        }
        return max;
    }
}
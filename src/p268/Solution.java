package p268;

/**
 * 268. Missing Number
 * https://leetcode.com/problems/missing-number/
 */
class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int n = nums.length;
        int expected = n * (n + 1) / 2;
        return expected - sum;
    }
}
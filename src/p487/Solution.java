package p487;

/**
 * 487. Max Consecutive Ones II
 * https://leetcode.com/problems/max-consecutive-ones-ii/
 */
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int prev = 0;
        int curr = 0;
        for (int num : nums) {
            if (num == 1) {
                curr++;
            } else {
                max = Math.max(max, prev + curr);
                prev = curr + 1;
                curr = 0;
            }
        }
        return Math.max(max, prev + curr);
    }
}
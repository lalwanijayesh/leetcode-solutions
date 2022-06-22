package p136;

/**
 * 136. Single Number
 * https://leetcode.com/problems/single-number/
 */
class Solution {
    public int singleNumber(int[] nums) {
        int x = 0;
        for (int num : nums) {
            x ^= num;
        }
        return x;
    }
}

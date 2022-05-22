package p905;

/**
 * 905. Sort Array By Parity
 * https://leetcode.com/problems/sort-array-by-parity/
 */
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int curr = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                int temp = nums[curr];
                nums[curr] = nums[i];
                curr++;
                nums[i] = temp;
            }
        }
        return nums;
    }
}

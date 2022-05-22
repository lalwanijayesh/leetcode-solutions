package p977;

/**
 * 977. Squares of a Sorted Array
 * https://leetcode.com/problems/squares-of-a-sorted-array/
 */
class Solution {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            nums[i] = nums[i] * nums[i];
        }
        int[] sorted = new int[len];
        int left = 0;
        int right = len - 1;
        int idx = len - 1;
        while (left <= right) {
            if (nums[left] > nums[right]) {
                sorted[idx--] = nums[left];
                left++;
            } else {
                sorted[idx--] = nums[right];
                right--;
            }
        }
        return sorted;
    }
}

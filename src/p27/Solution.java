package p27;

/**
 * 27. Remove Element
 * https://leetcode.com/problems/remove-element/
 */
class Solution {
    public int removeElement(int[] nums, int val) {
        int last = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[last] = nums[i];
                last++;
            }
        }
        return last;
    }
}
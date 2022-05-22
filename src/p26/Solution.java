package p26;

/**
 * 26. Remove Duplicates from Sorted Array
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        int curr = nums[0];
        int k = 1;
        int i = 1;
        while (i < nums.length) {
            if (nums[i] != curr) {
                nums[k] = nums[i];
                curr = nums[i];
                k++;
            }
            i++;
        }
        return k;
    }
}

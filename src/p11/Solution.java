package p11;

/**
 * 11. Container With Most Water
 * https://leetcode.com/problems/container-with-most-water/
 */
class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int l = 0;
        int r = height.length - 1;
        while (l < r) {
            int amt = Math.min(height[l], height[r]) * (r - l);
            if (amt > max) {
                max = amt;
            }
            if (height[l] <= height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return max;
    }
}

package p349;

import java.util.HashSet;
import java.util.Set;

/**
 * 349. Intersection of Two Arrays
 * https://leetcode.com/problems/intersection-of-two-arrays/
 */
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] counts = new int[1001];
        for (int num : nums1) {
            counts[num] = 1;
        }
        Set<Integer> common = new HashSet<>();
        for (int num : nums2) {
            if (counts[num] > 0) {
                common.add(num);
            }
        }
        int[] ans = new int[common.size()];
        int i = 0;
        for (int num : common) {
            ans[i++] = num;
        }
        return ans;
    }
}
